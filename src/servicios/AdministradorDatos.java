package servicios;

import java.util.ArrayList;
import java.util.Arrays;
import modelo.Estado;
import modelo.Lugar;
import modelo.Lugar;
import modelo.Persona;
import modelo.Tarifa;
import modelo.Vehiculo;

public class AdministradorDatos {
    
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Lugar> lugares = new ArrayList<>();
    
    private static Persona usuario1 = new Persona("Rocio", "1234");
    private static Persona usuario2 = new Persona("Lucas", "1234");
    private static Persona usuario3 = new Persona("Luciano", "1234");
    private static Persona usuario4 = new Persona("Valentina", "1234");
    private static Persona usuario5 = new Persona("Santiago", "1234");
    
    private static ArrayList<Persona> usuarios = new ArrayList<>(Arrays.asList(usuario1, usuario2, usuario3,usuario4, usuario5));
    
    public static void AgregarVehiculo(Vehiculo vehiculo){        
        vehiculos.add(vehiculo);    
    }
    
    public static void EliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
        
//    public static void AgregarLugar(Lugar lugar){  
//        lugares.add(lugar);
//    }
    
    public static Vehiculo BuscarVehiculo(String patente){
                
        Vehiculo vbuscado = new Vehiculo();
        
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getPatente().equals(patente)){
                vbuscado = vehiculo;
                return vbuscado;
            }
        }
        
        return null;
    }  
    
    public static Lugar BuscarLugar(int nroLugar){
        
        Lugar lbuscado = new Lugar();
        
        for(Lugar lugar : lugares){
            if(lugar.getNumero() == nroLugar){
                lbuscado = lugar;
                break;
            }
        }
        
        return lbuscado;
        
    }
    
    
    
    public static Tarifa ObtenerTarifas(String nombreVehiculo){
    
       Tarifa tarifa = new Tarifa();
        
        if(nombreVehiculo.equals("Auto")){
            tarifa.setPrecio(120);        
        }else if(nombreVehiculo.equals("Moto")){
            tarifa.setPrecio(70);
        }else if(nombreVehiculo.equals("Camioneta")){
            tarifa.setPrecio(150);
        }
 
        return tarifa;
    }
    
    
    public static void Imprimir(){
    
//        for(Vehiculo vehiculo : vehiculos){
//            System.out.println(vehiculo.getPatente());
//            System.out.println(vehiculo.getFechaIngreso());
//            System.out.println(vehiculo.getAuto().getCantidadPuertas());
//            System.out.println(vehiculo.getLugar().getEstado());
//           // System.out.println(vehiculo.getPersona().getNombre());
//        }
        
        for(Lugar lugar : lugares){
            System.out.println(lugar.getNumero());
            System.out.println(lugar.getPrecio());
            System.out.println(lugar.isTecho());
            System.out.println(lugar.getEstado());
        }
    
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static ArrayList<Lugar> getLugares() {
        return lugares;
    }
    
    public static ArrayList<Persona> getUsuarios() {
        return usuarios;
    }
    
    //AGREGADO
    
    //Para inicializar el array de lugares
    public static void setLugares(){
        Lugar lugar = new Lugar();
        Estado estado = Estado.LIBRE;
        double precioTecho = 50;
        
        for(int i = 1; i <= 30; i++){
            
            if(i <= 10){
                lugar = new Lugar(i,true,precioTecho, estado);
            }else{
                lugar = new Lugar(i,false,0.00,estado);
            }
            lugares.add(lugar);
        }
    }
    
  /*  public static Lugar ActualizarLugar(int nroLugar){
        Lugar lugarDeEstacionamiento = new Lugar(); 
        
        for (Lugar lugar : lugares) {
            if(lugar.getNumero() == nroLugar){
                lugar.estado = Estado.OCUPADO;
                lugarDeEstacionamiento = lugar;              
                break;
            }
        }
        return lugarDeEstacionamiento;
    }    
    */
    public static void CambiarEstadoLugar(int nroLugar){
        
              
        for (Lugar lugar : lugares) {
            
            if(lugar.getNumero() == nroLugar){
            if(lugar.getEstado() == Estado.OCUPADO){
                lugar.setEstado(Estado.LIBRE);
                break;
            }else if(lugar.getEstado() == Estado.LIBRE){
                lugar.setEstado(Estado.OCUPADO);
                break;
            }
            }
        }
    }

    
}
