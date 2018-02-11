package pruebas.interfaces;

public class Movil implements APIMovil, APISmartphone {

    boolean encendido = false;
    boolean conectado = false;
    String IMEI;
    String MAC;

    public Movil(String IMEI, String MAC) {
        this.IMEI = IMEI;
        this.MAC = MAC;
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
    public String getIMEI() {
        return IMEI;
    }

    @Override
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public String getMAC() {
        return MAC;
    }

    @Override
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }

    @Override
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public void conectarseInternet() {
        this.conectado = true;
    }

    @Override
    public void desconectarseInternet() {
        this.conectado = true;
    }
}
