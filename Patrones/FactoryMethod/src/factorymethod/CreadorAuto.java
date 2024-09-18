/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author Franz Gonzales
 */
public class CreadorAuto extends CreadorVehiculo{
    @Override
    public Vehiculo crearVehiculo() {
        return new Auto();
    }
}
