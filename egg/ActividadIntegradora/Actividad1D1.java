package egg.ActividadIntegradora;

import java.util.Scanner;

public class Actividad1D1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = consola.nextInt();
        String mensaje = (numero % 2 == 0) ? "es par" : "es impar";
        consola.close();
        System.out.println("El número " + mensaje );
    }
}
