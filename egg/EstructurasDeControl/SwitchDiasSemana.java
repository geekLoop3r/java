package egg.EstructurasDeControl;

import java.util.Scanner;

public class SwitchDiasSemana {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("\nIngrese una opción y obtendrás un día de la semana: ");
        int opcion = consola.nextInt();
        consola.close();
        switch (opcion) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;    
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;    
            default:
                System.out.println("No es una opción válida");
                break;
        }
    }
}
