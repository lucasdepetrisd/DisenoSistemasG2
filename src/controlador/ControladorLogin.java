/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import servicios.AdministradorDatos;
import modelo.Persona;
import vista.VistaLogin;

/**
 *
 * @author vales
 */
public class ControladorLogin {
    public static VistaLogin vistaLogin = new VistaLogin();
    public static void mostrar() { vistaLogin.setVisible(true);  }
    public static void ocultar() { vistaLogin.setVisible(false); }
    
    public static Persona IniciarSesion(String nombre, String contraseña) {

        ArrayList<Persona> usuarios = AdministradorDatos.getUsuarios();
        Persona usuarioIngresado = null;

        for (Persona usuario : usuarios) {
            if ((nombre.equalsIgnoreCase(usuario.getNombre())) && (contraseña.equalsIgnoreCase(usuario.getContraseña()))) {
                usuarioIngresado = usuario;
                break;
            }
        }

        return usuarioIngresado;
    }

    /*  public static Boolean IniciarSesion(String nombre, String contraseña) {

        Boolean resultado = false;

        ArrayList<Persona> usuarios = AdministradorDatos.getUsuarios();
        Persona usuarioIngresado = null;

        for (Persona usuario : usuarios) {
            if ((nombre.equalsIgnoreCase(usuario.getNombre())) && (contraseña.equalsIgnoreCase(usuario.getContraseña()))) {
                usuarioIngresado = usuario;
                break;
            }
        }

        if (usuarioIngresado == null) {
            resultado = false;
        }else if(usuarioIngresado != null){
            resultado = true;
        }

        return resultado;
    }
     */
}
