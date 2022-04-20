
package modelo;

public class Lugar {
    
    private int numero;
    private boolean techo;
    private double precio;
    private Estado estado;
    

    public Lugar(int numero, boolean techo, double precio) {
        this.numero = numero;
        this.techo = techo;
        this.precio = precio;
        this.estado = Estado.LIBRE;
    }

    public Lugar() {
    }

    public Lugar(int numero, boolean techo, double precio, Estado estado) {
        this.numero = numero;
        this.techo = techo;
        this.precio = precio;
        this.estado = estado;
    }
    
    
    //Estado
    
    public void cambiarEstado(Estado estado){
        if(this.estado != estado){
            this.estado = estado;
        }
    }
    
    public Estado getEstado(){
        return this.estado;
    }
    
    //
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
}
