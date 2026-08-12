package dev.jaescanillas;

/*
    La creacion de producto con su verificacion de stock, precio y
    venta del producto
 */

public class Producto {
    private String codigo;
    private String nombre;
    private int precio;
    public int stock;

    public Producto(){
        this.codigo = "001A";
        this.nombre = "Maruchan";
        this.precio = 1250;
        this.stock = 5;
    }

    public Producto(String codigo, String nombre, int precio, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean verificaStock(){
        return true;
    }

    public boolean verificaPrecio(){
        return true;
    }

    public void CompraProducto(){

    }
}