package model;
import static com.coti.tools.Esdia.*;

public class Almacen {
    private Libro[] Libros;
    private int nelementos;

    
    //___________________________________________________________________________________________________

    public Libro[] getLibros() {
        return Libros;
    }
    public void setLibros(Libro[] libros) {
        Libros = libros;
    }
    public int getNelementos() {
        return nelementos;
    }
    public void setNelementos(int nelementos) {
        this.nelementos = nelementos;
    }
    

    //___________________________________________________________________________________________________

    public Almacen(Libro[] libros, int nelementos) {
        Libros = libros;
        this.nelementos = nelementos;
    }
    //___________________________________________________________________________________________________
    public static Almacen crearAlmacen(){
      
        int nelementos= readInt("\nCuantos elementos tendrá su almacen:");
        Libro []libros= new Libro[nelementos];
        Almacen almacen= new Almacen(libros, nelementos);
        System.out.println("\n        ¡¡¡Almacen creado!!!! \n");
        return almacen;
    }

    //___________________________________________________________________________________________________
    //APARTADO 3
    public Libro addLibro(){
       
        System.out.print("      NUEVO LIBRO "+"  \n ------------------\n");

    
        String nomaut= readString("Nombre autor:");
        String apeaut=readString("Apellidos autor:");  
        String respuesta= readString("Premio Planeta(si/no):");
        boolean pPlaneta=false;
        while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")){
        respuesta= readString("Premio Planeta(si/no):");
    }
        if(respuesta.toLowerCase()!="si"){
        pPlaneta= true;
    
        }
        Autor autor= new Autor(nomaut, apeaut, pPlaneta);
        String titulo=readString("Titulo del libro:");
        int ano_publicacion= readInt("Año de publicacion :");
        int paginas= readInt("Número de páginas :");
        float precio= readFloat("Precio  :");
       
    Libro nuevolibro= new Libro(autor,titulo,ano_publicacion, paginas, precio);
    String guion="-".repeat(120);
    System.out.println(guion);
    
        return nuevolibro;
    }



    //___________________________________________________________________________________________________

    //APARTADO 4
    public void imprimeAlmacen(Almacen a,float tiempodelectura){
        float sumaTLM=0;
        float sumaPrecio=0;
        float tml;
    if(a.nelementos!=0){
      int n;
      String pPlaneta;
      String guion="-".repeat(140);
      String espacios=" ".repeat(117);
      System.out.print("|"+guion+"|\n"+ "|  LIBROS EN EL ALMACÉN " +espacios+"|\n"+"|"+guion+"|\n"+ "|" );
      System.out.println(" Titulo                    | Año Publicacion | Autor                    | Premio Planeta |  Páginas  | Tiempo Lectura Minutos |       Precio|\n"+"|"+guion+"|");
        
     
      for(n=0;n<a.nelementos;++n){
       //PARA QUE SOLO IMPRIMA LOS LIBROS CON INFORMACIÓ1
       
       if(a.Libros[n]!=null){

        //CREACIÓN STRING PREMIO PLANETA
        if(a.Libros[n].getAutor().isPremioPlaneta()==true){
            pPlaneta="Si";
        }else{
            pPlaneta="No";
        }
            //CÁLCULO DE ESPACIOS DE TITULO
            int numEspaciosTit=26- a.Libros[n].getTitulo().length();
            String espacioTit= " ".repeat(numEspaciosTit);
             //CÁLCULO DE ESPACIOS DE AÑO DE PUBLICACIÓN
            int numEspaciosAñoPubli=16- String.valueOf(a.Libros[n].getAno_publicacion()).length();
            String espacioAnoPubli= " ".repeat(numEspaciosAñoPubli);

            //CÁLCULO DE ESPACIOS DE AUTOR
            int numEspaciosAut=25- (a.Libros[n].getAutor().getNombre().length()+1+a.Libros[n].getAutor().getApellido().length());
            String espacioAut= " ".repeat(numEspaciosAut);

            //CÁLCULO DE ESPACIOS DE Páginas
            int numEspaciosPags=10- String.valueOf(a.Libros[n].getPaginas()).length();
            String espacioPags= " ".repeat(numEspaciosPags);

            //CÁLCULO DE TIEMPO LECTURA MINUTOS Y ESPACIOS
            tml=a.Libros[n].getPaginas()/tiempodelectura;
            sumaTLM+=tml;
            int numEspaciosTLM=24- String.valueOf(tml).length();
            String espacioTLM= " ".repeat(numEspaciosTLM);

            //CÁLCULO DE ESPACIOS DE PRECIO Y PRECIO TOTAL
            sumaPrecio+=a.Libros[n].getPrecio();
            int numEspaciosPrec=12- String.valueOf(a.Libros[n].getPrecio()).length();
            String espacioPrec= " ".repeat(numEspaciosPrec);


            

            System.out.printf("| "+a.Libros[n].getTitulo()+espacioTit+"| "+a.Libros[n].getAno_publicacion()+espacioAnoPubli+"| "+a.Libros[n].getAutor().getNombre()+" "+a.Libros[n].getAutor().getApellido()+espacioAut+"|       "+pPlaneta+"       | "
            +a.Libros[n].getPaginas()+espacioPags+"|"+espacioTLM+tml+"|"+espacioPrec+a.Libros[n].getPrecio()+"$|\n|"+guion+"|\n");
    }
    }
     //CÁLCULO DE ESPACIOS DE TIEMPO DE LECTURA TOTAL
     
     int numEspaciosTLT=86- String.valueOf(sumaTLM).length();
     String espacioTLT= " ".repeat(numEspaciosTLT);
     System.out.println("| Tiempo de lectura total del almacén"+ espacioTLT+sumaTLM+" min|             |");
     int numEspaciosPrecT=113- String.valueOf(sumaPrecio).length();
     String espacioPrecT= " ".repeat(numEspaciosPrecT);
     System.out.println("| Valor total del almacén: "+ espacioPrecT+sumaPrecio+"$|"+"\n|"+guion+"|");


     }else{
        System.out.printf("\n\n\n           ¡¡¡NO HAY LIBROS EN EL ALMACEN!!!          \n\n\n");
     
    }
    }
    }
    


