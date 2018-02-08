package pruebas;

public class Movil implements APIMovil{

    boolean encendido = false;
    String imei;
    
    public Movil(String imei) {
        this.imei = imei;
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String getImei() {
        return imei;
    }

    @Override
    public void setImei(String imei) {
        this.imei = imei;
    }
    
    
    
}
