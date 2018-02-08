package pruebas;

public class Pruebas {

    public static void main(String[] args) {
        Movil miMovil = new Movil("46478854848778");
        
        System.out.println("Mi movil tiene IMEI: " + miMovil.getImei() + " y su estado de encendido es: " + miMovil.estaEncendido());
    }

}
