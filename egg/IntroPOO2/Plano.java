package egg.IntroPOO2;

public class Plano {

    public static Punto[] arregloPuntos = {new Punto(2, 0), new Punto(0, 5), new Punto(0, 0)};
    //private static int i = 0;

    public static void main(String[] args) {
        // creando instancias 

        // Punto punto1 = new Punto(1, 2);
        // Punto punto2 = new Punto(3, 1);
        // Punto punto3 = new Punto(4, 1);

        // se puede añadir los puntos con un método de alguna de java?
        // arregloPuntos[0] = punto1;
        // arregloPuntos[1] = punto2;
        // arregloPuntos[2] = punto3;

        System.out.print("\nMi arreglo de puntos: ");
        System.out.println(arregloPuntos[1]);


        System.out.println("distancia1-2: " + Punto.calcularDistancia(arregloPuntos[0], arregloPuntos[1]));
        System.out.println("distancia2-3: " + Punto.calcularDistancia(arregloPuntos[1], arregloPuntos[2]));
        System.out.println("distancia1-3: " + Punto.calcularDistancia(arregloPuntos[0], arregloPuntos[2]));

        System.out.println("Están alineados?: "+ Punto.estanAlineados(arregloPuntos[0], arregloPuntos[1], arregloPuntos[2]));
    }
}
