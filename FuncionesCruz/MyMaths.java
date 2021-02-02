/**
 * Aquí se encuentran las funciones matemáticas que he ido creando a lo largo
 * del curso.
 */
package misfunciones;

/**
 *
 * @author cruz
 */
public class MyMaths {

  /**
   * ****** ES PRIMO ******
   * 
   * @param x número que se quiere comprobar si es primo
   * @return devuelve si el número es primo o no
   */
  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * ****** SIGUIENTE PRIMO ******
   * Esta función se usa después de haber comprobado con la función esPrimo si
   * un número es primo o no, y busca el siguiente número entero primo mayor al
   * número introducido por el usuario.
   * 
   * @param x número que se quiere comprobar si es primo
   * @return Devuelve el menor primo que es mayor al número que se pasa como
   * parámetro.
   */
  public static int siguientePrimo(int x) {
    
    do{
      x++;
    } while(esPrimo(x) == false);
    
    return x;
  }
  
  /**
   * ****** POTENCIA ******
   * 
   * 
   * @param base número que hay que multiplicar por sí mismo.
   * @param exp número de veces que hay que multiplicarlo.
   * @return devuelve la potencia calculada.
   */
  
  public static double potencia(double base, double exp) {
  
    double potencia = Math.pow(base, exp);
    
    return potencia;
  }
  
  /**
   * ****** ES CAPICUA ******
   * 
   * @param num número que se quiere comprobar si es capicua
   * @return devuelve si el número es capicua o no
   */

  public static boolean esCapicua (int num){
    int numIntroducido = num;
    int numDigitos = 1;
    
    while (numIntroducido > 10){
      numIntroducido /=  10;
      numDigitos++;
    }
    
    if (numDigitos % 2 == 0) { //números con cantidad par de dígitos
      for(int i = 0; i < numDigitos/2; i++){
        convierteArray(num);/* quiero que meta en dos arrays el número partido 
        en dos trozos, y luego compare la primera posición del primer array con
        la última del segundo, y así sucesivamente hasta comparar todos los
        dígitos */
      }
      return true;
    }else { //números con cantidad impar de dígitos
      for(int i = 0; i < ((numDigitos-1)/2); i++){
        convierteArray(num);
      }
      return true;
    }
    
    return false;
  }
  
  public static int encuentraDigito (int num, int digito){
  /*esta función debe encontrar un dígito dentro de un número (ej 08)
    para ello quiero usar la función cuentadigito, añadiéndole que guarde el 
    valor si coincide con el número introducido*/
  }
  
  public static long binarioDecimal (long x){
    
    int numDivisiones = 0;
    
    while (x >= 2){
      long resto = x % 2; 
      x /= 2;
      resto += resto*potencia(10,numDivisiones);
      numDivisiones++;
    } /*terminar de arreglar esto porque cuando el resto es cero, al
    multiplicarlo por 100, o 1000 no se va a poner en la posición de las 
    centenas o millares, igual mejor con array*/
  
    return num;
  }
}
