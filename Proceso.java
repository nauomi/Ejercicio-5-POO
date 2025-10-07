package model;

// Clase base abstracta de todos los procesos
public abstract class Proceso {
    protected int pid;
    protected String nombre;

    public Proceso(int pid, String nombre) {
        this.pid = pid;
        this.nombre = nombre;
    }

    public int getPid() { return pid; }
    public String getNombre() { return nombre; }

    // Método abstracto a sobrescribir
    public abstract void ejecutar();

    @Override
    public String toString() {
        return "PID: " + pid + " | Nombre: " + nombre;
    }
}
