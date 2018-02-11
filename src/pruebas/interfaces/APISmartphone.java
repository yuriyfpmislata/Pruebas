package pruebas.interfaces;

public interface APISmartphone {
    public String getMAC();
    public void setMAC(String MAC);
    
    public boolean estaConectado();
    public void setConectado(boolean conectado);
    
    public void conectarseInternet();
    public void desconectarseInternet();
}
