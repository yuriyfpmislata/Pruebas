package pruebas;

import java.util.StringTokenizer;

public class Pruebas {

    public static void main(String[] args) {
        String texto= "dividir en palabras";      
        
        // *** StringTokenizer ***
        
        // por defecto

        StringTokenizer tokenizado = new StringTokenizer(texto);
        
        System.out.println("> Tokenizado por defecto: ");
        while (tokenizado.hasMoreTokens()) {
            System.out.println(tokenizado.nextToken());
        }
        
        // pasando delimitador
        
        StringTokenizer tokenizadoDelimitador = new StringTokenizer(texto, "d");
        
        System.out.println("> Tokenizado por delimitador: ");
        while (tokenizadoDelimitador.hasMoreTokens()) {
            System.out.println(tokenizadoDelimitador.nextToken());
        }
        
        // pasando delimitador y devolviendolo
        
        StringTokenizer tokenizadoDelimitadorDevolver = new StringTokenizer(texto, "d", true);
        
        System.out.println("> Tokenizado por delimitador y devolviendolo: ");
        while (tokenizadoDelimitadorDevolver.hasMoreTokens()) {
            System.out.println(tokenizadoDelimitadorDevolver.nextToken());
        }
        
        
        // *** String.split() ***
        
        String[] spliteado = texto.split("\\s");
       
        System.out.println("> Spliteado por espacios");
        for (String trozo : spliteado) {
            System.out.println(trozo);
        }
        
    }

}
