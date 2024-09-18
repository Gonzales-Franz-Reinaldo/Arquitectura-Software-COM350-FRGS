/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaanimales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Franz Gonzales
 */
public class Zoologico {
    
    private static Zoologico instance;
    private String nombre;
    private ArrayList<Jaula> listaJaulas;
    private String direccion;
    private String telefono;
    

    private Zoologico() {
        this.nombre = "";
        this.listaJaulas = new ArrayList<Jaula>();
        this.direccion = "";
        this.telefono = "";
    }
    
    
     public  static Zoologico getInstance()
    {
        if (instance==null)    
            instance=new Zoologico();
       return instance; 
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jaula> getListaJaulas() {
        return listaJaulas;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public static void setInstance(Zoologico instance) {
        Zoologico.instance = instance;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
}
