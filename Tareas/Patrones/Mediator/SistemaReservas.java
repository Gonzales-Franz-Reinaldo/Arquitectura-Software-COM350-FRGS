package Tareas.Patrones.Mediator;

import java.util.List;
import java.util.Scanner;

public class SistemaReservas {

    private static Scanner scanner = new Scanner(System.in);
    private static HotelMediatorImpl mediator = new HotelMediatorImpl();
    private static Cliente cliente;

    public static void main(String[] args) {
        // Inicialización del sistema
        Hotel hotel = new Hotel("Hotel Sucre", 10);
        mediator.registrarHotel(hotel);

        System.out.println("Bienvenido al sistema de reservas del " + hotel.getNombre());
        registrarCliente();

        boolean salir = false;

        while (!salir) {

            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (opcion) {
                case 1:
                    hacerReserva();
                    break;
                case 2:
                    cancelarReserva();
                    break;
                case 3:
                    mostrarHabitacionesDisponibles();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de reservas.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void registrarCliente() {
        System.out.println("Por favor, introduzca su nombre: ");
        String nombre = scanner.nextLine();
        cliente = new Cliente(nombre);
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Hacer una reserva");
        System.out.println("2. Cancelar una reserva");
        System.out.println("3. Mostrar habitaciones disponibles");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void hacerReserva() {

        System.out.println("Introduzca el número de la habitación que desea reservar: ");
        int numeroHabitacion = scanner.nextInt();

        mediator.hacerReserva(cliente, numeroHabitacion);
    }

    private static void cancelarReserva() {

        System.out.println("Introduzca el número de la habitación cuya reserva desea cancelar: ");

        int numeroHabitacion = scanner.nextInt();
        mediator.cancelarReserva(cliente, numeroHabitacion);
    }

    private static void mostrarHabitacionesDisponibles() {

        List<Habitacion> disponibles = mediator.mostrarHabitacionesDisponibles();

        System.out.println("Habitaciones disponibles: ");

        for (Habitacion habitacion : disponibles) {
            System.out.println("Habitación número: " + habitacion.getNumero());
        }
    }
}
