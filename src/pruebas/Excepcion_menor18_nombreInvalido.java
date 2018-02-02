package pruebas;

public class Excepcion_menor18_nombreInvalido extends RuntimeException {

    public Excepcion_menor18_nombreInvalido() {
        super("Se ha producido un error desconocido.");
    }
    
    public Excepcion_menor18_nombreInvalido(String mensaje) {
        super("/!\\ Error: " + mensaje);
    }
    
}
