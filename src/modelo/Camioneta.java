/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author vales
 */
public class Camioneta extends Vehiculo {
    
    private int cabina;

    public Camioneta(int cabina, String patente, LocalDateTime fechaIngreso, LocalDateTime fechaEgreso) {
        super(patente, fechaIngreso, fechaEgreso);
        this.cabina = cabina;
    }

    public Camioneta(int cabina) {
        this.cabina = cabina;
    }

    

   
    

    public Camioneta() {
    }

    public int getCabina() {
        return cabina;
    }

    public void setCabina(int cabina) {
        this.cabina = cabina;
    }

    
    
    
}
