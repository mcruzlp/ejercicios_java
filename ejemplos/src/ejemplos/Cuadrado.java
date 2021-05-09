/**
 * Cuadrado.java
 * Definición de la clase Cuadrado
 *
 * @author Luis José Sánchez
 */
package ejemplos;

public class Cuadrado {
 // atributos ////////////////////////////
  int lado;

 // métodos //////////////////////////////
  // constructor*************************
  public Cuadrado(int l) {
    this.lado = l;
  }

  // otros métodos************************
  @Override
  public String toString() {
    int i;
    int espacios;
    String resultado = "";
    
    for (i = 0; i < this.lado; i++) { //crea la tapa del cuadraro
      resultado += "□□";
    }
    resultado += "\n";//salta de línea para dibujar el lateral del cuadrado
    for (i = 1; i < this.lado - 1; i++) {
      resultado += "□□";// añade el lateral izquierdo del cuadrado
      for (espacios = 1; espacios <= this.lado - 1; espacios++) {
        resultado += "  ";//añade espacios del interior del cuadrado
      }
      resultado += "□□\n";//añade el lateral derecho del cuadrado y salra de línea
    }
    for (i = 0; i < this.lado; i++) {
      resultado += "□□"; //crea la base del cuadraro
    }
    resultado += "\n";
    return resultado;
  }
}
