package egg.EstructurasDeControl;

import java.util.Scanner;

public class SwitchDiaHabil {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int diaSemana = consola.nextInt();

        switch (diaSemana) {
            case 1, 2, 3, 4, 5 -> System.out.println("Es un día hábil");
            case 6, 7 -> System.out.println("No es un día hábil");
            default -> System.out.println("Valor no válido intente con otro número");
        }

        consola.close();

    }
}
