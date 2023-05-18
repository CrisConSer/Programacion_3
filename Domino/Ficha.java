public class Ficha {

private int lado1;
private int lado2;
private static int numFichasCreadas;

// Constructor con ambos lados
public Ficha(int l1, int l2){
this.lado1 = l1;
this.lado2 = l2;
Ficha.numFichasCreadas++;
}

// Constructor aleatorio
public Ficha(){
lado1 = (int)(Math.random() * 6 + 1);
lado2 = (int)(Math.random() * 6 + 1);
Ficha.numFichasCreadas++;
}

// Obtiene un nuevo objeto con lados cambiados
public Ficha voltea() {
Ficha f = new Ficha(lado1, lado1);
f.lado1 = lado2;
f.lado2 = lado1;
return f;
}

// Compara si tiene algún lado igual
boolean encaja(Ficha f){
return lado1 == f.lado1 || lado1 == f.lado2 ||
lado2 == f.lado1 || lado2 == f.lado2;
}

// Obtiene el número de fichas creadas

/*public Ficha (){
  numFichasCreadas++;
}*/

public static int getNumFichasCreadas(){
  return numFichasCreadas;
}

// Devuelve representación en cadena
@Override
  public String toString() {
    return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + ']';
  }
}

