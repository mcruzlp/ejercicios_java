/**
 * Ejercicio 1
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * (Haz una lista con los atributos que podría tener la clase caballo. A 
 * continuación haz una lista con los posibles métodos (acciones asociadas 
 * a los caballos).)
 * 
 * @author cruz
 *
 */
package Ej01_Caballo;

public class Ej01_Caballo {

  public static void main(String[] args) {
    Caballo Babieca = new Caballo("español","negro","mediano","hembra", 7);
    Caballo Pegaso = new Caballo();
    Caballo Rocinante = new Caballo("gris", "macho", 10);
    Babieca.come();
    Pegaso.relincha();
    Rocinante.trota();
  }
  
}
