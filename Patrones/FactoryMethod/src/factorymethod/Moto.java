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
public class Moto implements Vehiculo{
    @Override
    public void alquilar() {
        System.out.println("Alquilando una moto.");
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo una moto.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de una moto.");
    }
}
