package Singleton;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única del sistema de registro
        RegistroLogs logger = RegistroLogs.obtenerInstancia();

        // Registrar varios mensajes
        logger.registrarMensaje("Iniciando la aplicación...");
        logger.registrarMensaje("Cargando la configuración...");

        // Intentar obtener otra instancia (será la misma)
        RegistroLogs otroLogger = RegistroLogs.obtenerInstancia();
        otroLogger.registrarMensaje("Conexión a la base de datos establecida.");

        // Ambos objetos (logger y otroLogger) son la misma instancia
        System.out.println(logger == otroLogger);  // Esto debe imprimir "true"
    }
}
