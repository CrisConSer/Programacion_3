/*@CConde */

public class Perro extends Mamifero {
  private int patas; // número de patas
  
  public Perro(int p) {
    super(p);
    this.patas = p;
  }

  public void ladra() {
    System.out.println("El perro ladra por la noche");
  }

  public void pontePie() {
    System.out.println("El perro anda a dos patas");
  }

  public void tumba() {
    System.out.println("El perro se tumba");
  }
}