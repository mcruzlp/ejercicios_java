/**
 *
 * @author cruz
 */
package Ej01_Caballo;

public class Caballo {

  // atributos de instancia *********************************
  private String raza = "";
  private String color = "";
  private String talla = "";
  private String sexo = "";
  private int edad = 0;

  // constructor *********************************************
  public Caballo(String r, String col, String t, String s, int e) {
    this.raza = r;
    this.color = col;
    this.talla = t;
    this.sexo = s;
    this.edad = e;
  }

  public Caballo(String col, String s, int e) {
    this.color = col;
    this.sexo = s;
    this.edad = e;
  }
  
  public Caballo(){
  }
  
  
  // métodos *********************************************
  public void come() {
    System.out.println("Me gusta comer pasto");
  }

  public void relincha() {
    System.out.println("ihihihihih");
  }

  public void trota() {
    System.out.println("Voy al trote");
  }
}
