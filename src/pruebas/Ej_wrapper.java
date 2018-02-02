package pruebas;

import java.util.Scanner;

public class Ej_wrapper {

    /*
        Crea un programa que recoge por teclado un dato en formato texto,
        usando nextLine(), e indica si se corresponde con un NIF, es decir 8 digitos
        y una letra. Utiliza las wrapper class
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        System.out.println("Introducir NIF: ");
        entrada = sc.nextLine();

        char[] arrayEntrada = entrada.toCharArray();

        if (arrayEntrada.length == 9                    // longitud de 9 caracteres
            && Character.isDigit(arrayEntrada[0])       // 1 digito
            && Character.isDigit(arrayEntrada[1])       // 2 digito
            && Character.isDigit(arrayEntrada[2])       // 3 digito
            && Character.isDigit(arrayEntrada[3])       // 4 digito
            && Character.isDigit(arrayEntrada[4])       // 5 digito
            && Character.isDigit(arrayEntrada[5])       // 6 digito
            && Character.isDigit(arrayEntrada[6])       // 7 digito
            && Character.isDigit(arrayEntrada[7])       // 8 digito
            && Character.isLetter(arrayEntrada[8])      // letra
        ) {
            System.out.println("El NIF es valido.");
        } else {
            System.err.println("El NIF es INVALIDO");
        }
    }

}
