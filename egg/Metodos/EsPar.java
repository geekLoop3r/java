package egg.Metodos;

import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        // instrucciones
        int numero = solicitarNumero();
        esPar(numero);
    }   
    
    // metodo que solicita ingresar un numero
    public static int solicitarNumero() {
        Scanner consola = new Scanner(System.in);
        System.out.print("\nIngrese un número: ");
        int numero = consola.nextInt();
        consola.close();
        return numero;
    }

    // metodo que verifica si el numero ingresado es par
    public static boolean esPar(int numero) {
        boolean verificarSiEsPar = false;
        if (numero % 2 == 0) {
            verificarSiEsPar = true;
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        return verificarSiEsPar;
    }
}

