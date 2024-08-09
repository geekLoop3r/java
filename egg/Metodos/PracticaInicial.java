package egg.Metodos;

import java.util.Scanner;

public class PracticaInicial {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // lectura nombre
        System.out.print("Ingrese su nombre: ");
        String usuario = consola.nextLine();
        // lectura edad
        System.out.print("Ingrese su edad: ");
        int edadUser = consola.nextInt();
        consola.close();

        // usamos el método
        imprimeNombre(usuario);
        imprimeNombreYEdad(edadUser, usuario);
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    public static void imprimeNombreYEdad(int edad, String nombre) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años ");
    }
}
