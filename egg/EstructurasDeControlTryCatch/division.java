package egg.EstructurasDeControlTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // ingreso de datos dividendo y divisor
        System.out.println("DIVISIÓN");

        // instrucciones
        int division = 0;
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = consola.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = consola.nextInt();
            division = dividendo/divisor;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ERROR: No es posible dividir por cero: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Ingresó un caracter en lugar de un número.");
        } catch (Exception e) {
            System.out.println("ERROR: Algo salió mal.");
        }

        // salida de datos
        System.out.println("\nEl resultado es: " + division);

        consola.close();
    }
}
