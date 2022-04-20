package controlador;
import vista.*;
import java.awt.Toolkit;
import java.awt.Dimension;
        
public class ControladorInicio {
    public static VistaInicio vistaInicio = new VistaInicio();
    public static void mostrar() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenY = screenSize.height;
        int screenX = screenSize.width;
        vistaInicio.setLocation(screenX/2-vistaInicio.getSize().width/2,(int)(screenY/2-vistaInicio.getSize().height/0.6));
        vistaInicio.setVisible(true);
    }
    
    public static void ocultar() { vistaInicio.setVisible(false); }
    
    public static void botonIngreso() {
        ControladorIngreso.mostrar();
    }

    public static void botonEgreso(){
        ControladorEgreso.mostrar();
    }
    
    public static void botonListado(){
        ControladorListado.mostrar();
    }
   
    
}