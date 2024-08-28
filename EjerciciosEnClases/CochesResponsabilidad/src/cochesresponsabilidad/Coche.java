
package cochesresponsabilidad;


/*Declarar la clase coche  que tiene los siguientes propiedades y metodos:
 * Luego crear un menu con las opciones crear un coche y Guardar el Coche,
 * Guardar permitira guardar en una mase de datos mysql que llame be_coches , la tabla 
 * coches con los campos que sean necesarios
 */ 

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Franz Gonzales
 */
public class Coche {
    private Marca marca;
    private int modelo;
    private String placa;
    private Color color;
    private int cilindrada;

    public Coche(Marca marca, int modelo, String placa, Color color, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    public void guardarBd(){
        
        try{
//            com.mysql.cj.jdbc.Driver
            Connection conexion =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_coches", "root", "");
            String sql = "INSERT INTO coche(marca, modelo, placa, color, cilindrada) VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement instruccion = conexion.prepareStatement(sql);
            
            instruccion.setString(1, marca.toString());
            instruccion.setInt(2, modelo);
            instruccion.setString(3, placa);
            instruccion.setString(4, color.toString());
            instruccion.setInt(5, cilindrada);
            
            instruccion.execute();
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
        
    }
}
