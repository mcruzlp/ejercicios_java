/*
 * Ejercicio 5
 * 
 * Realiza un programa que resuelva una ecuación de primer grado 
 * (del tipo ax+b =0 ).
 * 
 * @author Cruz López
 * 
 */


public class Ej05_ec1 {
  
  public static void main (String[] args) {
    System.out.print("Introduzca el coeficiente de la x: ");
    float a=Float.parseFloat(System.console().readLine());
    System.out.print("Introduzca el valor independiente: ");
    float b=Float.parseFloat(System.console().readLine());
    float x=0;
    
    if(a==0){
      System.out.println("Indeterminación");
    }
    if(a<0){
      if(b==0){
        x=-1/a;
      } else{
        x=-b/a;
      }
      System.out.println("x="+x);
    }
    if(a>0){
      if(b==0){
        x=1/a;
      } else{
        x=-b/a;
      }
      System.out.println("x="+x);
    }
  }
}

