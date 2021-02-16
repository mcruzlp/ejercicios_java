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

    int potencia = (int) (Math.pow(base, exp));

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
    while (num >= numInicial) {
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
   * @param numInicial número del que se quiere recortar la parte delantera
   * @param n cantidad de dígitos que se quieren recortar
   * @return devuelve el número recortado
   */
  public static int quitaPorDelante(int numInicial, int n) {

    int copia = numInicial;
    int numDivisiones = 0;
    while (cuentaDigitos(copia) > n) {
      copia /= 10;
      numDivisiones++;
    }
    int numFinal = numInicial - copia * (int) Math.pow(10, numDivisiones);
    return numFinal;
  }

  /**
   * ****** PEGA UN DÍGITO AL FINAL DEL NÚMERO ************
   *
   * @param numInicial número al que se quiere pegar un dígito
   * @param n dígito que se quiere añadir
   * @return el número con un dígito más
   */
  public static int pegaPorDetras(int numInicial, int n) {

    int numFinal = numInicial * 10 + n;
    return numFinal;
  }

  /**
   *
   * @param numInicial número al que se quiere pegar un dígito
   * @param n dígito que se quiere añadir
   * @return el número con un dígito más
   */
  public static long pegaPorDetras(long numInicial, long n) {

    long numFinal = numInicial * 10 + n;
    return numFinal;
  }

  /**
   * ****** PEGA UN DÍGITO AL PRINCIPIO DEL NÚMERO************
   *
   * @param numInicial número al que se quiere pegar un dígito
   * @param n dígito que se quiere añadir
   * @return el número con un dígito más
   */
  public static int pegaPorDelante(int numInicial, int n) {
    int numFinal = n * (int) Math.pow(10, cuentaDigitos(numInicial)) + numInicial;
    return numFinal;
  }

  /**
   * ******** TROZO DE UN NÚMERO ***************
   *
   * @param num número que quiero trocear
   * @param inicio primera cifra del trozo
   * @param fin última cifra del trozo
   * @return número resultante de recortar los dígitos sobrantes
   */
  public static int trozoDeNumero(int num, int inicio, int fin) {

    int numDigitos = cuentaDigitos(num);
    num = quitaPorDelante(num, inicio);
    int trozo = quitaPorDetras(num, numDigitos - fin - 1);

    return trozo;
  }

  /**
   * ******* JUNTA NÚMEROS ************************************
   *
   * @param num1 número que irá delante en el número final
   * @param num2 número que irá detrás en el número final
   * @return los números anteriores pegados
   */
  public static int juntaNumeros(int num1, int num2) {

    int numFinal = num1 * (int) Math.pow(10, cuentaDigitos(num2)) + num2;
    return numFinal;
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
   * @param binario num binario que se quiere transformar
   * @return devuelve el número en decimal
   */
  public static long binarioDecimal(long binario) {

    long decimal = 0;
    int bits = cuentaDigitos(binario);

    for (int i = 0; i < bits; i++) {
      decimal += posicionDigito(binario, bits - i - 1) * potencia(2, i);
    }

    return decimal;
  }

  /**
   * ****** PASA DE DECIMAL A BINARIO ************
   *
   * @param numDecimal número que quires pasar a binario
   * @return numero en binario
   */
  public static long decimalBinario(int numDecimal) {

    if (numDecimal == 0) {
      return 0;
    }
    long binario = 1;

    while (numDecimal > 1) {
      binario = pegaPorDetras(binario, numDecimal % 2);
      numDecimal /= 2;
    }
    binario = pegaPorDetras(binario, 1);
    binario = voltea(binario);
    binario = quitaPorDetras(binario, 1);

    return binario;
  }
  
  /************ CAMBIA DE  HEXADECIMAL
   * 
   * @param num que se quiere cambiar de base
   * @param base1
   * @param base2 hexadecimal
   * @return 
   */
  public static String cambiaDeBase(int num, int base1, int base2) {
  
    String numHex = "";
    return numHex;
  }
  
  

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

}
