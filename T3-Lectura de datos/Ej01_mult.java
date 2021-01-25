public class Ej1_mult {
  public static void main(String[] args) {
    System.out.println("Escriba un número:");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Escriba el número por el que quiere multiplicar el anterior");
    int num2=Integer.parseInt( System.console().readLine() );
    int mult=(num1*num2);
    System.out.println("El resultado es: "+mult);
  }
}
