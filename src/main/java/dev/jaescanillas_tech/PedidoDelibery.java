package dev.jaescanillas_tech;

/*
    pedido de delibery el cual se identifica con el id del pedido, el cliente, el estado del pedido
    el total del pedido a pagar, con el metodo de entraga del pedido, la informacion de este.
 */

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