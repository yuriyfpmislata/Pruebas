package pruebas;

public interface APIMovil {
    public boolean estaEncendido();
    public void setEncendido(boolean encendido);
    
    public String getImei();
    public void setImei(String imei);
}
