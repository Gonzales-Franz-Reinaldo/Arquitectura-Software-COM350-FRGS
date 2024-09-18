/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeteriamethodfactory;

/**
 *
 * @author Jesús
 */
public class Te implements Bebida {
    @Override
    public void preparar() {
        System.out.println("Preparando las hojas de te.");
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo la bebida: Te");
    }
}

