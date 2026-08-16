package dev.jaescanillas_tech;

public class EntradaCine {
    private int id;
    private String cliente;
    private String fecha;
    private String movie;

    public EntradaCine(){
        this.id = 100;
        this.cliente = "Sofia";
        this.fecha = "5 Agosto, 2023";
        this.movie = "El Principito";
    }

    public EntradaCine(int id, String cliente, String fecha, String movie){
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.movie = movie;
    }

    public void validarEntrada(){

    }
    public void comprarEntrada(){

    }
    public void devolucionEntrada(){

    }
}