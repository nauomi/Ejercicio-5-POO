package controller;
import model.*;
import view.View;

// Controlador que conecta la vista y el modelo
public class Controller {
    private Planificador planificador;
    private View vista;

    public Controller(Planificador planificador, View vista) {
        this.planificador = planificador;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            switch (opcion) {
                case 1 -> registrarProceso();
                case 2 -> vista.mostrarMensaje(planificador.toString());
                case 3 -> planificador.ejecutarTodos();
                case 4 -> vista.mostrarMensaje("Saliendo...");
                default -> vista.mostrarMensaje("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private void registrarProceso() {
        int pid = vista.leerEntero("Ingrese PID: ");
        String nombre = vista.leerTexto("Ingrese nombre: ");

        vista.mostrarMensaje("Tipos: 1-CPU | 2-Entrada | 3-Salida | 4-Daemon");
        int tipo = vista.leerEntero("Seleccione tipo: ");

        Proceso p = switch (tipo) {
            case 1 -> new ProcesoCPU(pid, nombre);
            case 2 -> new ProcesoEntrada(pid, nombre);
            case 3 -> new ProcesoSalida(pid, nombre);
            case 4 -> new Daemon(pid, nombre);
            default -> null;
        };

        if (p != null) {
            planificador.agregarProceso(p);
            vista.mostrarMensaje("Proceso registrado.");
        } else vista.mostrarMensaje("Tipo inválido.");
    }
}
