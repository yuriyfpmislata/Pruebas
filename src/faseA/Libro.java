package faseA;

public class Libro {
    private String titulo;
    private int nPaginas;
    private String autor;
    private double ISBN;
    
    private static int contadorLibros = 0;

    public Libro(String titulo) {
        this.titulo = titulo;
        contadorLibros++;
    }
    
    public static int getContadorLibros() {
        return contadorLibros;
    }
}
