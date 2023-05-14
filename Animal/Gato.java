/*@CConde */

public class Gato extends Mamifero {
  private int edad; //edad del gato

  public Gato (int ed){
    super(ed);
    this.edad= 4;
  }

  public void salta(){
    System.out.println("El gato salta por los tejados");
  }

  public void caza() {
    System.out.println("El gato caza al ratón");
  }
}
