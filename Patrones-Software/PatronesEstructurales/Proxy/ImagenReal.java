package PatronesEstructurales.Proxy;

public class ImagenReal implements Imagen {
    private String nombreArchivo;

    public ImagenReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco(nombreArchivo);
    }

    private void cargarDesdeDisco(String nombreArchivo) {
        System.out.println("Cargando " + nombreArchivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + nombreArchivo);
    }
}
