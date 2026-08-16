package dev.jaescanillas_tech;

/*
    Entrada a un cine dejando la id de la entrada, el nombre del cliente con la fecha de la funcion
    y el nombre de la pelicula, con funciones vacias desde comprar, la devolucion de la entrada y la
    validacion de esta
 */

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