package t9.poo;

/**
 *
 * @author cruz
 */
public class Coche {
  
  // atributos de clase *************************************
  private static int numCoches = 0;
  private static int kmTotales = 0;
  
  // atributos de instancia *********************************
  private final String numBastidor = "";
  private String matricula ="";
  private String marca ="";
  private String modelo ="";
  private int kilometraje = 0;

  // constructor *********************************************
  public Coche() {
    Coche.numCoches++;
  }
  
  public Coche(String matricula) {
    this.matricula = matricula;
    Coche.numCoches++;
  }
  
  public Coche(String matricula, String marca, String modelo) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    Coche.numCoches++;
  }
  
  // getter y setter ******************************************
  public int getKilometraje() {
    return this.kilometraje;
  }

  public void setKilometraje(int km) {
    this.kilometraje = km;
  }

  public static int getKmTotal() {
    return Coche.kmTotales;
  }
  
  
  
  // métodos *********************************************
  public void recorre(int distancia){
    this.kilometraje += distancia;
    kmTotales += distancia;
  }
  
  /**
   *
   * @return
   */
  @Override
  public String toString() {
    String resultado = "======================\n";
    resultado += "Matrícula: " + this.matricula;
    resultado += "\nMarca: " + this.marca;
    resultado += "\nModelo: " + this.modelo;
    resultado += "\nKilómetros recorridos: " + this.kilometraje;
    resultado += "\n======================\n";
    
    return resultado;
  }
  
}
