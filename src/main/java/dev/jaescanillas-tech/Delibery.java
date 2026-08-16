package dev.jaescanillas-tech;

public class Pedido{
    private  String ID;
    private String IDCliente;
    private String restaurante;
    private String IDRepartidor;

    public Pedido(){
        this.ID = "002DS02A2";
        this.IDCliente = "12.345.678-9";
        this.restaurante = "Mc Donals";
        this.IDRepartidor = "21.543.876-K";
    }

    public Pedido(String ID, String IDCliente, String restaurante ,String IDRepartidor){
        this.ID = ID;
        this.IDCliente = IDCliente;
        this.restaurante = restaurante;
        this.IDRepartidor = IDRepartidor
    }

    public String getID() {
        return ID;
    }

    public String getIDCliente() {
        return IDCliente;
    }

    public String getIDRepartidor() {
        return IDRepartidor;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void Entrega(){

    }
    public void IniciarPedido(){

    }

    public void PagarPedido(){

    }
}