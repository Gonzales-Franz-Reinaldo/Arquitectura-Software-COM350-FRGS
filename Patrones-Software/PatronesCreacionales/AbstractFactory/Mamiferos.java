/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Franz Gonzales
 */

// PRODUCTO ABSTRACTO
public abstract class Mamiferos {
    protected String nombre;
    protected String temperatura;
    protected int nroDePatas;
    protected String color;

    public Mamiferos(String nombre, String temperatura, int nroDePatas, String color) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.nroDePatas = nroDePatas;
        this.color = color;
    }
    
//    public  String getTemperatura(){
//        return temperatura;
//    }
    
    public abstract String getTemperatura();
    
    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", nroDePatas=" + nroDePatas + ", color=" + color + '}';
    }
}
