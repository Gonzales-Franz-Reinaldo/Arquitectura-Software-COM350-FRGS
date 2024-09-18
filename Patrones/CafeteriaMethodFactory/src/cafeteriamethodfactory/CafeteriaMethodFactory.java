/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeteriamethodfactory;

/**
 *
 * @author Jesús
 */
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeteriaMethodFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Bienvenido a la cafeteria. ¿Que bebida te gustaria?");
            System.out.println("1. Cafe");
            System.out.println("2. Te");
            System.out.println("3. Chocolate");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion (1-4): ");

            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida. Por favor, ingresa un numero.");
                scanner.next();
                continue;
            }

            if (opcion == 4) {
                System.out.println("Gracias por visitar la cafeteria. ¡Hasta luego!");
                scanner.close();
                break;
            }

            CreadorDeBebidas creador = null;

            switch (opcion) {
                case 1:
                    creador = new CreadorDeCafe();
                    break;
                case 2:
                    creador = new CreadorDeTe();
                    break;
                case 3:
                    creador = new CreadorDeChocolate();
                    break;
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
                    continue;
            }

            creador.servirBebida();
        }
    }
}
