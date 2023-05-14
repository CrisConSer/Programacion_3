/* Ejercicio 1 - Arrays
* @author: Cristina Conde
*/

public class PruebaGatoA {
  public static void main(String[] args) {
    // Creación de 4 gatos
    Gato[] gatos = new Gato[4];

    // Introducimos los datos de cada gato utilizando un bucle for

    for (int i=0; i<gatos.length; i++){
      String nombre = "Gato" + (i+1);
      String color = "Blanco";
      String raza = "Siames";
      int edad= 2;
      double peso = 3.5;

      // Creamos un nuevo gato y lo añadimos al array

      gatos[i] = new Gato(nombre, color, raza, edad, peso);
    }

    // Mostramos los datos de todos los gatos utilizando otro bucle for

    for (int i=0; i<gatos.length; i++){
      System.out.println(gatos[i].toSTString(i));
    }

    // Hacemos que los gatos maullen
    for(int i=0; i<gatos.length; i++){
      System.out.println(gatos[i].maulla());
    }
    // Hacemos que los gatos corran
    for(int i=0; i<gatos.length; i++){
      System.out.println(gatos[i].corre());
    }


    
  }
  
}
