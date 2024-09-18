/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

/**
 *
 * @author Franz Gonzales
 */
public abstract class Aves extends AnimalAbstracta{
    private double peso;
    private double tamanoAlas;

    public Aves() {
        this.peso = 0;
        this.tamanoAlas = 0;
    }

    @Override
    public String toString() {
        return "Aves{" + "peso=" + peso + ", tamanoAlas=" + tamanoAlas + '}';
    }
    
    public void volar(){
        System.out.println("");
    }
    
}
