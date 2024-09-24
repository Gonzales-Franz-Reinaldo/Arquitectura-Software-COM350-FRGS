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
public abstract class CreadorVehiculo {
    public abstract Vehiculo crearVehiculo();

    public void operarVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.alquilar();
        vehiculo.devolver();
        vehiculo.realizarMantenimiento();
    }
}
