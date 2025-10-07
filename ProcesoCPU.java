package model;

// Proceso que usa CPU intensivamente
public class ProcesoCPU extends Proceso {

    public ProcesoCPU(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(nombre + " [CPU]: ejecutando cálculos intensivos...");
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: CPU]";
    }
}
