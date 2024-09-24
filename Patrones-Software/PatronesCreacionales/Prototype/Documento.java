package Prototype;

public class Documento implements Clonable {

    private String titulo;
    private String contenido;

    // Constructor
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Método para mostrar los detalles del documento
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
    }

    // Implementación del método clonar
    @Override
    public Documento clonar() {
        return new Documento(this.titulo, this.contenido); // Clon profundo
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

