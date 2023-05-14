/*@CConde */
import java.util.ArrayList;

public class PruebaAnimal {
  public static void main(String[] args) {
    
    Canario pica = new Canario(0);
    Gato Lana = new Gato(0);
    Lagarto Juancho = new Lagarto(0);
    Perro Nala = new Perro(0);
    Pinguino Pingu = new Pinguino ();

    ArrayList<Animal> animales = new ArrayList<>();
        animales.add(pica);
        animales.add(Lana);
        animales.add(Juancho);
        animales.add(Nala);
        animales.add(Pingu);
  }
}
