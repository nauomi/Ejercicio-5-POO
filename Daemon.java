package model;

// Proceso que corre en segundo plano
public class Daemon extends Proceso {

    public Daemon(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(nombre + " [Daemon]: ejecutando en segundo plano...");
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: Daemon]";
    }
}
