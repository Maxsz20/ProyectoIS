/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Maxi
 */
public class Hotel {
    private String nombre;
    private int ranking;
    private String nroHabitaciones;
    private final List<Habitacion> habitaciones;

    public Hotel(String nombre, int ranking, String nroHabitaciones) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.nroHabitaciones = nroHabitaciones;
        this.habitaciones = new ArrayList<>();
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

    public String getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(String nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }
    public void inicializarHabitaciones() {
        // Lista de tipos de habitaciones disponibles
        String[] tiposHabitaciones = { "Individual", "Doble", "Suite", "Familiar", "Presidencial", "Matrimonial", "Ejecutiva", "Conectada", "Accessible" };

        // Crear una lista con todas las habitaciones
        List<Habitacion> todasLasHabitaciones = new ArrayList<>();
        for (String tipo : tiposHabitaciones) {
            todasLasHabitaciones.add(crearHabitacionAleatoria(tipo));
        }

        // Obtener una muestra aleatoria de 4 habitaciones
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            if (todasLasHabitaciones.isEmpty()) {
                break; // Si ya no hay más habitaciones disponibles, se sale del bucle
            }
            int index = random.nextInt(todasLasHabitaciones.size());
            Habitacion habitacion = todasLasHabitaciones.get(index);
            habitaciones.add(habitacion);
            todasLasHabitaciones.remove(index);
        }
    }

    private Habitacion crearHabitacionAleatoria(String tipo) {
        Random random = new Random();

        // Generar valores aleatorios para capacidad, disponibilidad, precio, etc.
        String capacidad = String.valueOf(random.nextInt(6) + 1); // Capacidad entre 1 y 6
        String precio = String.format("%.2f", 50 + (random.nextDouble() * 450)); // Precio entre 50 y 500
        String[] caracteristicas = null;

        // Crear instancia de Habitacion con los valores aleatorios
            return new Habitacion(tipo, capacidad, precio, caracteristicas);
        
    }
     @Override
    public String toString() {
        return nombre; // El texto que se muestra en el JComboBox
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
}
