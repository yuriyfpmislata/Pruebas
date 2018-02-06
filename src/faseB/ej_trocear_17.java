package faseB;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;

public class ej_trocear_17 {

    public static void main(String[] args) {
        String frase = "Esta es la frase a invertir";
        
        // dividir por palabras
        String[] troceada = frase.split("\\s");
        
        // para poder imprimir las palabras al reves
        // se puede usar un simple for inverso
        for (int i = troceada.length - 1; i > -1; i--) {
            // imprimir la palabra, añadiendo el espacio
            // (ya que .split() no tiene posibilidad de devolver el delimitador)
            System.out.print(troceada[i] + " ");
        }
        
        // formato
        System.out.println("");
        
        // *** version ArrayDeque ***
        
        // crear el ArrayDeque pasandole al constructor el array "troceada"
        // se usa el metodo Arrays.asList para facilitar la tarea
        
        Deque<String> troceadaDeque = new ArrayDeque<>();
        
        for (int i = 0; i < troceada.length; i++) {
            troceadaDeque.addLast(troceada[i]);
        }
        
        // recorrer el ArrayDeque
        
        Iterator<String> it = troceadaDeque.iterator();
        
        while (it.hasNext()) {
            // imprimir la palabra, añadiendo el espacio
            // (ya que .split() no tiene posibilidad de devolver el delimitador)
            System.out.print(troceadaDeque.removeFirst() + " ");
        }
        
    }
    
}
