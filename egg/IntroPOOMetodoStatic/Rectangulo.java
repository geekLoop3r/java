package egg.IntroPOOMetodoStatic;

public class Rectangulo {
    // atributos
    float width;
    float height;
    static Integer contRectangle = 0;

    public Rectangulo() {};
    public Rectangulo(float width, float height) {
        this.width =  width;
        this.height = height;
    }


    // creando metodos para calcular 
    public float area() {
        return width*height;
    }

    public float perimeter() {
        return 2*(width + height);
    }

    // creando métodos para salida de los cálculos
    public void printArea() {
        System.out.println("Area: " + area());
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + perimeter());
    }

    // implementando un método static
    public static int totalObjects() {
        return contRectangle;
    }
}
