package pruebas;

public class Pruebas {

    public static void main(String[] args) {
        Movil miMovil = new Movil("46478854848778", "4FD6:920A");
        
        System.out.println("Mi movil tiene IMEI: " + miMovil.getIMEI());
        System.out.println("Esta encendido? " + miMovil.estaEncendido());
        System.out.println("Esta conectado a Internet? " + miMovil.estaConectado());
        
        System.out.println("..........");
        
        System.out.println("Encendiendo movil...");
        miMovil.encendido = true;
        
        System.out.println("Conectando a Internet...");
        miMovil.conectarseInternet();
        
        System.out.println("Esta encendido? " + miMovil.estaEncendido());
        System.out.println("Esta conectado a Internet? " + miMovil.estaConectado());
    }

}
