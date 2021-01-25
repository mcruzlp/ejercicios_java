/*
 * Escribe un programa que declare 5 variables de tipo char . A continuación, crea
 *otra variable como cadena de caracteres y asígnale como valor la concatena-
 *ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 *por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 */
package ej8_5var;

/**
 *
 * @author maricruz
 */
public class Ej8_5var {
  public static void main(String[] args) {
    char a='p';
    char b='e';
    char c='r';
    char d='r';
    char e='o';
    String palabra = "" + a + b + c + d + e;
    
    System.out.println(palabra);
  }
  
}
