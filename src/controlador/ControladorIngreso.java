package controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import servicios.AdministradorDatos;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Lugar;
import modelo.Persona;
import modelo.*;
import vista.VistaIngreso;

public class ControladorIngreso {

    public static Lugar lugar;
    public static Vehiculo vehiculo = null;

    public static VistaIngreso vistaIngreso = new VistaIngreso();

    public static void mostrar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenY = screenSize.height;
        int screenX = screenSize.width;
        vistaIngreso.setLocation((int) (screenX / 2 - vistaIngreso.getSize().width / 0.64), (int) (screenY / 2 - vistaIngreso.getSize().height / 1.8));
        vistaIngreso.setVisible(true);
    }

    public static void ocultar() {
        vistaIngreso.setVisible(false);
    }

    public static void ingresoVehiculo(String patente, int numeroLugar, String tipoVehiculo, String datoParticular) {

        //   boolean techo = false;
        //   double precioTecho = 0;
        Tarifa tarifa;

        int bandera = 1;
        LocalDateTime fechaIngreso = LocalDateTime.now();

        //   if(numeroLugar <= 10){
        //       techo = true;
        //       precioTecho = 50;
        //  }
        // lugar = new Lugar(numeroLugar, techo, precioTecho);
        lugar = AdministradorDatos.BuscarLugar(numeroLugar);
        vehiculo = AdministradorDatos.BuscarVehiculo(patente);

        switch (tipoVehiculo) {
            case "Auto":
                if (!(Integer.parseInt(datoParticular) >= 2 && Integer.parseInt(datoParticular) <= 5)) {
                    bandera = 0;
                    JOptionPane.showMessageDialog(vistaIngreso, "La cantidad de puertas no es válida");
                }
                break;
            case "Camioneta":
                if (!(Integer.parseInt(datoParticular) == 1 || Integer.parseInt(datoParticular) == 2)) {
                    bandera = 0;
                    JOptionPane.showMessageDialog(vistaIngreso, "El tipo de cabina de la camioneta no es váilda");
                }
                break;
            case "Moto":
                if (!(Integer.parseInt(datoParticular) >= 50 && Integer.parseInt(datoParticular) <= 2500)) {
                    bandera = 0;
                    JOptionPane.showMessageDialog(vistaIngreso, "La cilindrada del vehículo no es válida");
                }
                break;

        }

        if (bandera == 1) {
            if (lugar.getEstado() == Estado.OCUPADO) {
                JOptionPane.showMessageDialog(vistaIngreso, "El lugar seleccionado se encuentra ocupado");
            } else if (vehiculo == null) {
                System.out.println("null");
                AdministradorDatos.CambiarEstadoLugar(numeroLugar);

                tarifa = AdministradorDatos.ObtenerTarifas(tipoVehiculo);
                switch (tipoVehiculo) {
                    case "Auto":
                        Auto auto = new Auto(Integer.parseInt(datoParticular));
                        vehiculo = new Vehiculo(patente, fechaIngreso, lugar, auto, tarifa);
                        break;

                    case "Moto":
                        Moto moto = new Moto(Integer.parseInt(datoParticular));
                        vehiculo = new Vehiculo(patente, fechaIngreso, lugar, moto, tarifa);
                        break;

                    case "Camioneta":
                        Camioneta camioneta = new Camioneta(Integer.parseInt(datoParticular));
                        vehiculo = new Vehiculo(patente, fechaIngreso, lugar, camioneta, tarifa);
                        break;
                }
                AdministradorDatos.AgregarVehiculo(vehiculo);

                //AdministradorDatos.Imprimir();
            } else if (AdministradorDatos.BuscarVehiculo(patente).getPatente().equals(patente)) {
                JOptionPane.showMessageDialog(vistaIngreso, "La patente ingresada ya se encuentra registrada");
            }
        }
    }

    public static void setLugar(String Numerolugar) {
        vistaIngreso.actualizarLugar(Numerolugar);
    }

}
