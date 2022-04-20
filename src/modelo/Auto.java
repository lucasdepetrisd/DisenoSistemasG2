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
public class Auto extends Vehiculo {
    
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String patente, LocalDateTime fechaIngreso, LocalDateTime fechaEgreso) {
        super(patente, fechaIngreso, fechaEgreso);
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    

    
    
    

    public Auto() {
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
}
