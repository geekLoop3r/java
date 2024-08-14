package egg.EstructurasDeControl;

import java.util.Scanner;

public class SwitchCalificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("\nIngrese su calificación: ");
        int opcion = consola.nextInt();
        consola.close();
        switch (opcion) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Ingrese una opción válida");
        }
    }
}
