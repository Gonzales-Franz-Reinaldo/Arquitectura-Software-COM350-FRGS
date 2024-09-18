
package abstracfactory;

//Componentes del patrón

import java.util.Scanner;

//Ejemplo de la estructura del Patron con Vehiculos
//Fábrica Abstracta (FabricaVehiculo): Define la interfaz que deben seguir las fábricas concretas.
//Fábrica Concreta (FabricaVehiculoElectrico y FabricaVehiculoGasolina): Implementan la fábrica abstracta para crear autos y motos específicos.
//Producto Abstracto (Auto y Moto): Declaran las interfaces comunes de los productos (Auto y Moto).
//Producto Concreto (AutoElectrico, MotoElectrica, AutoGasolina, MotoGasolina): Implementan los productos concretos.

/**
 *
 * @author Franz Gonzales
 */
public class AbstracFactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scaner = new Scanner(System.in);
    
        //    Instanciamos solo unica vez el Zoológico
        Zoologico zoologico =  Zoologico.getInstance("Zoológico Sucre", "Avenida 6 de Agosto #234", "583-8383");
    
        int opcion = 0;
        
        while(opcion != 8){
            
            System.out.println("\nMenu Principal Zoologico.");
            System.out.println("1. Agregar Mamimefo");
            System.out.println("2. Agregar Ave");
            System.out.println("3. Agregar Pez");
            System.out.println("4. Mostrar Mamimefo");
            System.out.println("5. Mostrar Ave");
            System.out.println("6. Mostrar Peces");
            System.out.println("7. Mostrar Zoologico");
            System.out.println("8. Salir");
            
            System.out.print("Elige una opcion: ");
            
            opcion = scaner.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.print("Introduzca nombre del Mamifero: ");
                    String nombreMamifero = scaner.next();
                    FMamifero fMamifero = new FMamifero();
                    Mamiferos mamimefero = fMamifero.crearMamifero(nombreMamifero, "36°C", 4, "Negro");
                    Jaula jaulaMamifero = new Jaula(mamimefero, 5, 5, 5);
                    zoologico.agregarJaula(jaulaMamifero);
                    break;
                case 2:
                    System.out.print("Introduzca nombre del Ave: ");
                    String nombreAve = scaner.next();
                    FAve fAve = new FAve();
                    Aves ave = fAve.crearAve(nombreAve, 1.5, 0.5);
                    Jaula jaulaAve = new Jaula(ave, 3, 3, 3);
                    zoologico.agregarJaula(jaulaAve);
                    break;
                case 3:
                    System.out.print("Introduzca nombre del Pez: ");
                    String nombrePez = scaner.next();
                    FPeces fPez = new FPeces();
                    Peces pez = fPez.crearPez(nombrePez, 0.7);
                    Jaula jaulaPeces = new Jaula(pez, 2, 2, 2);
                    
                    zoologico.agregarJaula(jaulaPeces);
                    break;
                case 4:
                    zoologico.mostrarMamiferos();
                    break;
                case 5:
                    zoologico.mostrarAves();
                    break;
                case 6:
                    zoologico.mostrarPeces();
                    break;
                case 7:
                    System.out.println("Datos Zoologico: \n" + zoologico.toString());
                case 8:
                    System.out.println("Saliendo..");
                    break;
                default:
                    System.out.println("Operacion no valida.");
                    break;
            }
        }
        
        scaner.close();
    }
    
}
