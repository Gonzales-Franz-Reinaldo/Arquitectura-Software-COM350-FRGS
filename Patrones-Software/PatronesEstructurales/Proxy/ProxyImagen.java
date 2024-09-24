package PatronesEstructurales.Proxy;

public class ProxyImagen implements Imagen {
    private ImagenReal imagenReal;
    private String nombreArchivo;

    public ProxyImagen(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(nombreArchivo); // Carga la imagen solo si es necesario
        }
        imagenReal.mostrar(); // Llama al método del objeto real
    }
}
