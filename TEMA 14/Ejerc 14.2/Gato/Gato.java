/* Ejercicio 1 - Arrays
* @author: Cristina Conde
*/

public class Gato {
  // Ponemos los atributos de la clase gato
  // En este caso son privados

  private String nombre;
  private String color;
  private String raza;
  private int edad;
  private double peso;
  private int aparearCon;

    // Ahora realizamos el constructor

    public Gato(String nombre, String color, String raza, int edad, double peso, int aparearCon){
      this.nombre= nombre;
      this.color=color;
      this.raza=raza;
      this.edad=edad;
      this.peso=peso;
      this.aparearCon=aparearCon;
    }
    // Realizamos getter para el atributor nombre y raza
    public String getNombre(){
      return nombre;
    }
    
    public String getRaza(){
      return this.raza;
    }

    //Metodo para mostrar toda la informacion del gato, para ellos usamos toString
    public String toSTString(int tipoGato){
      String datos= "El gato con nombre " + this.nombre + " con color " + this.color + "es de la raza " + this.raza + " con peso " + this.peso + " y una edad de " + this.edad;
      
      return datos;
    }

    //método para que el gato haga diferentes acciones

    public String maulla(){
      String miau="Miau, miau";
      return miau;
    }

    public String acecha(){
      String acechar="El gato acecha al ratón";
      return acechar;
    }

    public String corre(){
      String correr="El gato corre por los tejados";
      return correr;
    }

    public String raspa(){
      String raspar="El gato araña el juguete";
      return raspar;
    }
    // metodo para hacer que el gato coma pescado en caso contrario te dice que no come otra cosa

    public void comer(String comida){
      if(comida.equals("pescado")){
        System.out.println("Muchas gracias, me encanta el pesacado");
      }
      else{
        System.out.println("No me gusta esta comida, solo como pescado");
      }
    }

    // Creamos la clase
    void peleaCon(Gato contrincante){
      if(this.sexo.equals("hembra")){
        System.out.println("No me gusta pelear.");
      }else{
        if(contrincante.getSexo().toLowerCase().equals("hembra")){
          System.out.println("¡No peleo contra gatitas!");
        }else{
          System.out.println("¡Ven aquí que te vas a enterar!");
        }

       }
      }
}

