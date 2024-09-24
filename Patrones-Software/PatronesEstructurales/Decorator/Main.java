package PatronesEstructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new CafeSimple();
        System.out.println(cafe.obtenerDescripcion() + " cuesta $" + cafe.obtenerCosto());

        // Decorar el café con leche
        cafe = new ConLeche(cafe);
        System.out.println(cafe.obtenerDescripcion() + " cuesta $" + cafe.obtenerCosto());

        // Decorar el café con leche y azúcar
        cafe = new ConAzucar(cafe);
        System.out.println(cafe.obtenerDescripcion() + " cuesta $" + cafe.obtenerCosto());
    }
}

