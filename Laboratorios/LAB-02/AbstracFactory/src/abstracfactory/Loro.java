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
public class Loro extends Aves{

    public Loro(String nombre, double peso, double tamanoAlas) {
        super(nombre, peso, tamanoAlas);
    }

    @Override
    public void volar() {
        System.out.println("El ave " + nombre + " está volando.");
    }
    
}
