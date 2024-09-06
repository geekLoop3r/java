package egg.IntroPOO2;

public class Punto {
    // atributos
    private double x;
    private double y;

    public double distanciaDesdeOrigen(double x, double y) {
        return Math.sqrt(x*x + y*y);
    }

    public static double calcularDistancia(Punto punto1, Punto punto2) {
        return Math.sqrt((punto1.x - punto2.x)*(punto1.x - punto2.x) + (punto1.y - punto2.y)*(punto1.y - punto2.y));
    }

    public static boolean estanAlineados(Punto punto1, Punto punto2, Punto punto3) {
        if(calcularDistancia(punto1, punto2) + calcularDistancia(punto2, punto3) > calcularDistancia(punto1, punto3)){
            return false;
        } else {
            return true;
        }
    }
    
    // constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}


