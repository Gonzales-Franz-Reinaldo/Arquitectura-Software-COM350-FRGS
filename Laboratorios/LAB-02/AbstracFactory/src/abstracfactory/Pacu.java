/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracfactory;

/**
 *
 * @author Franz Gonzales
 */

// PRODUCTO CONCRETO
public class Pacu extends Peces{

    public Pacu(String nombre, double longitud) {
        super(nombre, longitud);
    }

    @Override
    public void nadar() {
        System.out.println("El pez " + nombre + " está nadando.");
    }
    
}
