package egg.IntroPOO;

public class Application {
    public static void main(String[] args) {
        // personas del mundo real representadas en objetos
        Persona persona1 = new Persona(); // instanciar
        persona1.edad = 23; 

        Persona michael = new Persona(); 
        michael.nombre = "Michael";
        michael.edad = 18;

        // persona1.imprimirNombreYEdad();
        // michael.imprimirNombreYEdad();

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
