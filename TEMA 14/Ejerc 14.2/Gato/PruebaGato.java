/* Ejercicio 1 - Sin Arrays
* @author: Cristina Conde
*/

public class PruebaGato {
  public static void main(String[] args) {
    
    // Creamos los 4 gatos

    Gato Tom = new Gato("Tom", "Negro", "Persa", 1, 5.5);
    Gato Jerry = new Gato("Jerry", "Blanco", "Siames", 3 , 4.5);
    Gato Genry = new Gato("Genry", "Marron y blanco","ragdoll" , 7, 5.78);
    Gato Jimmy = new Gato("Jimmy", "Blanco y negro", "Angora", 3, 4.10);

    //Mostramos el nombre y la raza del gato
    System.out.println("mi gato se llama " + Tom.getNombre());
    System.out.println("Es de la raza " + Tom.getRaza());
    System.out.println("mi gato se llama " + Jerry.getNombre());
    System.out.println("Es de la raza " + Jerry.getRaza());
    System.out.println("mi gato se llama " + Genry.getNombre());
    System.out.println("Es de la raza " + Genry.getRaza());
    System.out.println("mi gato se llama " + Jimmy.getNombre());
    System.out.println("Es de la raza " + Jimmy.getRaza());

    //Ahora hacemos que los gatos realicen acciones

    System.out.println("Tom: " + Tom.acecha());
    System.out.println("Jerry: "+ Jerry.corre());
    System.out.println("Genry: " + Genry.maulla());
    System.out.println("Jimmy:" + Jimmy.raspa());

    //Ahora alimentamos a los gatos con diferentes comidas

    Tom.comer("pollo");
    Jerry.comer("pescado");
    Genry.comer("galletas");
    Jimmy.comer("pescado");
  }
}
