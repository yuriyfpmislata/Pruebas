package pruebas.interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pruebas.interfaces.comparable.Persona;

public class Main {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        Persona ana = new Persona("Ana", 21);
        Persona juan = new Persona("Juan", 17);

        personas.add(ana);
        personas.add(juan);

        System.out.println("*** Sin ordenar ***");

        for (Persona p : personas) {
            System.out.println(p.nombre + " | " + p.edad);
        }

        System.out.println("*** Ordenadas de edad menor a mayor ***");

        Collections.sort(personas, new ComparatorEdadMenorMayor());

        for (Persona p : personas) {
            System.out.println(p.nombre + " | " + p.edad);
        }

        System.out.println("*** Ordenadas por nombre A a Z ***");

        Collections.sort(personas, new ComparatorNombreAZ());

        for (Persona p : personas) {
            System.out.println(p.nombre + " | " + p.edad);
        }
    }

}
