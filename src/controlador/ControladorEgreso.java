package controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import servicios.AdministradorDatos;
import modelo.Vehiculo;
import vista.VistaEgreso;

public class ControladorEgreso {
    
    public static VistaEgreso vistaEgreso = new VistaEgreso();
    public static void mostrar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenY = screenSize.height;
        int screenX = screenSize.width;
        double offsetX = -0.75;
        double offsetY = 1.8;
        vistaEgreso.setLocation((int) (screenX/2-vistaEgreso.getSize().width*offsetX),(int)(screenY/2-vistaEgreso.getSize().height/offsetY));
        vistaEgreso.setVisible(true);
    }
    public static void ocultar() { vistaEgreso.setVisible(false); }
    
    private static Vehiculo vehiculo = new Vehiculo();
    private static double tarifaVehiculo;
   
    public static Vehiculo llenarDatos(String patente){
        
        vehiculo = AdministradorDatos.BuscarVehiculo(patente);
        return vehiculo;
    }

    public static double calcularTarifa(String patente) {
        
        vehiculo = AdministradorDatos.BuscarVehiculo(patente);
        
        
       //LocalTime horaEgreso = LocalDateTime.now().toLocalTime();
        //LocalDateTime fechaEgreso = horaEgreso.atDate(LocalDate.now());
        
        LocalDateTime fechaEgreso = LocalDateTime.now();
        vehiculo.setFechaEgreso(fechaEgreso);

//        System.out.println(horaEgreso);
//        System.out.println(fechaEgreso);
        
        LocalTime horaIngreso = vehiculo.getFechaIngreso().toLocalTime();
        LocalTime horaEgreso = vehiculo.getFechaEgreso().toLocalTime();
        
        System.out.println(horaIngreso);
        System.out.println(horaEgreso);
        
        LocalTime horaTotal = horaEgreso.minusHours(horaIngreso.getHour()).minusMinutes(horaIngreso.getMinute());
       // LocalTime horaMasTotal = horaTotal.minusMinutes(horaEgreso.getMinute());
           
        System.out.println("Hora Total: "+horaTotal);
//        System.out.println("Hora Definitiva: "+horaMasTotal);
        
        int cantidadMinutos = horaTotal.getHour()*60 + horaTotal.getMinute();
        
        System.out.println("Cantidad de Minutos: "+cantidadMinutos);
         
        int cantidadHoras = cantidadMinutos/60;
        int cantidadMinutosRestantes = cantidadMinutos - cantidadHoras*60;
        
        if(cantidadMinutosRestantes > 10){
            cantidadHoras++;
        }
        
        System.out.println("Cantidad de Horas: "+cantidadHoras);
        
        tarifaVehiculo = vehiculo.getTarifa().getPrecio()*cantidadHoras + vehiculo.getLugar().getPrecio();
        
        System.out.println("Tarifa total: "+tarifaVehiculo);
        
        return tarifaVehiculo;
    }

    public static void EliminarVehiculo(String patente){
        
             
        vehiculo = AdministradorDatos.BuscarVehiculo(patente);
        
        if(vehiculo != null){
            AdministradorDatos.CambiarEstadoLugar(vehiculo.getLugar().getNumero());
            AdministradorDatos.EliminarVehiculo(vehiculo);
        
        }else{
//            JOptionPane.showMessageDialog(vistaEgreso, "Error al eliminar vehiculo");
            System.out.println("Error al eliminar vehiculo");
        }
        
        //AdministradorDatos.Imprimir();
        
    }




//    public static void llenarDatos(String patente) {
//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo = AdministradorDatos.BuscarVehiculo(patente);
//        if (vehiculo.getAuto() != null) {
//        }
//
//        if (vehiculo.getMoto() != null) {
//
//        }
//
//        if (vehiculo.getCamioneta() != null) {
//
//        }
//    }
}
