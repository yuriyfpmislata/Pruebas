package faseB;

import java.util.StringTokenizer;

public class ej_trocear_16 {

    public static void main(String[] args) {
        String estructura = "1000+2000|3000+4000+1000|500+200+2000+2000";

        String delimExterno = "|";
        String delimInterno = "+";

        // dividir por operaciones
        StringTokenizer troceadoExterno = new StringTokenizer(estructura, delimExterno);

        int contE = 0;
        int contI = 0;
        while (troceadoExterno.hasMoreTokens()) {
            // mientras haya operaciones...
            // por cada una, dividir en operandos

            StringTokenizer troceadoInterno = new StringTokenizer(troceadoExterno.nextToken(), delimInterno);

            // almacenar resultado de la operacion fuera del while
            // para no perder el resultado
            int resultado = 0;
            
            while (troceadoInterno.hasMoreTokens()) {
                // mientras haya operandos...
                // por cada uno, mostrarlo y sumarlo
                String operando;
                
                // almacenar en una variable para no coger el siguiente token
                // (se usa 2 veces: imprimir y sumar)
                operando = troceadoInterno.nextToken();
                
                System.out.print(operando);
                resultado += Integer.parseInt(operando);

                // solo añadir "+" si no es el ultimo token
                if (troceadoInterno.hasMoreTokens()) {
                    System.out.print(" + ");
                } else {
                    // si es el ultimo, añadir el resultado
                    System.out.println("\n= " + resultado);
                }
            }
            
            // formato
            System.out.println("");
        }

    }

}
