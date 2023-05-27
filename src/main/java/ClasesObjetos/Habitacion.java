/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;


/**
 *
 * @author Maxi
 */
public class Habitacion {
    
    private String tipo;
    private String capacidad;
    private String precio;
    private String[] caracteristicas;

    public Habitacion(String tipo, String capacidad, String precio, String[] caracteristicas) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
            
}
