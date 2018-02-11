package pruebas.interfaces.comparator;

import java.util.Comparator;
import pruebas.interfaces.comparable.Persona;

public class ComparatorNombreAZ implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        // usar comparator interno de String
        return p1.nombre.compareTo(p2.nombre);
    }
}
