import java.util.Scanner;

public class Ejercicio2 {
      public static void main(String[ ] arg) {

      int a, b, c ;
      Scanner scanea = new Scanner(System.in);
      System.out.print("Por favor, introduce el valor de a: ");
      a=scanea.nextInt();
      System.out.print("Por favor, introduce el valor de b: ");
      b=scanea.nextInt();
      System.out.println("El valor inical de a es "+a+" y el de b es "+b);
      c=a;
      a=b;
      b=c;
      System.out.println("Ahora a vale "+a+" y b vale "+b);
      scanea.close();

  }
} 