/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Franz Gonzales
 */

// FÁBRICA CONCRETO
public class FAve implements IAnimal{

    @Override
    public Mamiferos crearMamifero(String nombre, String temperatura, int nroDePatas, String color) {
        return null;
    }

    @Override
    public Aves crearAve(String nombre, double peso, double tamanoAlas) {
        return new Loro(nombre, peso, tamanoAlas);
    }

    @Override
    public Peces crearPez(String nombre, double longitud) {
        return null;
    }
    
}
