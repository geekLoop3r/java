package egg.IntroPOO;

public class Auto {
    String marca = null;
    String modelo = null;
    Integer anio = null;

    // Constructor que inicialice marca, modelo y año
    public Auto(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Constructor que inicialice marca y modelo 
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor que inicialice solamente la marca
    public Auto(String marca) {
        this.marca = marca;
    }

    // Constructor sin parámetros
    public Auto() {}

    public void imprimirDatos() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.anio);
        System.out.println();
    }
}
