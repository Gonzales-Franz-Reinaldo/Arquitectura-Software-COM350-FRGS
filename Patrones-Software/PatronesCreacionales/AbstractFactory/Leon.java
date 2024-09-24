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
public class Leon extends Mamiferos{
    
    public Leon(String nombre, String temperatura, int nroDePatas, String color) {
        super(nombre, temperatura, nroDePatas, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El mamífero" + nombre + " ruge.");
    }

    @Override
    public String getTemperatura() {
        return temperatura;
    }
    
}
