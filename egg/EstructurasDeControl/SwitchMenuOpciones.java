package egg.EstructurasDeControl;

import java.util.Scanner;
import java.lang.Math;

public class SwitchMenuOpciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Mostrar opciones
        System.out.print("\n*****Menú de opciones*****\n");
        System.out.println("Opción 1 : Círculo");
        System.out.println("Opción 2 : Cuadrado");
        System.out.println("Opción 3 : Triángulo");

        // Pedir opción del usuario
        System.out.print("\nIngrese una opción: ");
        int opcion = consola.nextInt();

        // Opciones
        switch (opcion){
            case 1 -> {
                System.out.print("\nIngrese el radio: ");
                float radio = consola.nextFloat();
                double area = 3.1415 * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
            }
            case 2 -> {
                System.out.print("\nIngrese el lado: ");
                float lado = consola.nextFloat();
                double area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
            }
            case 3 -> {
                System.out.print("\nIngrese la base: ");
                float base = consola.nextFloat();
                System.out.print("Ingrese la altura: ");
                float altura = consola.nextFloat();
                double area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
            }
            default -> System.out.println("Opción invalida");
        }
        consola.close();
    }


}
