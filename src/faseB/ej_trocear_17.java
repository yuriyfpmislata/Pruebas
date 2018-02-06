package faseB;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ej_trocear_17 {

    public static void main(String[] args) {
        String frase = "Esta es la frase a invertir";
        
        // dividir por palabras
        String[] troceada = frase.split("\\s");
        
        // para poder imprimir las palabras al reves
        // se puede usar un simple for inverso
        for (int i = troceada.length - 1; i >= 0; i--) {
            // imprimir la palabra, añadiendo el espacio
            // (ya que .split() no tiene posibilidad de devolver el delimitador)
            System.out.print(troceada[i] + " ");
        }
        
        // formato
        System.out.println("");
        
        // *** VERSION ARRAYDEQUE ***
            
        Deque<String> troceadaDeque = new ArrayDeque<>();
        
        // añadir las palabras del array anterior al deque
        // addFirst de modo que se vayan añadiendo en order inverso
        for (String trozo : troceada) {
            troceadaDeque.addFirst(trozo);
        }
        
        // recorrer el ArrayDeque
        
        Iterator<String> it = troceadaDeque.iterator();        
        
        while (it.hasNext()) {
            // imprimir la palabra, añadiendo el espacio
            // (ya que .split() no tiene posibilidad de devolver el delimitador)
            System.out.print(it.next() + " ");
        }
        
        // formato
        System.out.println("");
    }
    
}
