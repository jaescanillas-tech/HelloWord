package dev.jaescanillas_tech;

public class PedidoDelibery {
    private int Id;
    private String cliente;
    private String estado;
    private double total;

    public PedidoDelibery(){
        this.Id = 100;
        this.cliente = "Paula";
        this.estado = "En camino";
        this.total = 10893;
    }

    public PedidoDelibery(int Id, String cliente, String estado, double total){
        this.Id = Id;
        this.cliente = cliente;
        this.estado = estado;
        this.total = total;
    }

    public void entrega(){

    }

    public void reviewInfo(){

    }
    public void agregarMonto(){

    }
}