package egg.Metodos;

import java.util.Scanner;

public class DeclaracionMetodo {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        String club = obtenerClub(consola);
        int puntos = obtenerPuntos(consola);
        consola.close();

        System.out.println("Club: " + club + ", " + puntos);
    }
    
    // fijarnos en la estructura del main
    // public private: modificador de acceso, tiene más sentido hablar des esto cuando hayan más archivos
    // static: modificador de invocación, significa que pertenece a la clase (solo dentro de un contexto estatico)
    // void: tipo de dato que voy a devolver, en este caso será vacío
    // nombre del método

    // private static void imprimirSaludo(String usuario) {
    //     System.out.println("Hola mundo de " + usuario);
    // }

    public static String obtenerClub(Scanner consol) {
        System.out.print("Ingresa el nombre del club: ");
        return consol.nextLine();
    }

    public static int obtenerPuntos(Scanner sc) {
        System.out.print("Ingresa los puntos del club: ");
        return sc.nextInt();
    }

}
