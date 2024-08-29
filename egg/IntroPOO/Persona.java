package egg.IntroPOO;

public class Persona {
    // atributos, propiedades o caracteristicas
    String nombre;
    Integer edad;
    static Integer numero = 0; 

    // metodos, comportamientos o acciones
    public void imprimirNombreYEdad() {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }

    public Persona(){};

    public Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
        numero++;
        System.out.println("Número de persona registrada" + numero);
    };
}
