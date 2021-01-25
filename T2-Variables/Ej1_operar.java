/*
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */
package t2;

/**
 *
 * @author maricruz
 */
public class T2 {
  
  public static void main(String[] args) {
    int x=144;
    int y=999;
    
    int suma=x+y;
    int resta=x-y;
    int mult=x*y;
    double div= (double)y/(double)x;
    
    System.out.println("x=" + x + " " + "y=" + y + " " + "x+y=" + suma + " " + "x-y=" + resta + " " + "x*y=" + mult + " " + "y/x=" + div);
  }
  
}
