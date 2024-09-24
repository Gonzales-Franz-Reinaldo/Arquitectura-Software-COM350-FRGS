/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author Franz Gonzales
 */
public class Jaula {
    private Object animal;
    private double alto;
    private double ancho;
    private double largo;

    public Jaula(Object animal, double alto, double ancho, double largo) {
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Object getAnimal() {
        return animal;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
    

    @Override
    public String toString() {
        return "Jaula{" + "animal=" + animal.toString() + ", alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
    
}
