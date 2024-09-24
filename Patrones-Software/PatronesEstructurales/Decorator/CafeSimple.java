package PatronesEstructurales.Decorator;

public class CafeSimple implements Bebida {

    @Override
    public String obtenerDescripcion() {
        return "Café Simple";
    }

    @Override
    public double obtenerCosto() {
        return 10.0;  // Precio base del café simple
    }
}
