package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author vales
 */
public class Vehiculo {
    private String patente;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaEgreso;
    private Persona persona;
    private Tarifa tarifa;
    private Lugar lugar;
    private Auto auto;
    private Moto moto;
    private Camioneta camioneta;
    

    public Vehiculo(String patente, LocalDateTime fechaIngreso, LocalDateTime fechaEgreso) {
        this.patente = patente;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

 

    public Vehiculo(String patente, LocalDateTime fechaIngreso, Lugar lugar, Auto auto, Tarifa tarifa) {
        this.patente = patente;
        this.fechaIngreso = fechaIngreso;
        this.persona = persona;
        this.tarifa = tarifa;
        this.lugar = lugar;
        this.auto = auto;
    }
    
    
    public Vehiculo(String patente, LocalDateTime fechaIngreso, Lugar lugar, Moto moto, Tarifa tarifa) {
        this.patente = patente;
        this.fechaIngreso = fechaIngreso;
        this.persona = persona;
        this.lugar = lugar;
        this.tarifa = tarifa;
        this.moto = moto;
    }

    public Vehiculo(String patente, LocalDateTime fechaIngreso, Lugar lugar, Camioneta camioneta, Tarifa tarifa) {
        this.patente = patente;
        this.fechaIngreso = fechaIngreso;
        this.persona = persona;
        this.lugar = lugar;
        this.tarifa = tarifa;
        this.camioneta = camioneta;
    }


 
    
    
    
    public Vehiculo() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(LocalDateTime fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Camioneta getCamioneta() {
        return camioneta;
    }

    public void setCamioneta(Camioneta camioneta) {
        this.camioneta = camioneta;
    }

    

    
    
    
    
}
