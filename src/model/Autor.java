package model;

public class Autor {
   private String[] nombre; 
   private String[] apellido;
   private boolean premioPlaneta;


public String[] getNombre() {
    return nombre;
}
public void setNombre(String[] nombre) {
    this.nombre = nombre;
}
public String[] getApellido() {
    return apellido;
}
public void setApellido(String[] apellido) {
    this.apellido = apellido;
}
public boolean isPremioPlaneta() {
    return premioPlaneta;
}
public void setPremioPlaneta(boolean premioPlaneta) {
    this.premioPlaneta = premioPlaneta;
}
}

