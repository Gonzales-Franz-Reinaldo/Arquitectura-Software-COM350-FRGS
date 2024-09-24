/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.minimercado;

/**
 *
 * @author Franz Gonzales
 */


public class Cliente {
    private String nombre;
    private String metodoPago; 

    public Cliente(String nombre, String metodoPago) {
        this.nombre = nombre;
        this.metodoPago = metodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}

