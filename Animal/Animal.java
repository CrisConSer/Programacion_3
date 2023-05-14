/*@CConde */

public abstract class Animal {
  String nombre;
  private int edad;
  
  public Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public int getEdad() {
    return this.edad;
  }
  
  public void dormir() {
    System.out.println(this.nombre + " está durmiendo.");
  }
  
  public void comer() {
    System.out.println(this.nombre + " está comiendo.");
  }
}