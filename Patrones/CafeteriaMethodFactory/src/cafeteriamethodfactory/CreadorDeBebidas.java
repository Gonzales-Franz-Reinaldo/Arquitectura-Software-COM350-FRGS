/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteriamethodfactory;

/**
 *
 * @author Jesús
 */
public abstract class CreadorDeBebidas {
    public abstract Bebida crearBebida();

    public void servirBebida() {
        Bebida bebida = crearBebida();
        bebida.preparar();
        bebida.servir();
        System.out.println("Disfruta tu " + bebida.getClass().getSimpleName() + "!");
    }
}

