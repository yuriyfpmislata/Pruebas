package pruebas;

import java.util.StringTokenizer;

public class Pruebas {

    public static void main(String[] args) {
        String cadena = "este texto se dividirá en palabras";
        StringTokenizer troceado = new StringTokenizer(cadena, "");
        
        while (troceado.hasMoreTokens()) {
            System.out.println(troceado.nextToken());
        }
    }

}
