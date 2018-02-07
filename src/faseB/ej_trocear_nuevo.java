package faseB;

public class ej_trocear_nuevo {

    public static void main(String[] args) {
        String csv = "750,12,68,0,635,214,123";
        int resultado = 0;
        
        String[] csvTroceado = csv.split(",");
        
        for (String trozo : csvTroceado) {
            resultado += Integer.parseInt(trozo);
        }
        
        System.out.println("El resultado es: " + resultado);
    }
    
}
