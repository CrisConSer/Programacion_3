/*@CConde */

public class Mamifero extends Animal {
  private int pinones; // número de piñones
  
  public Mamifero(String nombre, int edad) {
    super(nombre, edad);
    
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }

  public void pontePie() {
    System.out.println("Estoy de pie en la bici, yujuuuuuu");
  }

  public void timbre() {
    System.out.println("Aparten que voy");
  }
}