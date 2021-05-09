/*
 * Ejercicio 16
Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
esté siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.
1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
aparente.
2. Ha aumentado sus gastos de vestuario.
3. Ha perdido el interés que mostraba anteriormente por ti.
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
arregla el pelo y se asea con más frecuencia (si es mujer).
5. No te deja que mires la agenda de su teléfono móvil.
6. A veces tiene llamadas que dice no querer contestar cuando estás tú
delante.
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.
8. Muchos días viene tarde después de trabajar porque dice tener mucho
más trabajo.
9. Has notado que últimamente se perfuma más.
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.

A continuación se muestran los mensajes que deberá dar el programa según
la puntuación obtenida:
  • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.
  • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
    vida o en su mente, aunque seguramente será algo sin importancia. No
    bajes la guardia.
  • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
    viviendo un romance con otra persona. Te aconsejamos que indagues un
    poco más y averigües qué es lo que está pasando por su cabeza.
 *
 * @author cruz
 *
 */
package t4;

import java.util.Scanner;

public class Ej16_infiel {

  public static void main(String[] args) {
    
    System.out.println("Responde a estas preguntas con V(verdadero) o F(falso)");
    System.out.println("para saber si tu pareja te está siendo infiel: ");
    
    Scanner s = new Scanner(System.in);
    int puntos = 0;
    
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin"
      + " ningún motivo aparente.");
    String respuesta1 = s.nextLine();
    
    if (respuesta1.equals("V")){
      puntos += 3;
    }
    
    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    String respuesta2 = s.nextLine();
    
    if (respuesta2.equals("V")){
      puntos += 3;
    }
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    String respuesta3 = s.nextLine();
    
    if (respuesta3.equals("V")){
      puntos += 3;
    }
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es "
      + "hombre)");
    System.out.println("o ahora se arregla el pelo y se asea con más frecuencia "
      + "(si es mujer).");
    String respuesta4 = s.nextLine();
    
    if (respuesta4.equals("V")){
      puntos += 3;
    }
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    String respuesta5 = s.nextLine();
    
    if (respuesta5.equals("V")){
      puntos += 3;
    }
    System.out.println("6. A veces tiene llamadas que dice no querer contestar"
      + "cuando estás tú delante.");
    String respuesta6 = s.nextLine();
    
    if (respuesta6.equals("V")){
      puntos += 3;
    }
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o "
      + "estar bronceado/a.");
    String respuesta7 = s.nextLine();
    
    if (respuesta7.equals("V")){
      puntos += 3;
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque "
      + "dice tener mucho más trabajo.");
    String respuesta8 = s.nextLine();
    
    if (respuesta8.equals("V")){
      puntos += 3;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más.");
    String respuesta9 = s.nextLine();
    
    if (respuesta9.equals("V")){
      puntos += 3;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde "
      + "no ha ido contigo.");
    String respuesta10 = s.nextLine();
    
    if (respuesta10.equals("V")){
      puntos += 3;
    }

    
    int baremo = 0;
    if (puntos < 11){
      baremo = 1;
    }
    if (puntos > 10 && puntos < 23){
      baremo = 2;
    }
    if (puntos > 22 && puntos < 31){
      baremo = 3;
    }
    
    switch(baremo){
      case 1:
        System.out.println("¡Enhorabuena! tu pareja parece ser totalmente" +
        " fiel.");
        break;
      case 2:
        System.out.println("Quizás exista el peligro de otra persona en su " +
        "vida o en su mente, aunque seguramente será algo sin importancia. " +
        "No bajes la guardia.");
        break;
      case 3:
        System.out.println("Tu pareja tiene todos los ingredientes para estar" +
        " viviendo un romance con otra persona.\nTe aconsejamos que indagues un"
        + " poco más y averigües qué es lo que está pasando por su cabeza.");
        break;
      default:
    }
  }
  
}
