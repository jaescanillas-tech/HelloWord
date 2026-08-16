package dev.jaescanillas_tech;

/*
    se creo estudiantes con su nombre completo, aparte de asignar un curso a este, aparte
    se creo otro llamado curso donde esta la cantidad de alumnos, el curso en si y entre otras cosas
 */

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
    private Integer cantidadAlumnos;
    private String nombrecurso;
    private Boolean paseo;
    private String Alianza;

    public Curso(){
        this.cantidadAlumnos = 23;
        this.nombrecurso = "4° Medio C";
        this.paseo = true;
        this.Alianza = "Roja";
    }

    public Curso(Integer cantidadAlumnos, String nombrecurso, Boolean paseo, String Alianza){
        this.cantidadAlumnos = cantidadAlumnos;
        this.nombrecurso = nombrecurso;
        this.paseo = paseo;
        this.Alianza = Alianza;
    }

    public boolean paseocurso(){
        return true;
    }

    public boolean presentealumno(){
        return true;
    }

    public boolean bailsecurso(){
        return true;
    }
}