package model;

// Proceso que realiza operaciones de salida
public class ProcesoSalida extends Proceso {

    public ProcesoSalida(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(nombre + " [Salida]: escribiendo datos...");
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: Salida]";
    }
}
