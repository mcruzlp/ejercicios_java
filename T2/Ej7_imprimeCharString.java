/*
 * Escribe un programa que declare variables de tipo char y de tipo String . Intenta
mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
de Java (con un solo println ) ¿es posible?
 */
package ej7_imprimecharstring;

/**
 *
 * @author maricruz
 */
public class Ej7_imprimeCharString {

  public static void main(String[] args) {
    char a='a';
    char b='b';
    String palabra= "abecedario";
    
    /*System.out.println(a + b + palabra);
    
    De esta forma el resultado es: 195abecedario
    Ha tomado los valores de a y b de su código ASCII, porque estamos uniendo
    cadenas de caracteres con caracteres sueltos.
    Lo que queremos que salga por pantalla es "a b abecedario". 
    */
    
    System.out.println(a + " " + b + " " + palabra);
  }
  
}
