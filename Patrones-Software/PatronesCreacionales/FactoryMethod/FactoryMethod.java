/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronesCreacionales.FactoryMethod;

/**
 *
 * @author Franz Gonzales
 */
import java.util.Scanner;

import PatronesCreacionales.FactoryMethod.CreadorAuto;
import PatronesCreacionales.FactoryMethod.CreadorCamion;
import PatronesCreacionales.FactoryMethod.CreadorMoto;
import PatronesCreacionales.FactoryMethod.CreadorVehiculo;

public class FactoryMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreadorVehiculo creador = null;

        while (true) {
            System.out.println("=== Sistema de Gestión de Vehículos ===");
            System.out.println("Seleccione el tipo de vehículo:");
            System.out.println("1. Auto");
            System.out.println("2. Moto");
            System.out.println("3. Camión");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    creador = new CreadorAuto();
                    break;
                case 2:
                    creador = new CreadorMoto();
                    break;
                case 3:
                    creador = new CreadorCamion();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    continue;
            }

            // Usar el creador seleccionado
            creador.operarVehiculo();
        }
    }
}
