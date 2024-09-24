package Prototype;

public class Main {
    public static void main(String[] args) {
        // Crear un documento original
        Documento contratoOriginal = new Documento("Contrato de Trabajo", "Este es el contenido del contrato.");

        // Mostrar detalles del documento original
        System.out.println("Documento Original:");
        contratoOriginal.mostrarDetalles();

        // Clonar el documento
        Documento contratoClonado = contratoOriginal.clonar();

        // Mostrar detalles del documento clonado
        System.out.println("\nDocumento Clonado:");
        contratoClonado.mostrarDetalles();

        // Cambiar el contenido del documento clonado
        contratoClonado.setContenido("Este es el contenido actualizado del contrato.");

        // Mostrar los detalles después de modificar el clonado
        System.out.println("\nDocumento Clonado (modificado):");
        contratoClonado.mostrarDetalles();

        // Mostrar el documento original para verificar que no fue modificado
        System.out.println("\nDocumento Original (sin modificar):");
        contratoOriginal.mostrarDetalles();
    }
}
