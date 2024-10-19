
import model.Almacen;
import static com.coti.tools.Esdia.*;

public class App {
    public static void main(String[] args) {

     //Decaracion de variables
    

      boolean salida=true;
      float tiempolectura=1;
      int opcion;
      Almacen almacen=null;
      int nlibro=0;
      String guion="-".repeat(60);
      //Menu
      System.out.println("|"+guion+"|\n|  MIS LIBROS                                                |\n" +"|"+guion+"|\n"+ "    1)    Nuevo almacen de libros\n" + "    2)     Establecer ritmo de lectura (páginas por minuto)\n"+"    3)     Añadir un nuevo libro al almacén\n"+"    4)     Mostrar información actual de libros\n"+"    5)     Salir (se borrará toda la información)\n"+"|"+guion+"|");
      

      do{
      
        opcion=readInt("Opcion :");

      switch (opcion) {
        case 1:
            //CREAR ALMACEN (APARTADO 1)
            almacen=Almacen.crearAlmacen();
            nlibro=0;
            break;

        case 2:
            //GUARDAR TIEMPO LECTURA(APARTADO 2)
        tiempolectura=readFloat("Introduzca tiempo de lectura:");
        break;   
    
        case 3: 
            //AÑADIR LIBROS AL ALMACEN(APARTADO 3)
            if(almacen!=null){
              if(nlibro<almacen.getNelementos()){
              almacen.getLibros()[nlibro]= almacen.addLibro();
              ++nlibro;
              System.out.println("\nNUMERO DE LIBROS EN EL ALMACEN: "+nlibro+"\nHUECOS RESTANTES: "+(almacen.getNelementos()-nlibro));
              }else{
                System.out.print("\n\n\n        ¡¡¡EL ALMACÉN ESTÁ LLENO!!! \n\n\n");
              }
            }else{
              System.out.print("\n\n\n        ¡¡¡PRIMERO CREA UN ALMACEN!!! \n\n\n");
            }
            break;
            
        case 4:
          //IMPRIMIR ALMACEN ACTUAL(APARTADO 4)
        if(almacen!=null){

            almacen.imprimeAlmacen(almacen,tiempolectura);
          }else{
            System.out.print("\n\n\n        ¡¡¡PRIMERO CREA UN ALMACEN!!! \n\n\n");
          }
        break;

        case 5:
          //SALIR DEL PROGRAMA
            salida=false;
            break;
      
        default:
            break;
      }
    }while(salida);

    


}

}