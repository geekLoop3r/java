package egg.Metodos;

import java.util.Scanner;

public class VariablesGlobales {

    // Declarando la variable global scanner
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        String nombreUsuario = obtenerNombre(consola);
        int edadUsuario = obtenerEdad(consola);
        imprimeNombreYEdad(nombreUsuario, edadUsuario);
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }

    public static String obtenerNombre(Scanner nombre) {
        System.out.print("Ingrese su nombre: ");
        return nombre.nextLine();
    }

    public static int obtenerEdad(Scanner edad) {
        System.out.print("Ingrese su edad: ");
        return edad.nextInt();
    }
}
