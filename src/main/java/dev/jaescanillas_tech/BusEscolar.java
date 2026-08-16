package dev.jaescanillas_tech;

/*
    Se crea clase objeto de bus escolar, dejando como atributos la patente, el conductor del bus
    el destinatario y la capacidad de alumnos que puede llevar dependiendo del bus
 */

public class BusEscolar {
    private String patente;
    private String conductor;
    private String destino;
    private int capacidad;

    public BusEscolar(){
        this.patente = "AB12CS";
        this.conductor = "Diego Larrys";
        this.destino = "Colegio Rosario Concha";
        this.capacidad = 15;
    }

    public BusEscolar(String patente, String conductor, String destino, int capacidad) {
        this.patente = patente;
        this.conductor = conductor;
        this.destino = destino;
        this.capacidad = capacidad;
    }

    public void ingresarDestino(){

    }

    public void ingresoEstudiantes(){

    }

    public void mostrarinformacion(){

    }

}