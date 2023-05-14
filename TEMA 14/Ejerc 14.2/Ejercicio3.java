import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {
  public static void main(String[] args) throws FileNotFoundException, IOException {

    int id=(int)(Math.random()*5+1);

    switch (id) {
        case 1:
            throw new NumberFormatException();
        case 2:
            throw new IOException();
        case 3:
            throw new FileNotFoundException();
        case 4:
            throw new IndexOutOfBoundsException();
        case 5:
            throw new ArithmeticException();
        default:
        System.out.println("Fin del programa");
          }
  }
}


