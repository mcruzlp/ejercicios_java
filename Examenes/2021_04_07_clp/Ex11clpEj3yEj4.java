package ex11clp;

public class Ex11clpEj3yEj4 {

  public static void main(String[] args) {
    // Ejercicio 3
//    Apuesta a1 = new Apuesta(5, 6, 8, 23, 24, 33);
//    Apuesta a2 = new Apuesta(7, 12, 18, 21, 27, 38);
//    Apuesta a3 = new Apuesta();
//    
//    System.out.println(a1);
//    System.out.println(a2);
//    System.out.println(a3);
//    
//    for (int i = 0; i < 10; i++) {      // Se recomienda cambiar el 10 por un 100
//      System.out.println(new Apuesta()); // para comprobar que en una misma apuesta
//    }                                    // no se repiten los números.
    
    // Ejercicio 4
    System.out.println("Creando la apuesta 4...");
    Apuesta a4 = new Apuesta(5, 6, 8, 23, 8, 33);
    System.out.println("Creando la apuesta 5...");
    Apuesta a5 = new Apuesta(7, 12, 18, 21, 27, 0);
    System.out.println("Creando la apuesta 6...");
    Apuesta a6 = new Apuesta(9, 50, 20, 30, 1, 4);
    System.out.println("Creando la apuesta 7...");
    Apuesta a7 = new Apuesta(9, 50, 20, 9, 1, 9);
  }
  
}
