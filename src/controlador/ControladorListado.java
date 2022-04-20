package controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import servicios.AdministradorDatos;
import modelo.Vehiculo;
import vista.VistaListado;

public class ControladorListado {
    
    public static VistaListado vistaLista = new VistaListado();
    public static void mostrar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenY = screenSize.height;
        int screenX = screenSize.width;
        vistaLista.setLocation((int) (screenX/2-vistaLista.getSize().width/2),(int)(screenY/2-vistaLista.getSize().height/1.8));
        vistaLista.setVisible(true);
    }
    public static void ocultar() { vistaLista.setVisible(false); }
    
    public static void actualizarLista() {
        vistaLista.actualizar();
        vistaLista.CentrarDatos();
    }
    
    public static DefaultTableModel llenarTabla() {
        
        DefaultTableModel datos = new DefaultTableModel();

        datos.addColumn("N° Lugar");
        datos.addColumn("Patente");
        datos.addColumn("Tipo Vehiculo");
        datos.addColumn("Dato Particular");
        datos.addColumn("Ingreso");

        for (Vehiculo vehiculo : AdministradorDatos.getVehiculos()) {
        
              if (vehiculo.getAuto() != null) {
                Object[] fila = {
                    vehiculo.getLugar().getNumero(),
                    vehiculo.getPatente(),
                    "Auto",
                    vehiculo.getAuto().getCantidadPuertas(),
                    vehiculo.getFechaIngreso()                
                };
                
                datos.addRow(fila);                                
            }
            
            if (vehiculo.getMoto() != null) {
                Object[] fila = {
                    vehiculo.getLugar().getNumero(),
                    vehiculo.getPatente(),
                    "Moto",
                    vehiculo.getMoto().getCilidrada(),
                    vehiculo.getFechaIngreso()
                };
                
                datos.addRow(fila);
            }
            
            if (vehiculo.getCamioneta() != null) {
                Object[] fila = {
                    vehiculo.getLugar().getNumero(),
                    vehiculo.getPatente(),
                    "Camioneta",
                    vehiculo.getCamioneta().getCabina(),
                    vehiculo.getFechaIngreso()
                };
                datos.addRow(fila);
           }         
        
        }        
        return datos;
    } 
}

