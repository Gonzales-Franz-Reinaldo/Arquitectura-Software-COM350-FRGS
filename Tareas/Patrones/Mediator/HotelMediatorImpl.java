package Tareas.Patrones.Mediator;

import java.util.ArrayList;
import java.util.List;


//? Esta clase actua como el mediador concreto

public class HotelMediatorImpl implements HotelMediator {

    private Hotel hotel;

    @Override
    public void registrarHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void hacerReserva(Cliente cliente, int numeroHabitacion) {

        // obtiene la habitación con el número indicado
        Habitacion habitacion = hotel.getHabitacion(numeroHabitacion);

        // verifica si la habitación existe y está disponible
        if (habitacion != null && habitacion.estaDisponible()) {
            Reserva reserva = new Reserva(cliente, habitacion);
            habitacion.setReserva(reserva);
            System.out.println("Reserva realizada exitosamente para " + cliente.getNombre());
        } else {
            System.out.println("La habitación no está disponible.");
        }
    }

    @Override
    public void cancelarReserva(Cliente cliente, int numeroHabitacion) {

        // obtiene la habitación con el número indicado
        Habitacion habitacion = hotel.getHabitacion(numeroHabitacion);

        // verifica si la habitación está reservada por el cliente
        if (habitacion != null && habitacion.getReserva() != null 
            && habitacion.getReserva().getCliente().equals(cliente)) {

            habitacion.setReserva(null);
            System.out.println("Reserva cancelada para " + cliente.getNombre());
        } else {
            System.out.println("No hay ninguna reserva a cancelar.");
        }
    }

    @Override
    public List<Habitacion> mostrarHabitacionesDisponibles() {
        return hotel.getHabitacionesDisponibles();
    }
}


// El mediador es el que coordina la interacción entre el hotel, las habitaciones y el cliente, sin que estos se comuniquen directamente entre sí.