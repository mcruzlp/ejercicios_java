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
   * ****** VOLTEA INT ******
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

  /**
   * ****** VOLTEA LONG ******
   *
   * @param num número que se quiere dar la vuelta
   * @return devuelve el número volteado
   */
  
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
   * ****** POTENCIA DOUBLE ******
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
   * ****** POTENCIA INT ******
   *
   * @param base número que hay que multiplicar por sí mismo.
   * @param exp número de veces que hay que multiplicarlo.
   * @return devuelve la potencia calculada.
   */
  
  public static int potencia(int base, int exp) {

    int potencia = (int)(Math.pow(base, exp));

    return potencia;
  }

  /**
   * ****** CUENTA LOS DÍGITOS DE UN NÚMERO LONG ******
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
  /**
   * ****** CUENTA LOS DÍGITOS DE UN NÚMERO INT ******
   *
   * @param num
   * @return el número de dígitos.
   */
  
  public static int cuentaDigitos(int num) {
    int numDigitos = 1;

    while (num > 10) {
      num /= 10;
      numDigitos++;
    }
    return numDigitos;
  }

  /**
   * ****** CONVIERTE NUMERO EN ARRAY LONG ******
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
   * ****** CONVIERTE NUMERO EN ARRAY INT ******
   *
   * @param num número que quiere almacenarse en el array
   * @return devuelve el número en forma de array
   */
  
  public static int[] convierteArray(int num) {
    int numRecortado = num;
    int numDigitos = cuentaDigitos(numRecortado);

    int[] numArray = new int[numDigitos];

    for (int i = 0; i < numDigitos; i++) {
      numArray[i] = (int) (num % 10);
    }

    return numArray;
  }

  /**
   * ****** DEVUELVE EL DÍGITO DE UNA POSICIÓN LONG ******
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
   * ****** DEVUELVE EL DÍGITO DE UNA POSICIÓN INT ******
   *
   * @param num número del que se consulta una posición contreta
   * @param posicion posición que desea consultares
   * @return devuelve el número que hay en la posición consultada
   */
  
  public static int posicionDigito(int num, int posicion) {
    num = voltea(num);
    while (posicion-- > 0) {
      num /= 10;
    }
    return (int) num % 10;
  }

  /**
   * ****** QUITA POR DETRÁS LONG ******
   *
   * @param num número del que se quiere recortar la parte trasera
   * @param n cantidad de dígitos que se quieren recortar
   * @return devuelve el número recortado
   */
  public static long quitaPorDetras(long num, int n) {

    int digitosFinal = cuentaDigitos(num) - n;

    while (cuentaDigitos(num) > digitosFinal) {
      num /= 10;
    }
    return num;
  }

  /**
   * ****** QUITA POR DETRÁS INT ******
   *
   * @param num número del que se quiere recortar la parte trasera
   * @param n cantidad de dígitos que se quieren recortar
   * @return devuelve el número recortado
   */
  public static int quitaPorDetras(int num, int n) {

    int digitosFinal = cuentaDigitos(num) - n;

    while (cuentaDigitos(num) > digitosFinal) {
      num /= 10;
    }
    return num;
  }

  /**
   * ****** QUITA POR DELANTE LONG ******
   *
   * @param num número del que se quiere recortar la parte delantera
   * @param n cantidad de dígitos que se quieren recortar
   * @return devuelve el número recortado
   */
  public static long quitaPorDelante(long num, int n) {

    int digitosFinal = cuentaDigitos(num) - n;
    int numDivisiones = 0;
    long numInicial = num;
    while (num >= numInicial){
      while (cuentaDigitos(num) > digitosFinal) {
        num /= 10;
        numDivisiones++;
      }
    
      num = numInicial - potencia(10, numDivisiones);
    }
    return num;
  }

  /**
   * ****** QUITA POR DELANTE INT ******
   *
   * @param num número del que se quiere recortar la parte delantera
   * @param n cantidad de dígitos que se quieren recortar
   * @return devuelve el número recortado
   */
  
  public static int quitaPorDelante(int num, int n) {

    
    return num;
  }

  /**
   * ******* ENCUENTRA LA POSICIÓN DE UN NÚMERO INT **************
   *
   * @param num número del que se consulta una posición contreta
   * @param valor número del que se quiere conocer la posición
   * @return devuelve la posición del número consultado
   */
  public static int encuentraNum(int num, int valor) {

    int numDigitos = cuentaDigitos(num);

    for (int i = 0; i <= numDigitos; i++) {
      int numPerdido = posicionDigito(num, i);
      if (valor == numPerdido) {
        return i;
      }
    }
    return -1;
  }

  /**
   * ******* PASA DE BINARIO A DECIMAL **************
   *
   * @param x número binario que quiere pasarse a decimal
   * @return devuelve el número en decimal
   */
//  public static long binarioDecimal(long x) {
//    
//    cuentaDigitos(x);
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
   * ******* CALCULA MEDIA DOUBLE **************
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

  /**
   * ************ LOOK AND SAY INT ****************
   *
   * @param numTerminos
   * @return
   */
  
  public static int[] lookAndSay(int numTerminos) {

    int[] sucesion = new int[numTerminos];

    sucesion[0] = 1;
    int numPrevio = 1;
    int longitud = 1;
    int numDigitos = 1;
    int numTrozos = 1;
    int[] trozo = new int[numDigitos];
    int[] trozosJuntos = new int[numTrozos];

    for (int i = 1; i < numTerminos; i++) {

      if (numPrevio > 10) { //si el núm tiene 2 o más cifras
        numDigitos = cuentaDigitos(numPrevio);//cuenta las cifras
        int[] arrayNumPrevio = convierteArray(numPrevio);//lo convierte en array
        for (int j = 0; j < arrayNumPrevio.length; j++) {//y recorre el array
          if (arrayNumPrevio[j + 1] == arrayNumPrevio[j]) {//para comprobar si una cifra es igual a la siguiente
            longitud--;//si lo es, guarda la cantidad de cifras iguales para
            trozo[j] = quitaPorDelante(numPrevio, numDigitos - longitud);
          } else {//dividir el array en trozos 
            trozo[j] = arrayNumPrevio[j];
            longitud++;
          }
          numTrozos++;
          for (int k = 0; k < numTrozos; k++) {
            trozosJuntos = Arrays.concatena(trozosJuntos, trozo);
          }
        }
        sucesion[i] = trozosJuntos[i];
      }

      sucesion[i] = sucesion[i - 1] * 10 + numPrevio;
      numPrevio = sucesion[i];
    }
    return sucesion;
  }
  
  /**
   * 
   */
  
  public static void probabilidad() {
  
  }
}
