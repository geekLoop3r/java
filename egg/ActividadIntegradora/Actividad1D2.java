package egg.ActividadIntegradora;

import java.util.Scanner;

public class Actividad1D2 {
    public static void main(String[] args) {
        System.out.println("*******Bienvenido a la calculadora*******");
        System.out.println("Ingresa dos números!");
        Scanner consola = new Scanner(System.in);
        
        // lectura de los dos números
        System.out.print("Número 1: ");
        double num1 = consola.nextDouble();
        System.out.print("Número 2: ");
        double num2 = consola.nextDouble();

        // mostrando menú de opciones
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Ingresa una acción: ");
        int opcion = consola.nextInt();
        consola.close();

        switch (opcion) {
            case 1:
                double suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;
            case 2: 
                double resta = (num1 > num2) ? num1 - num2 : num2 - num1;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                double producto = num1*num2;
                System.out.println("El resultado es: " + producto);
                break;
            case 4: 
                if (num2 != 0) {
                    double division = num1 / num2;
                    System.out.println("El resultado es: " + division);
                } else {
                    System.out.println("Error: La división entre cero no se permite.");
                }
                break;
            default:
                System.out.println("Opción no válida...");
                break;
        }
    }
}
