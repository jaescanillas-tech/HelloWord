package dev.jaescanillas;

/*
    Ejemplo profe sobre implementar clase basica en una entidad libro, dejando afuera
    la validación de stock y el control del prestamo del mismo
 */

public class Libro {
    private String title;
    private int year;
    private String author;
    private String isbn;

    public Libro(){
        this.title = "El resplandor";
        this.year = 1977;
        this.author = "Stephen King";
        this.isbn = "";
    }
    public Libro(String title, int year, String author, String isbn){
        this.title = title;
        this.year = year;
        this.author = author;
        this.isbn = isbn;
    }

    public boolean prestamo(String prestamo){
        return true;
    }

    public boolean disponibilidad(){
        return true;
    }

    public void devolver(String fechaDevolucion){

    }
}