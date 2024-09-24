/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Franz Gonzales
 */

// PRODUCTO CONCRETO
public class Tiburon extends Peces{
    
    public Tiburon(String nombre, double longitud) {
        super(nombre, longitud);
    }

    @Override
    public void nadar() {
        System.out.println("El pez " + nombre + " está nadando.");
    }
}
