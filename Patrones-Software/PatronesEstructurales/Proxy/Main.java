package PatronesEstructurales.Proxy;

public class Main {
    public static void main(String[] args) {
        Imagen imagen = new ProxyImagen("foto_grande.jpg");

        // La imagen solo se cargará cuando sea realmente necesario
        System.out.println("Imagen creada, pero aún no cargada");

        // Primera vez que se muestra la imagen, se carga desde el disco
        imagen.mostrar();

        // Segunda vez que se muestra, ya está cargada, no necesita recargar
        imagen.mostrar();
    }
}
