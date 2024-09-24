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

public class MiniMercado {
    private Inventario inventario;
    private List<Venta> ventas;

    public MiniMercado() {
        this.inventario = new Inventario();
        this.ventas = new ArrayList<>();
    }

    public void agregarProductoAlInventario(Producto producto) {
        inventario.agregarProducto(producto);
    }

    public void realizarVentaEnTienda(Cliente cliente, List<Producto> productosComprados) {
        Venta venta = new Venta(cliente, productosComprados, "Tienda");
        if (actualizarInventario(productosComprados)) {
            ventas.add(venta);
            System.out.println("Venta realizada en tienda. Factura generada:");
            venta.generarFactura();
        } else {
            System.out.println("Error al realizar la venta. Stock insuficiente.");
        }
    }

    public void realizarVentaEnLinea(Cliente cliente, List<Producto> productosComprados) {
        Venta venta = new Venta(cliente, productosComprados, "En Línea");
        if (actualizarInventario(productosComprados)) {
            ventas.add(venta);
            System.out.println("Venta realizada en línea. Factura generada:");
            venta.generarFactura();
        } else {
            System.out.println("Error al realizar la venta. Stock insuficiente.");
        }
    }

    private boolean actualizarInventario(List<Producto> productosComprados) {
        for (Producto producto : productosComprados) {
            Producto productoInventario = inventario.buscarProducto(producto.getNombre());
            if (productoInventario != null && productoInventario.getCantidad() >= producto.getCantidad()) {
                productoInventario.setCantidad(productoInventario.getCantidad() - producto.getCantidad());
            } else {
                return false; // Stock insuficiente
            }
        }
        return true; // Actualización exitosa
    }

    public void generarReporteDiario() {
        System.out.println("===== Reporte Diario de Ventas =====");
        double totalVentas = 0.0;
        for (Venta venta : ventas) {
            totalVentas += venta.getTotal();
            venta.generarFactura();
        }
        System.out.println("Total Ventas del Día: " + totalVentas);
    }

    public Inventario getInventario() {
        return inventario;
    }
}
