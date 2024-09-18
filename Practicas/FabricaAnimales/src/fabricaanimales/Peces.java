/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

/**
 *
 * @author Franz Gonzales
 */
public abstract class Peces extends AnimalAbstracta{
    public double longitud;

    public Peces() {
        this.longitud = 0;
    }

    @Override
    public String toString() {
        return "Peces{" + "longitud=" + longitud + '}';
    }
    
    public void volar(){
        
    }
}
