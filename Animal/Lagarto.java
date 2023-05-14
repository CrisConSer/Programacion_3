/*@CConde */

public class Lagarto extends Animal{
  private int longitud; // longitud que tiene el lagarto

  public Lagarto(String nombre, int edad) {
    super(nombre, edad);
    this.longitud=120;
  }
  public void reptar () {
    System.out.println("El lagarto repta por el suelo");    
  }

  public void escupe() {
    System.out.println("El lagarto no escupe");    
  }
  
  public void comeInsectos() {
    System.out.println("El lagarto que mide " + longitud + " cm come insectos");
  }
}
