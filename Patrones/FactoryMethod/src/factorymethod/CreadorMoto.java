/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import FactoryMethod.CreadorVehiculo;
import FactoryMethod.Moto;
import FactoryMethod.Vehiculo;

/**
 *
 * @author Franz Gonzales
 */
public class CreadorMoto extends CreadorVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
