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

    /*
        Siempre arriba para crear un objeto (arriba del constructor)
     */

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

public class Prestamo{
    private Libro libro;
    private String nombre;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean devuelto;

    public Prestamo(Libro libro, String nombre, String fechaPrestamo){
        this.libro = libro;
        this.nombre = nombre;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
        this.devuelto = false;
        this.libro.prestamo();
    }

    public void registrarDevolucion(String fecha){
        this.fechaDevolucion = fecha;
        this.devuelto = true;
        this.libro.devolver();
    }
}