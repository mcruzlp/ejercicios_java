/**
 * Aquí se encuentran las funciones matemáticas que he ido creando a lo largo
 * del curso.
 *
 * @author cruz
 *
 */
package misfunciones;

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
   * ****** SIGUIENTE PRIMO ****** Esta función se usa después de haber
   * comprobado con la función esPrimo si un número es primo o no, y busca el
   * siguiente número entero primo mayor al número introducido por el usuario.
   *
   * @param x número que se quiere comprobar si es primo
   * @return Devuelve el menor primo que es mayor al número que se pasa como
   * parámetro.
   */
  public static int siguientePrimo(int x) {

    do {
      x++;
    } while (esPrimo(x) == false);

    return x;
  }

  /**
   * ****** VOLTEA ******
   *
   * @param num número que se quiere dar la vuelta
   * @return devuelve el número volteado
   */
  public static int voltea(int num) {
    int numVolteado = 0;

    while (num > 0) {
      numVolteado = (numVolteado * 10) + (num % 10);
      num /= 10;
    }

    return numVolteado;
  }
  
  public static long voltea(long num) {
    long numVolteado = 0;

    while (num > 0) {
      numVolteado = (numVolteado * 10) + (num % 10);
      num /= 10;
    }

    return numVolteado;
  }

  /**
   * ****** ES CAPICUA ******
   *
   * @param num número que se quiere comprobar si es capicua
   * @return devuelve si el número es capicua o no
   */
  public static boolean esCapicua(int num) {

    int numVolteado = voltea(num);

    return numVolteado == num;

  }

  /**
   * ****** POTENCIA ******
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
   * ****** CUENTA LOS DÍGITOS DE UN NÚMERO ******
   *
   * @param num
   * @return el número de dígitos.
   */
  public static int cuentaDigitos(long num) {
    int numDigitos = 1;

    while (num > 10) {
      num /= 10;
      numDigitos++;
    }

    return numDigitos;
  }

  public static int cuentaDigitos(int num) {
    int numDigitos = 1;

    while (num > 10) {
      num /= 10;
      numDigitos++;
    }
    return numDigitos;
  }

  /**
   * ****** CONVIERTE A ARRAY ******
   *
   * @param num número que quiere almacenarse en el array
   * @return devuelve el número en forma de array
   */
  public static int[] convierteArray(long num) {
    long numRecortado = num;
    int numDigitos = cuentaDigitos(numRecortado);

    int[] numArray = new int[numDigitos];

    for (int i = 0; i < numDigitos; i++) {
      numArray[i] = (int) (num % 10);
    }

    return numArray;
  }

  /**
   * ****** DEVUELVE EL DÍGITO DE UNA POSICIÓN ******
   *
   * @param num número del que se consulta una posición contreta
   * @param posicion posición que desea consultares
   * @return devuelve el número que hay en la posición consultada
   */
  public static int posicionDigito(long num, int posicion) {
    num = voltea(num);
    while (posicion-- > 0) {
      num /= 10;
    }
    return (int) num % 10;
  }

  /**
   * ******* ENCUENTRA EL DÍGITO **************
   *
   *
   * @param num número del que se consulta una posición contreta
   * @param digito dígito del que se quiere obtener la posición
   * @return devuelve la posición del número consultado
   */
  public static int encuentraDigito(int num, int digito) {

    int numDigitos = cuentaDigitos(num);
  
    for (int i = 0; i <= numDigitos; i++){
      int numPerdido = posicionDigito(num,i);
      if (num == numPerdido){
        return i;
      } else return -1;
    }
  }

  /**
   * ******* PASA DE BINARIO A DECIMAL **************
   *
   *
   * @param x número binario que quiere pasarse a decimal
   * @return devuelve el número en decimal
   */
//  public static long binarioDecimal (long x){
//    
//    int numDivisiones = 0;
//    
//    while (x >= 2){
//      long resto = x % 2; 
//      x /= 2;
//      resto += resto*potencia(10,numDivisiones);
//      numDivisiones++;
//    } /*terminar de arreglar esto porque cuando el resto es cero, al
//    multiplicarlo por 100, o 1000 no se va a poner en la posición de las 
//    centenas o millares, igual mejor con array*/
//    
//    int num = 0;
//  
//    return num;
//  }
  /**
   * ******* CALCULA MEDIA **************
   *
   *
   * @param notas datos a los que calcularle la media
   * @return devuelve la media del total
   */
  public static double mediaNotas(double[] notas) {
    double suma = 0;

    for (double n : notas) {
      suma += n;
    }
    return suma / notas.length;
  }

}
