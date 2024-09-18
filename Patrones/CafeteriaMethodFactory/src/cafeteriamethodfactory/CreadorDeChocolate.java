/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteriamethodfactory;

/**
 *
 * @author Jesús
 */
public class CreadorDeChocolate extends CreadorDeBebidas {
    @Override
    public Bebida crearBebida() {
        return new Chocolate();
    }
}
