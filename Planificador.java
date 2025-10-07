package model;
import java.util.*;

// Administra la lista de procesos
public class Planificador {
    private List<Proceso> procesos;

    public Planificador() {
        procesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso p) {
        procesos.add(p);
    }

    public void ejecutarTodos() {
        if (procesos.isEmpty()) {
            System.out.println("No hay procesos registrados.");
            return;
        }
        System.out.println("\n--- Ejecutando procesos ---");
        for (Proceso p : procesos) {
            p.ejecutar();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Procesos en el planificador:\n");
        for (Proceso p : procesos) sb.append(" - ").append(p).append("\n");
        return sb.toString();
    }
}
