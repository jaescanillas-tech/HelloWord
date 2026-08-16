package dev.jaescanillas_tech;

/*
    paciente registrado por rut, nombre completo, aparte de la atencion, la prioridad de atencion
    la entrega de remedios.
 */

public class Paciente {
    private String run;
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    public Paciente(){
        this.run = "12.123.123.K";
        this.nombre = "Camila";
        this.apellidoP = "Simpson";
        this.apellidoM = "colon";
    }

    public Paciente(String run, String nombre, String apellidoP, String apellidoM) {
        this.run = run;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    public boolean Atencion(){
        return true;
    }

    public void Prioridad(){

    }

    public void EntregaRemedios(){

    }

}

