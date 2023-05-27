/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;


/**
 *
 * @author Maxi
 */
public class Ciudad {
    
    private String nombre;
    private int ranking;
    private String descripcion;
    private final Hotel[] hoteles;

    public Ciudad(String nombre, int ranking, String descripcion) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.descripcion = descripcion;
        this.hoteles = new Hotel[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void agregarHotel(Hotel hotel) {
        // Buscar un índice vacío en el arreglo de hoteles
        for (int i = 0; i < hoteles.length; i++) {
            if (hoteles[i] == null) {
                hoteles[i] = hotel;
                break;
            }
        }
    }
    public Hotel[] getHoteles() {
        return hoteles;
    }
     @Override
    public String toString() {
        return nombre; // El texto que se muestra en el JComboBox
    }

}
