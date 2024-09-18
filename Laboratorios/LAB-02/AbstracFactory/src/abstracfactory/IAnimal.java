/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstracfactory;

/**
 *
 * @author Franz Gonzales
 */
// Fábrica abstracta de animales
// FRÁBICA ABSTRACTA
public interface IAnimal {
    Mamiferos crearMamifero(String nombre, String temperatura, int nroDePatas, String color);
    Aves crearAve(String nombre, double  peso, double tamanoAlas);
    Peces crearPez(String nombre, double longitud);
}
