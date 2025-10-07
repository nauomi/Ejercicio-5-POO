package view;
import java.util.Scanner;

// Vista en consola
public class View {
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n===== SIMULADOR DE PROCESOS =====");
        System.out.println("1. Registrar proceso");
        System.out.println("2. Ver procesos");
        System.out.println("3. Ejecutar todos");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() { return sc.nextInt(); }
    public String leerTexto(String msg) { System.out.print(msg); return sc.next(); }
    public int leerEntero(String msg) { System.out.print(msg); return sc.nextInt(); }
    public void mostrarMensaje(String msg) { System.out.println(msg); }
}
