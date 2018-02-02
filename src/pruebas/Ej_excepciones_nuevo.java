package pruebas;

import java.util.Scanner;

public class Ej_excepciones_nuevo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entradaNombre;
        int entradaEdad;

        try {
            System.out.println("Introduce tu edad: ");
            System.out.print("> ");
            entradaEdad = Integer.parseInt(sc.nextLine());

            if (entradaEdad < 18) {
                throw new Excepcion_menor18_nombreInvalido("Debes ser mayor de 18.");
            }

        } catch (Excepcion_menor18_nombreInvalido e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("Introduce tu nombre: ");
            System.out.print("> ");
            entradaNombre = sc.nextLine();

            char[] caracteresNombre = entradaNombre.toCharArray();
            
            for (int i = 0; i < caracteresNombre.length; i++) {
                if (Character.isDigit(caracteresNombre[i])) {
                    throw new Excepcion_menor18_nombreInvalido("El nombre no puede incluir números.");
                }
            }

        } catch (Excepcion_menor18_nombreInvalido e) {
            System.err.println(e.getMessage());
        }
    }

}
