package pruebas.interfaces.comparator;

import java.util.Comparator;
import pruebas.interfaces.comparable.Persona;

public class ComparatorEdadMenorMayor implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.edad > p2.edad) {
            // es mayor, se pone delante
            return 1;
        } else if (p1.edad < p2.edad) {
            // es menor, se pone detrás
            return -1;
        } else {
            // la misma, usar criterio por defecto
            return 0;
        }
    }
}
