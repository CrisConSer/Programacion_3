/*
 * @CConde
 */

import java.util.Scanner;
public class pruebaZona2{

  public static void main(String[] args){
     // instancias
      Zona zonaPrincipal=new Zona(1000);
      Zona zonaCompraVenta=new Zona(200);
      Zona zonaVIP=new Zona(25);

    /*********************************************/

     // scanner
      Scanner input=new Scanner(System.in);
      String opcion="";

    /*********************************************/

     // menú
    int opcionNum=0;
    int zonaNum;
    do{
     // output
    System.out.println("Menú:");
    System.out.println("1. Mostrar número de entradas libres");
    System.out.println("2. Vender entradas");
    System.out.println("3. Salir");
    System.out.print("Elige una opción: ");

    /*cambiamos esta opcion para poder controlar el programa mediante try/catch
    opcion=input.nextInt();
    Añadimos a partir de aqui las nuevas lineas*/

    opcion = input.nextLine();

    try{
      opcionNum=Integer.parseInt(opcion);
    }
     /*Usamos la excepcion con getClass y getMessage */

    catch (Exception e){
      zonaNum=0;
      System.out.println("Excepcion: " + e.getClass());
      System.out.println(("Error: " + e.getMessage()));
      System.out.println("Este numero no es valido");
    }
      /************************/
    // switch -- cambiamos el opcion por opcionNum
    switch(opcionNum){
        case 1:
          System.out.println("Entradas disponibles en la zona principal: "+zonaPrincipal.getEntradasPorVender());
          System.out.println("Entradas disponibles en la zona de compra-venta: "+zonaCompraVenta.getEntradasPorVender());
          System.out.println("Entradas disponibles en la zona VIP: "+zonaVIP.getEntradasPorVender());
        break;   /*************/

        case 2:
          System.out.print("¿Para qué zona quieres las entradas? (1 - Principal, 2 - Compra-Venta, 3 - VIP): ");
          String zona=input.nextLine();

    /*cambiamos esta opcion para poder controlar el programa mediante try/catch
    opcion=input.nextInt();
    Añadimos a partir de aqui las nuevas lineas*/

            zonaNum=Integer.parseInt(zona);

            try{
              zonaNum=Integer.parseInt(zona);
            }
            catch (Exception e){
              zonaNum=0;
              System.out.println("Excepcion: " + e.getClass());
              System.out.println(("Error: " + e.getMessage()));
              System.out.println("Este numero no es valido");
            }

          System.out.print("¿Cuántas entradas quieres? ");
            int numEntradas=input.nextInt();

    switch(zonaNum){
      case 1:
        zonaPrincipal.vender(numEntradas);
      break;

      case 2:
        zonaCompraVenta.vender(numEntradas);
      break;

      case 3:
        zonaVIP.vender(numEntradas);
      break;

      default:
      System.out.println("Zona no válida.");
      break;
    }
    break;

      case 3:
      System.out.println("Saliendo del programa...");
      break;

      default:
      System.out.println("Opción no válida.");
      break;
    }
    input.nextLine();

    /*********************************************/

    }while(opcionNum!=3);

     // cierre de scanner
    input.close();
  }
}