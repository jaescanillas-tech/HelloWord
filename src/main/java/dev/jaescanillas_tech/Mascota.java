package dev.jaescanillas_tech;

/*
    se crea mascotas con el nombre de la mascota, el tipo de animal, la raza de esta y el peso el cual funciona
    igual para la vacinacion o examenes
 */

public class Mascota {
    private String nombre;
    private String tipoAnimal;
    private String raza;
    private double peso;

    public Mascota(){
        this.nombre = "Teddy";
        this.tipoAnimal = "Perrito";
        this.raza = "Puddle Toys";
        this.peso = 3.2;
    }

    public Mascota(String nombre, String tipoAnimal, String raza, double peso){
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean vacuna(){
        return true;
    }

    public void examen(String tipoExamen){

    }

    public void seguimiento(String fechaExamenes){

    }
}