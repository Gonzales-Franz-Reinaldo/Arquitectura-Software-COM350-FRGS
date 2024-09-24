/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.minimercado;

/**
 *
 * @author Franz Gonzales
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalMiniMercado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//        MiniMercado miniMercado = MiniMercado();
//        Scanner scanner = new Scanner(System.in);
        MiniMercado miniMercado = new MiniMercado();

        int opcion;
        do {
            System.out.println("1. Agregar Producto al Inventario");
            System.out.println("2. Realizar Venta en Tienda");
            System.out.println("3. Realizar Venta en Línea");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Generar Reporte Diario");
            System.out.println("6. Salir");
            
            System.out.print("Seleccione una opción: ");
            
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarProducto(scanner, miniMercado);
                    break;
                case 2:
                    realizarVentaEnTienda(scanner, miniMercado);
                    break;
                case 3:
                    realizarVentaEnLinea(scanner, miniMercado);
                    break;
                case 4:
//                    miniMercado.getInventario().mostrarInventario();
                    break;
                case 5:
//                    miniMercado.generarReporteDiario();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
            
        } while (opcion != 6);
        
        scanner.close();
    }

    private static void agregarProducto(Scanner scanner, MiniMercado miniMercado) {
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        Producto producto = new Producto(nombre, precio, cantidad);
//        miniMercado.agregarProductoAlInventario(producto);
        System.out.println("Producto agregado al inventario.");
    }

    private static void realizarVentaEnTienda(Scanner scanner, MiniMercado miniMercado) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese el método de pago (efectivo/tarjeta): ");
        String metodoPago = scanner.nextLine();

       
    }

    
    
    private static void realizarVentaEnLinea(Scanner scanner, MiniMercado miniMercado) {
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        
        System.out.print("Ingrese el método de pago (tarjeta/transferencia): ");
        String metodoPago = scanner.nextLine();

        Cliente cliente = new Cliente(nombreCliente, metodoPago);
        List<Producto> productosComprados = new ArrayList<>();

       
    }
}
