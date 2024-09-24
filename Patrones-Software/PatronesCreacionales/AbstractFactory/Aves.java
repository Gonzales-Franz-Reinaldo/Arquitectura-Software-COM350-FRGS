/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Franz Gonzales
 */

// PRODUCTO ABSTRACTO
public abstract class Aves {
    protected String nombre;
    protected double peso;
    protected double tamanoAlas;

    public Aves(String nombre, double peso, double tamanoAlas) {
        this.nombre = nombre;
        this.peso = peso;
        this.tamanoAlas = tamanoAlas;
    }
    
    public abstract void volar();

    @Override
    public String toString() {
        return "Aves{" + "nombre=" + nombre + ", peso=" + peso + ", tamanoAlas=" + tamanoAlas + '}';
    }
}