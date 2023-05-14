import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;

        System.out.println("Por favor, inserta 6 números: ");

        for (int i = 0; i < 6; i++) {
          // aplicamos la excepcion try and catch
            try {
                num = s.nextInt();
                if (num > max) {
                    max = num;
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, indica otro número");
                s.nextLine(); 
                i--; 
            }
        }

        System.out.println("El número máximo es: " + max);

        //cierra la clase scanner
        s.close();
    }
}