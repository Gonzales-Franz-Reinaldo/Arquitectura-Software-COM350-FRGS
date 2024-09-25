package Tareas.Patrones.Mediator;

// Interfaz Mediador
interface Mediador {
    void enviar(String mensaje, Colega colega);
}

// Clase abstracta Colega
abstract class Colega {
    protected Mediador mediador;
    
    public Colega(Mediador mediador) {
        this.mediador = mediador;
    }
    
    public abstract void recibir(String mensaje);
}

// Implementaciones concretas de Colega
class ColegaConcreto1 extends Colega {
    public ColegaConcreto1(Mediador mediador) {
        super(mediador);
    }

    public void enviar(String mensaje) {
        System.out.println("Colega1 envía: " + mensaje);
        mediador.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Colega1 recibe: " + mensaje);
    }
}

class ColegaConcreto2 extends Colega {
    public ColegaConcreto2(Mediador mediador) {
        super(mediador);
    }

    public void enviar(String mensaje) {
        System.out.println("Colega2 envía: " + mensaje);
        mediador.enviar(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Colega2 recibe: " + mensaje);
    }
}

// Implementación concreta del Mediador
class MediadorConcreto implements Mediador {
    
    private ColegaConcreto1 colega1;
    private ColegaConcreto2 colega2;

    public void setColega1(ColegaConcreto1 colega1) {
        this.colega1 = colega1;
    }

    public void setColega2(ColegaConcreto2 colega2) {
        this.colega2 = colega2;
    }

    @Override
    public void enviar(String mensaje, Colega colega) {
        if (colega == colega1) {
            colega2.recibir(mensaje);
        } else {
            colega1.recibir(mensaje);
        }
    }
}
