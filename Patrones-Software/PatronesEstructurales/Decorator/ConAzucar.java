package PatronesEstructurales.Decorator;


public class ConAzucar extends DecoradorBebida {

    public ConAzucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String obtenerDescripcion() {
        return bebidaDecorada.obtenerDescripcion() + ", con Azúcar";
    }

    @Override
    public double obtenerCosto() {
        return bebidaDecorada.obtenerCosto() + 1.0;  // El costo adicional del azúcar
    }
}
