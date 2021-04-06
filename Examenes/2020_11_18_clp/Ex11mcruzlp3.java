/*
 * Cruz López Pérez
 * 18/11/2020
 *
 */
package ex11mcruzlp;

import java.util.Scanner;

public class Ex11mcruzlp3 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de paquetes que desea: ");
    double cantidad = Double.parseDouble(s.nextLine());
    while (cantidad < 20){
      System.out.print("El pedido mínimo es de 20 paquetes. Inténtelo de nuevo: ");
      cantidad = Double.parseDouble(s.nextLine());
    }
    System.out.print("Número de colores de la impresión de las tazas: ");
    int colores = Integer.parseInt(s.nextLine());
    while (colores <= 0){
      System.out.print("Introduzca un número válido. Inténtelo de nuevo: ");
      colores = Integer.parseInt(s.nextLine());
    }
    System.out.print("¿De qué material quiere los llaveros? 1) plástico 2) metal: ");
    int material = Integer.parseInt(s.nextLine());
    while (material < 1 || material > 2){
      System.out.print("El pedido mínimo es de 20 polos. Inténtelo de nuevo: ");
      material = Integer.parseInt(s.nextLine());
    }
    double base = 0;
    double iva;
    
    if (cantidad >= 20 && cantidad <=39){
      base = 4.90;
      if(colores < 3){
        System.out.printf("Taza (1, 2 o 3 col.):   %6.2f\n", cantidad);
        System.out.printf("Precio unitario:        %6.2f €\n", base);
        System.out.printf("Total tazas:            %6.2f €\n", base * cantidad);
      } else {
        base = base*1.20;
        System.out.printf("Taza (más de 3 col.):   %6.2f\n", cantidad);
        System.out.printf("Precio unitario:        %6.2f €\n", base);
        System.out.printf("Total tazas:            %6.2f €\n", base * cantidad);
      }
      if (material == 1){
        base = base + 2;
        System.out.printf("Plástico (c.u.):          2,00 €\n");
        System.out.printf("Total llaveros:         %6.2f €\n", 2 * cantidad);
      }
      if (material == 2){
        base = base + 3;
        System.out.printf("Metal (c.u.):             3,00 €\n");
        System.out.printf("Total llaveros:         %6.2f €\n", 3 * cantidad);
      }
    }
    
    if (cantidad >= 40 && cantidad <=99){
      base = 3.9;
      if (colores < 3){
        System.out.printf("Taza (1, 2 o 3 col.):   %6.2f\n", cantidad);
        System.out.printf("Precio unitario:        %6.2f €\n", base);
        System.out.printf("Total tazas:            %6.2f €\n", base * cantidad);
      } else{
        base = base*1.2;
        System.out.printf("Taza (más de 3 col.):   %6.2f\n", cantidad);
        System.out.printf("Precio unitario:        %6.2f €\n", base);
        System.out.printf("Total tazas:            %6.2f €\n", base * cantidad);
      }
      
      //Variación de precios según el material si se piden más o menos de 50u.
      if (cantidad >= 40 && cantidad <=50){
        if (material == 1){
        base = base + 2;
        System.out.printf("Plástico (c.u.):          2,00 €\n");
        System.out.printf("Total llaveros:         %6.2f €\n", 2 * cantidad);
        }
      if (material == 2){
        base = base + 3;
        System.out.printf("Metal (c.u.):             3,00 €\n");
        System.out.printf("Total llaveros:         %6.2f €\n", 3 * cantidad);
        }
      } else {
        if (material == 1){
        base = base + 1.5;
        System.out.printf("Plástico (c.u.):          1,50 €\n");
        System.out.printf("Total llaveros:         %6.2f €\n", 1.5 * cantidad);
        }
        if (material == 2){
        base = base + 2.5;
        System.out.printf("Metal (c.u.):             2,50 €\n");
        System.out.printf("Total llaveros:         %6.2f €\n", 2.5 * cantidad);
        }
      }
    }
    
    if (cantidad >= 100){
      base = 3.2;
      if (colores < 3){
      base = base*1.2;
      System.out.printf("Taza (más de 3 col.):     %6.2f\n", cantidad);
      System.out.printf("Precio unitario:          %6.2f €\n", base);
      System.out.printf("Total tazas:              %6.2f €\n", base * cantidad);
      } else{
        System.out.printf("Taza (1, 2 o 3 col.):   %6.2f\n", cantidad);
        System.out.printf("Precio unitario:        %6.2f €\n", base);
        System.out.printf("Total tazas:            %6.2f €\n", base * cantidad);
      }
      if (material == 1){
        base = base + 1.5;
        System.out.printf("Plástico (c.u.):            1,50 €\n");
        System.out.printf("Total llaveros:           %6.2f €\n", 1.5 * cantidad);
      }
      if (material == 2){
        base = base + 2.5;
        System.out.printf("Metal (c.u.):               2,50 €\n");
        System.out.printf("Total llaveros:           %6.2f €\n", 2.5 * cantidad);
      }
    }
    
    iva = cantidad*base*0.21;
    System.out.printf("Precio base total:      %6.2f €\n", cantidad*base);
    System.out.printf("IVA:                    %6.2f €\n", iva);
    System.out.printf("Precio total:           %6.2f €\n", (iva+(cantidad*base)));
  }
  
}
