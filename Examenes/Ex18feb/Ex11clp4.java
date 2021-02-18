/**
 * CRUZ LÓPEZ PÉREZ
 * Ex18Feb
 * 
 * Ejercicio 4
 * 
 * @author cruz
 *
 */
package ex11clp;

public class Ex11clp4 {

  public static void main(String[] args) {
    String[] a = {"col", "pera", "uva", "ajo", "mango", "cebolla", "ajo", "col", "col"};
    System.out.println("Hay " + coincidencias(a, "pera") + " coincidencia/s");
    System.out.println("Hay " + coincidencias(a, "ajo") + " coincidencia/s");
    System.out.println("Hay " + coincidencias(a, "espinacas") + " coincidencia/s");
    System.out.println("Hay " + coincidencias(a, "col") + " coincidencia/s");
    System.out.println("Hay " + coincidencias(a, "cebolla") + " coincidencia/s");
    
    String[] b = { };
    System.out.println("");
    System.out.println("Hay " + coincidencias(b, "col") + " coincidencia/s");
  }
  
  public static int coincidencias(String[] a, String palabra) {
    int numCoincidencias = 0;
    for (String contenido : a) {
      if (contenido.equals(palabra)){
        numCoincidencias++;
      }
    }
    return numCoincidencias;
  }
  
}
