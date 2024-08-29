package egg.IntroPOO;

public class Application {
    public static void main(String[] args) {
        // personas del mundo real representadas en objetos
        Persona persona1 = new Persona(); // instancias
        persona1.nombre = "Sandra";
        persona1.edad = 23; 

        Persona persona2 = new Persona(); 
        persona2.nombre = "Michael";
        persona2.edad = 18;

        Persona persona3 = new Persona("Tatiana", 12);
        Persona persona4 = new Persona("René", 34);

        //Usando Métodos
        persona1.imprimirNombreYEdad();
        persona2.imprimirNombreYEdad();
        persona3.imprimirNombreYEdad();
        persona4.imprimirNombreYEdad();

        Auto auto1 = new Auto("Ferrary", "Enzo", 2002);
        Auto auto2 = new Auto("Chevrolet", "Corvette");
        Auto auto3 = new Auto("Toyota");
        Auto auto4 = new Auto();
        auto4.anio = 1990;

        System.out.println("\nImprimiendo los datos........\n");
        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();
    }
}
