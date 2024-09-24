/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1.minimercado;

/**
 *
 * @author Franz Gonzales
 */
public class Administracion {
    
    private double totalVentas;

    public Administracion() {
        totalVentas = 0;
    }

    public void registrarVenta(double total) {
        totalVentas += total;
    }

    public void generarReporteDiario() {
        System.out.println("Reporte diario de ventas:");
        System.out.println("Total de ventas del día: " + totalVentas);
    }
}

