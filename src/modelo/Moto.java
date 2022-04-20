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
public class Moto extends Vehiculo {
    
    private int cilidrada;

    public Moto(int cilidrada, String patente, LocalDateTime fechaIngreso, LocalDateTime fechaEgreso) {
        super(patente, fechaIngreso, fechaEgreso);
        this.cilidrada = cilidrada;
    }

    public Moto(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    
    
    
    

    public Moto() {
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }
    
    
}
