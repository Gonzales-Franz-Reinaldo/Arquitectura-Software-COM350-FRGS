/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesCreacionales.FactoryMethod;

import PatronesCreacionales.FactoryMethod.Camion;
import PatronesCreacionales.FactoryMethod.CreadorVehiculo;
import PatronesCreacionales.FactoryMethod.Vehiculo;

/**
 *
 * @author Franz Gonzales
 */
public class CreadorCamion extends CreadorVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Camion();
    }
}