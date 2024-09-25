package Tareas.Patrones.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, int numeroHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        
        for (int i = 1; i <= numeroHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public Habitacion getHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.estaDisponible()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public String getNombre() {
        return nombre;
    }
}
