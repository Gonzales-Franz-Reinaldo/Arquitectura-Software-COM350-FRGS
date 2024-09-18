/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

/**
 *
 * @author Franz Gonzales
 */
public abstract class Mamiferos extends AnimalAbstracta{
    public String temperatura;
    public int numeroDePatas;
    public String color;

    public Mamiferos() {
        this.temperatura = "";
        this.numeroDePatas = 0;
        this.color = "";
    }

    @Override
    public String toString() {
        return "Mamiferos{" + "temperatura=" + temperatura + ", numeroDePatas=" + numeroDePatas + ", color=" + color + '}';
    }
    
    void getTemperatura(){
        
    }
    
}
