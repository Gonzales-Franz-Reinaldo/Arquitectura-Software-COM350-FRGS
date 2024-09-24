/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesCreacionales.FactoryMethod;

import PatronesCreacionales.FactoryMethod.Vehiculo;

/**
 *
 * @author Franz Gonzales
 */
public class Camion implements Vehiculo{
    @Override
    public void alquilar() {
        System.out.println("Alquilando un camión.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo un camión.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de un camión.");
    }
}
