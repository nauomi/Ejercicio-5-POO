package model;

// Proceso que realiza operaciones de entrada
public class ProcesoEntrada extends Proceso {

    public ProcesoEntrada(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(nombre + " [Entrada]: leyendo datos...");
    }

    @Override
    public String toString() {
        return super.toString() + " [Tipo: Entrada]";
    }
}
