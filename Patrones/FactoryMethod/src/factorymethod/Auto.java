/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import FactoryMethod.Vehiculo;

/**
 *
 * @author Franz Gonzales
 */
public class Auto implements Vehiculo{
    @Override
    public void alquilar() {
        System.out.println("Alquilando un auto.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo un auto.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de un auto.");
    }
}
