package controlador;

import javax.swing.table.DefaultTableModel;
import vista.VistaLugares;

public class ControladorLugares {
    
    public static VistaLugares vistaLugares = new VistaLugares();
    
    public static int buscarLugar(DefaultTableModel datos, int filaSelec){        
        int lugar=0;
        
        for (int i = 0; i < datos.getRowCount(); i++) {
            //System.out.println("i: " + i);
            //System.out.println("Fila Seleccionada: " + ((Integer) vistaLugares.FilaSeleccionada()));
            //System.out.println("Fila Seleccionada + i: " + (vistaLugares.FilaSeleccionada()+i+1));
            //System.out.println("Fila Seleccionada + i: " + filaSelec);
            
            if(datos.getValueAt(i, 2).equals(true) && (filaSelec) == i){
                lugar = (int) datos.getValueAt(i, 0);
            }
        }
        return lugar;
    }
    
    public static void ActualizarGrilla(){
        vistaLugares.Actualizar();
    }
}
