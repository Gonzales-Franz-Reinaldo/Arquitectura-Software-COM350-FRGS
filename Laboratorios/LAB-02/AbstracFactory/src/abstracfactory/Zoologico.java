/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracfactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Gonzales
 */

// SINGLETON OBGECT
public class Zoologico {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Jaula> jaulas;
    
    private static Zoologico instance;

    private Zoologico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.jaulas = new ArrayList<>();
    }
    
    // Método para obtener la única instancia de Zoologico
    public static Zoologico getInstance(String nombre, String direccion, String telefono){
        if(instance == null){
            instance = new Zoologico(nombre, direccion, telefono);
        }
        return instance;
    }
    
    public void agregarJaula(Jaula jaula){
        jaulas.add(jaula);
    }
    
    // Mostrar todos los mamíferos
    public void mostrarMamiferos() {
        System.out.println("\nMamíferos en el Zoológico:");
        for (Jaula jaula : jaulas) {
            if (jaula.getAnimal() instanceof Mamiferos) {
                System.out.println(jaula.getAnimal().toString());
            }
        }
    }

    // Mostrar todas las aves
    public void mostrarAves() {
        System.out.println("\nAves en el Zoológico:");
        for (Jaula jaula : jaulas) {
            if (jaula.getAnimal() instanceof Aves) {
                System.out.println(jaula.getAnimal().toString());
            }
        }
    }

    // Mostrar todos los peces
    public void mostrarPeces() {
        System.out.println("\nPeces en el Zoológico:");
        for (Jaula jaula : jaulas) {
            if (jaula.getAnimal() instanceof Peces) {
                System.out.println(jaula.getAnimal().toString());
            }
        }
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoológico: ").append(nombre)
          .append("\nDirección: ").append(direccion)
          .append("\nTeléfono: ").append(telefono)
          .append("\nAnimales en jaulas:\n");
        
        for (Jaula jaula : jaulas) {
            sb.append(jaula.toString()).append("\n");
        }
        return sb.toString();
    }
}
