/*@CConde */

public abstract class Canario extends Aves {
  private static String color; // color pajaro
  
  public Canario(String nombre, int edad) {
    super(nombre, edad);
  }

  public void vuela() {
    System.out.println("Estoy haciendo el caballito");
  }

  public void canta(){
    System.out.print("Amanece y empieza a cantar");
  }

  public void posa(){
    System.out.print("Pósate en un un arbol");
  }
}

