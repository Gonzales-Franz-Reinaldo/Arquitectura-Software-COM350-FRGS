package Singleton;

public class RegistroLogs {

    // Única instancia estática de la clase
    private static RegistroLogs instanciaUnica;

    // Constructor privado para evitar creación de instancias desde fuera
    private RegistroLogs() {
        System.out.println("Registro de logs inicializado.");
    }

    // Método estático para obtener la única instancia de la clase
    public static RegistroLogs obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new RegistroLogs();
        }
        return instanciaUnica;
    }

    // Método para registrar un mensaje
    public void registrarMensaje(String mensaje) {
        System.out.println("Log: " + mensaje);
        // Aquí se podría escribir el mensaje en un archivo, base de datos, etc.
    }
}
