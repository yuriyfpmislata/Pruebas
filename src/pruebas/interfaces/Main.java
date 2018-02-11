package pruebas.interfaces;

public class Main {

    public static void main(String[] args) {
        Movil miMovil = new Movil("46478854848778", "4FD6:920A");
        
        System.out.println("Mi movil tiene IMEI: " + miMovil.getIMEI());
        System.out.println("Mi movil tiene MAC: " + miMovil.getMAC());
        System.out.println("Esta encendido? " + miMovil.estaEncendido());
        System.out.println("Esta conectado a Internet? " + miMovil.estaConectado());
        
        System.out.println("..........");
        
        System.out.println("Encendiendo movil...");
        miMovil.setEncendido(true);
        
        System.out.println("Conectando a Internet...");
        miMovil.conectarseInternet();
        
        System.out.println("Esta encendido? " + miMovil.estaEncendido());
        System.out.println("Esta conectado a Internet? " + miMovil.estaConectado());
        
        /* polimorfismo */
        
        APISmartphone miEstrictamenteSmartphone;
        
        miEstrictamenteSmartphone = miMovil;
        
        System.out.println(miEstrictamenteSmartphone.getMAC());
    }
    
}
