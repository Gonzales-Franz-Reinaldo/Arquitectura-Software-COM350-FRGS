package Tareas.Patrones.Mediator;

public class Habitacion {
    private int numero;
    private Reserva reserva;

    public Habitacion(int numero) {
        this.numero = numero;
        this.reserva = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaDisponible() {
        return reserva == null;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }
}
