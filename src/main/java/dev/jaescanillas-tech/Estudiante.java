package dev.jaescanillas;


public class Estudiante {
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String curso;

    public Estudiante() {
        this.Nombre = "Michael";
        this.ApellidoP = "Larris";
        this.ApellidoM = "Smith";
        this.curso = "3 año";
    }

    public Estudiante(String Nombre, String ApellidoP, String ApellidoM, String curso) {
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.curso = curso;
    }

    public boolean pasarCurso() {
        return false;
    }

    public boolean repetircurso() {
        return true;
    }

    public void Asignarcurso(){

    }
}

public class Curso{

}