package model;

public class Libro {
    private Autor autor;
    private String titulo;
    private int Ano_publicacion;
    private int paginas;
    private float precio;



    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAno_publicacion() {
        return Ano_publicacion;
    }
    public void setAno_publicacion(int ano_publicacion) {
        Ano_publicacion = ano_publicacion;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float tiempodelectura(float tiempopagina, float pagslibro){
        float tiempolectura;
        tiempolectura= pagslibro/tiempopagina;
        return tiempolectura;
    }


    public Libro(Autor autor, String titulo, int ano_publicacion, int paginas, float precio) {
        this.autor = autor;
        this.titulo = titulo;
        Ano_publicacion = ano_publicacion;
        this.paginas = paginas;
        this.precio = precio;
    }


}
