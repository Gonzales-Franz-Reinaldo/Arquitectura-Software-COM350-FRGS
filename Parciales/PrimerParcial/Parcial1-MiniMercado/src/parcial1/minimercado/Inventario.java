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

public class Inventario {
//     public List<Producto> productos;
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        
        Producto existente = buscarProducto(producto.getNombre());
        if (existente != null) {
            existente.setCantidad(existente.getCantidad() + producto.getCantidad());
        } else {
            productos.add(producto);
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        System.out.println("Inventario Actual");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
