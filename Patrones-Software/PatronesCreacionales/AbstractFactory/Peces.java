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
public abstract class Peces {
    protected String nombre;
    protected double longitud;

    public Peces(String nombre, double longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }
    
    public abstract void nadar();

    @Override
    public String toString() {
        return "Peces{" + "nombre=" + nombre + ", longitud=" + longitud + '}';
    }
}
