/*@CConde */

public class Pinguino extends Mamifero {
  private int pinones; // número de piñones
  private int bigotes;
  
  public Pinguino(int b, int bigotes) {
    super(b);
    this.bigotes = bigotes;
  }

  public void maulla() {
    System.out.println("El gato maulla porque tiene hambre");
  }

  public void caza() {
    System.out.println("El gato caza ratones");
  }

  public void esconde() {
    System.out.println("el gato se esconde debajo de la cama");
  }
}