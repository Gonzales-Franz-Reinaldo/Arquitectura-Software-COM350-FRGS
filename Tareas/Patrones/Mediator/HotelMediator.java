package Tareas.Patrones.Mediator;

import java.util.List;


//? Mediador para gestionar las reservas.
public interface HotelMediator {

    void registrarHotel(Hotel hotel);
    void hacerReserva(Cliente cliente, int numeroHabitacion);
    void cancelarReserva(Cliente cliente, int numeroHabitacion);
    List<Habitacion> mostrarHabitacionesDisponibles();

}
