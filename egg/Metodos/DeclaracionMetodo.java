package egg.Metodos;

public class DeclaracionMetodo {
    public static void main(String[] args) {
        imprimirSaludo(pasarAMayusculas("hipolito"));
    }
    
    // fijarnos en la estructura del main
    // public private: modificador de acceso, tiene más sentido hablar des esto cuando hayan más archivos
    // static: modificador de invocación, significa que pertenece a la clase (solo dentro de un contexto estatico)
    // void: tipo de dato que voy a devolver, en este caso será vacío
    // nombre del método

    private static void imprimirSaludo(String usuario) {
        System.out.println("Hola mundo de " + usuario);
    }

    private static String pasarAMayusculas(String palabra){
        return palabra.toUpperCase();
    }
}
