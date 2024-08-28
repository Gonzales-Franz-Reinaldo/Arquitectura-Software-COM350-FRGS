
package cochesresponsabilidad;

import java.util.Scanner;

/**
 *
 * @author Franz Gonzales
 */
public class CochesResponsabilidad {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner  scanner = new Scanner(System.in);
        
        Coche coche = null;
        
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("MENU PRINCIPAL:");
            System.out.println("1: Crear coche.");
            System.out.println("2: Guardar el coche.");
            System.out.println("3: Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                
                case 1: 
                    System.out.println("Crear el coche.");
                    System.out.println("Escribe la marca del coche.");
                    System.out.print("(1: TOYOTA, 2: NISSAN, 3: SUZUKY, 4: COROLLA): ");
                    int nro_marca = scanner.nextInt();
                    scanner.nextLine();
                    
                    Marca marca;
                    if(nro_marca == 1){
                        marca = Marca.Toyota;
                    }else{
                        if(nro_marca == 2){
                            marca = Marca.Nissan;
                        }else{
                            if(nro_marca == 3){
                                marca = Marca.Suzuki;
                            }else{
                                marca = Marca.Corolla;
                            }
                        }
                    }
                    
                    System.out.print("Introduce el modelo: ");
                    int modelo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Introduce la placa: ");
                    String placa = scanner.nextLine();
                    
                    System.out.println("Elija el color del coche:");
                    System.out.print("(1: ROJO, 2: VERDE, 3: AZUL, 4: NEGRO): ");
                    int nro_color = scanner.nextInt();
                    scanner.nextLine();
                    
                    Color color;
                    if(nro_color == 1){
                        color = Color.Rojo;
                    }else{
                        if(nro_color == 2){
                            color = Color.Verde;
                        }else{
                            if(nro_color == 3){
                                color = Color.Azul;
                            }else{
                                color = Color.Negro;
                            }
                        }
                    }
                    
                    System.out.print("Introduce la cilindrada del coche: ");
                    int cilindro = scanner.nextInt();
                    scanner.nextLine();
                    
                    coche = new Coche(marca, modelo, placa, color, cilindro);
                    break;
                    
                case 2:
                    coche.guardarBd();
                    System.out.println("El coche fue guardado correctamente.");
                    break;
                case 3:
                    System.out.println("Salio.");
                default:
                    System.out.println("Operación no válida");
            }
        }
    }
    
}
