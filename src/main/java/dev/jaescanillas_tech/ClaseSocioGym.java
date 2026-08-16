package dev.jaescanillas_tech;

/*
    se crea socio gym en el cual esta identificado por el run, en el cual se genero
    la funcion de registro comprar packetes para el gym y el metodo pago del cliente.
 */

public class ClaseSocioGym {
    private String run;
    private String nombre;
    private String apellido;
    private String generoidentificado;

    public ClaseSocioGym(){
        this.run = "12.123.123-1";
        this.nombre = "Claudio";
        this.apellido = "Espinoza";
        this.generoidentificado = "M";
    }

    public ClaseSocioGym(String run, String nombre, String apellido, String generoidentificado) {
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.generoidentificado = generoidentificado;
    }

    public void registro(){

    }

    public void comprapacketes(){

    }
    public void metodopago(){

    }
}