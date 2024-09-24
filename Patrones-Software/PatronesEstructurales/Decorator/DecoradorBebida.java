package PatronesEstructurales.Decorator;

public abstract class DecoradorBebida implements Bebida {
    protected Bebida bebidaDecorada;

    public DecoradorBebida(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public String obtenerDescripcion() {
        return bebidaDecorada.obtenerDescripcion();
    }

    @Override
    public double obtenerCosto() {
        return bebidaDecorada.obtenerCosto();
    }
}

