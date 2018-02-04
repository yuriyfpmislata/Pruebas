package faseA;

public class Ej_static_nuevo {

    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote");
        Libro libro2 = new Libro("El principito");
        
        System.out.println("Hay " + Libro.getContadorLibros() + " libros almacenados.");
    }
    
}
