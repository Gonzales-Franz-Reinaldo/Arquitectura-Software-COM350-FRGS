package PatronesEstructurales.Decorator;

public class ConLeche extends DecoradorBebida {

    public ConLeche(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String obtenerDescripcion() {
        return bebidaDecorada.obtenerDescripcion() + ", con Leche";
    }

    @Override
    public double obtenerCosto() {
        return bebidaDecorada.obtenerCosto() + 2.0;  // El costo adicional de la leche
    }
}