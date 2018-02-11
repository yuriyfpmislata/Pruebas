package pruebas.interfaces.comparable;

public class Persona implements Comparable<Persona> {
    
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        if (this.edad > otra.edad) {
            // es mayor, se pone delante
            return 1;
        } else if (this.edad < otra.edad) {
            // es menor, se pone detrás
            return -1;
        } else {
            // la misma, usar criterio por defecto
            return 0;
        }
    }
}
