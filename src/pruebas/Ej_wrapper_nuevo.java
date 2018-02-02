package pruebas;

import java.util.Scanner;

public class Ej_wrapper_nuevo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        System.out.println("Introducir número de teléfono español, con el prefijo y sin espacios: ");
        entrada = sc.nextLine();
        

        // debe ser "+34"
        String primerosCaracteres = entrada.substring(0, 3);
        String restoCaracteres = entrada.substring(3);

        if (primerosCaracteres.length() == 3
                && primerosCaracteres.equals("+34")
                && restoCaracteres.length() == 9) {
            try {
                // probar a pasar el resto de caracteres a Integer, fallará en caso de encontrar alguna letra
                Integer.parseInt(restoCaracteres);

                System.out.println("El formato del número introducido es VALIDO.");
            } catch (Exception e) {
                System.err.println("El formato del número introducido es INVALIDO.");
            }
        } else {
            System.err.println("El formato del número introducido es INVALIDO.");
        }
    }

}
