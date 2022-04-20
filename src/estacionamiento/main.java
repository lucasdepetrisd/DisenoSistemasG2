package estacionamiento;

//import vista.*;
import controlador.*;
import servicios.AdministradorDatos;

public class main {

    public static void main(String[] args) {
        //VistaInicio inicio = new VistaInicio();
        //inicio.setVisible(true);
        
        ControladorLogin.mostrar();

        //Para inicializar el array de lugares
        AdministradorDatos.setLugares();
        
        /*ControladorIngreso.mostrar();
        ControladorEgreso.mostrar();
        ControladorListado.mostrar();*/
    }
}
