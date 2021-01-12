/*
 * Cruz López Pérez
 * 11/11/2020
 *
 */
package ex11mclp;

import java.util.Scanner;

public class Ex11mclp1 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de polos que desea: ");
    double cantidad = Double.parseDouble(s.nextLine());
    System.out.print("1) blanco 2) color: ");
    int colores = Integer.parseInt(s.nextLine());
    System.out.print("1) serigrafía 2) bordado: ");
    int tecnica = Integer.parseInt(s.nextLine());
    double base = 0;
    double iva;
    
    if (cantidad >= 20 && cantidad <=39){
      base = 4.90;
      if (colores == 2){
        base = base*1.20;
        System.out.printf("Polos en color:      %6.2f\n", cantidad);
        System.out.printf("Precio unitario:     %6.2f €\n", base);
        System.out.printf("Total textil:        %6.2f €\n", base * cantidad);
      } else {
        System.out.printf("Polos en blanco:     %6.2f\n", cantidad);
        System.out.printf("Precio unitario:     %6.2f €\n", base);
        System.out.printf("Total textil:        %6.2f €\n", base * cantidad);
      }
      if (tecnica == 1){
        base = base + 2;
        System.out.printf("Serigrafía (c.u.):     2,00 €\n");
        System.out.printf("Total serigrafía:    %6.2f €\n", 2 * cantidad);
      }
      if (tecnica == 2){
        base = base + 3;
        System.out.printf("Bordado (c.u.):        3,00 €\n");
        System.out.printf("Total bordado:       %6.2f €\n", 3 * cantidad);
      }
    }
    
    if (cantidad >= 40 && cantidad <=99){
      base = 3.9;
      if (colores == 2){
      base = base*1.2;
      System.out.printf("Polos en color:      %6.2f\n", cantidad);
      System.out.printf("Precio unitario:     %6.2f €\n", base);
      System.out.printf("Total textil:        %6.2f €\n", base * cantidad);
      } else{
        System.out.printf("Polos en blanco:     %6.2f\n", cantidad);
        System.out.printf("Precio unitario:     %6.2f €\n", base);
        System.out.printf("Total textil:        %6.2f €\n", base * cantidad);
      }
      
      //Variación de precios según la técnica si se piden más o menos de 50u.
      if (cantidad >= 40 && cantidad <=50){
        if (tecnica == 1){
        base = base + 2;
        System.out.printf("Serigrafía (c.u.):     2,00 €\n");
        System.out.printf("Total serigrafía:    %6.2f €\n", 2 * cantidad);
        }
      if (tecnica == 2){
        base = base + 3;
        System.out.printf("Bordado (c.u.):        3,00 €\n");
        System.out.printf("Total bordado:       %6.2f €\n", 3 * cantidad);
        }
      } else {
        if (tecnica == 1){
        base = base + 1.5;
        System.out.printf("Serigrafía (c.u.):     1,50 €\n");
        System.out.printf("Total serigrafía:    %6.2f €\n", 1.5 * cantidad);
        }
        if (tecnica == 2){
        base = base + 2.5;
        System.out.printf("Bordado (c.u.):        2,50 €\n");
        System.out.printf("Total bordado:       %6.2f €\n", 2.5 * cantidad);
        }
      }
    }
    
    if (cantidad >= 100){
      base = 3.2;
      if (colores == 2){
      base = base*1.2;
      System.out.printf("Polos en color:      %6.2f\n", cantidad);
      System.out.printf("Precio unitario:     %6.2f €\n", base);
      System.out.printf("Total textil:        %6.2f €\n", base * cantidad);
      } else{
        System.out.printf("Polos en blanco:     %6.2f\n", cantidad);
        System.out.printf("Precio unitario:     %6.2f €\n", base);
        System.out.printf("Total textil:        %6.2f €\n", base * cantidad);
      }
      if (tecnica == 1){
        base = base + 1.5;
        System.out.printf("Serigrafía (c.u.):     1,50 €\n");
        System.out.printf("Total serigrafía:    %6.2f €\n", 1.5 * cantidad);
      }
      if (tecnica == 2){
        base = base + 2.5;
        System.out.printf("Bordado (c.u.):        2,50 €\n");
        System.out.printf("Total bordado:       %6.2f €\n", 2.5 * cantidad);
      }
    }
    
    iva = cantidad*base*0.21;
    System.out.printf("Precio base total:   %6.2f €\n", cantidad*base);
    System.out.printf("IVA:                 %6.2f €\n", iva);
    System.out.printf("Precio total:        %6.2f €\n", (iva+(cantidad*base)));
  }
  
}
