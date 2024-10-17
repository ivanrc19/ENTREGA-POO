package model;

public class Almacen {
    private Libro []libros;




    public Libro[] getLibro() {
        return libros;
    }

    public void setLibro(Libro[] libro) {
        this.libros = libro;
    }


    public static Almacen ej1(){
        Almacen almacen= new Almacen();
        return almacen;
    }
}
