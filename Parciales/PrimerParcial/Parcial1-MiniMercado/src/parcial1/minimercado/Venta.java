/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.minimercado;

/**
 *
 * @author Franz Gonzales
 */

import java.util.*;

public class Venta {
    private Cliente cliente;
    private List<Producto> productosComprados;
    private double total;
    private boolean esVentaEnLinea;

    public Venta(Cliente cliente, List<Producto> productosComprados, boolean esVentaEnLinea) {
        this.cliente = cliente;
        this.productosComprados = productosComprados;
        this.esVentaEnLinea = esVentaEnLinea;
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0;
        for (Producto p : productosComprados) {
            total += p.getPrecio() * p.getCantidad();
        }
    }

    public double getTotal() {
        return total;
    }

    public void procesarPago() {
        System.out.println("Procesando pago con " + cliente.getMetodoPago());
    }

//    public void emitirFactura() {
//        
//    }

    public void generarFactura() {
        System.out.println("Emitir factura para el cliente: " + cliente.getNombre());
        System.out.println("Productos comprados:");
        for (Producto p : productosComprados) {
            System.out.println(p.getNombre() + " - Cantidad: " + p.getCantidad() + " - Precio: " + p.getPrecio());
        }
        System.out.println("Total a pagar: " + total);
    }
}

