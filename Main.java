import controller.Controller;
import model.Planificador;
import view.View;

// Clase principal del programa
public class Main {
    public static void main(String[] args) {
        Planificador planificador = new Planificador();
        View vista = new View();
        Controller controller = new Controller(planificador, vista);
        controller.iniciar();
    }
}
