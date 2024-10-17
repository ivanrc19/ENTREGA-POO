import java.util.Scanner;
import model.Almacen;
import model.Libro;
import model.Autor;

public class App {
    public static void main(String[] args) {
    
        Scanner scanner= new Scanner(System.in);
      
      
      //Decaracion de variables
      
    
      boolean salida=true;
      float tiempolectura=1;
      int opcion;

      


      do{
        System.out.println("|  MIS LIBROS  |\n" + "1) Nuevo almacen de libros\n " + "2)Establecer ritmo de lectura (páginas por minuto)\n"+"3)Añadir un nuevo libro al almacén\n"+"4) Mostrar información actual de libros\n"+"5) Salir (se borrará toda la información)\n");
        System.out.printf("Opcion:");
        opcion= scanner.nextInt();
      switch (opcion) {
        case 1:
            Almacen almacen=Almacen.ej1();
            break;

        case 2:
        System.err.printf("Introduzca tiempo de lectura:");
        tiempolectura=scanner.nextFloat();
        break;   
    
        case 3:
            almacen.libro 
            System.out.println("Introduzca los datos de su libro \n ___________________________\nAutor: ");
            
        case 4:
            
        break;

        case 5:
            salida=false;
            break;
      
        default:
        System.out.println("\nOPCION INCORRECTA !!!!");
            break;
      }
    }while(salida);

   

}
}
