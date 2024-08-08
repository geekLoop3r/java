package egg.Scanner;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        // creando variable para ingresar datos
        Scanner consola = new Scanner(System.in);

        // creando variable usuario
        System.out.print("Usuario: ");
        String usuario = consola.nextLine();
        
        // creand variable edad
        System.out.print("Edad: ");
        int edad = consola.nextInt();

        // imprimiendo mensaje
        System.out.println("Su nombre es " + usuario + " y su edad es " + edad);
        consola.close();
    }
}

