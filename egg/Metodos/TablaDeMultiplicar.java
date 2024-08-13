package egg.Metodos;

import java.util.Scanner;

public class TablaDeMultiplicar {
    // variable global
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);        
    }

    public static int pedirNumero() {
        System.out.print("Ingresa un número para ver su tabla de multiplicar: ");
        int numero = consola.nextInt();
        return numero;
    }

    /*
    El metodo para imprimir recibe una variable de tipo int en la versión 
    anterior me daba error por recibir el numero desde la consola
    */

    public static void imprimirTablaMultiplicar(int num){
        System.out.println("\nTabla de multiplicar del número " + num);
        for(int i=1; i<=12; i++) {
            System.out.println(i + " X " + num + " = " + i * num);
        }
    }


}
