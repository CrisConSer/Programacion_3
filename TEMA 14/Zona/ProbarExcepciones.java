
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {
  
  //Realizar la primera función StackOverflowError llamamos a la funcion una y otra vez (recursiva) 
  // de esta forma estamos provocando que sea un bucle infinito y de esta forma lo evitamos
  public static void Sofe()throws StackOverflowError{
    Sofe();
  }

  // Realizar la segunda funcion NumberFormatException hace que cuando declaro la variable nombre tipo string
  // al pasar la variable nombre2 hace una conversión incorrecto de String a int
  public static void Nfe()throws NumberFormatException{
    String nombre = "Cris";
    int nombre2=Integer.parseInt(nombre);
  }

  //Realizar la tercera función ArrayIndexOutOfBoundsException esto hace que si elegimos un intervalo fuera del rango salga un error

  public static void Aiobe()throws NumberFormatException{
    int [] rango={1,2,3,4};
    int numero=rango[8]; //Error ya que no hemos definido un rango 8
  }

  // Realizar la cuarta funcion FileNotFoundException que muestra un fichero y en caso de que el fichero sea incorrecto salta el error
  public static void Fnfe()throws FileNotFoundException{
    File fichero = new File("Málaga.txt");
    Scanner nombre = new Scanner (fichero);
  }

  //Realir la quinta función ArithmeticException que hace que salte un error cuando un número X es dividido entre 0
  public static void Aex()throws ArithmeticException{
    int funcion;
    funcion = 5/0;
  }

  public static void main (String [] args){
    Scanner s = new Scanner (System.in);

    int menu=0;

    do{
      System.out.println("");
      System.out.println("------Control de excepciones------");
      System.out.println("");
      System.out.println("1: Provoca un error StackOverFlowError");
      System.out.println("2: Provoca una excepción NumberFormatException ");
      System.out.println("3: Provoca una excepción ArrayIndexOutOfBoundsException");
      System.out.println("4: Provoca una excepción FileNotFoundException");
      System.out.println("5: Provoca una excepción ArithmeticException");
      System.out.println("6: Salir del programa");
      System.out.println("-------------------------------------------------");

      
      System.out.print("\nElige una opción: ");
      menu = s.nextInt();

      try{
        switch(menu){
          case 1:
          Sofe();
          break;
          case 2:
          Nfe();
          break;
          case 3:
          Aiobe();
          break;
          case 4:
          Fnfe();
          break;
          case 5:
          Aex();
          break;
          default:
          System.out.println("Saliendo del programa...");
          System.out.println("Gracias por usar CONTROL DE EXCEPCIONES.");

        }

      } catch(StackOverflowError e){
        System.out.println("");
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error: " + e.getClass());
        System.out.println("Estas llamando a la función una y otra vez por lo que se crea un bucle infinito");
      }
      
      catch(NumberFormatException e){
        System.out.println("");
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error: " + e.getClass());
        System.out.println("Has marcado un carácter (letra) incorrecto, ya que el definido es un número");
      }
      
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("");
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error: " + e.getClass());
        System.out.println("El rango que has puesto está fuera del definido");
      }
      
      catch(FileNotFoundException e){
        System.out.println("");
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error: " + e.getClass());
        System.out.println("No se encuentra el fichero Málaga.txt, por favor, introduce el nombre del fichero correcto");

      }
      
      catch(ArithmeticException e){
        System.out.println("");
        System.out.println("Error: " + e.getMessage());
        System.out.println("Error: " + e.getClass());
        System.out.println("Se trata de un error aritmétrico ya que se ha divido un número X entre 0");
      }
      

    }while(menu!=5);

  s.close();
  }
}
