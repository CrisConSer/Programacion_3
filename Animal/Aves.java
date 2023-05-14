/*@CConde */

public abstract class Aves extends Animal {
  
  public Aves(String nombre, int edad) {
    super(nombre, edad);
  }
  
  public abstract void volar();
  
  public void hacerSonido() {
    System.out.println("El " + this.getClass().getSimpleName() + " hace un sonido.");
  }
}