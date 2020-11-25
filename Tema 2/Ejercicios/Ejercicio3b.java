import java.util.Scanner;

public class Ejercicio3b {
      public static void main(String[ ] arg) {
    float x, y;

    Scanner scanea = new Scanner(System.in);   
    System.out.println("Por favor, introduce el valor de x");
    x=scanea.nextFloat();
    System.out.println("x vale " +x);
    System.out.println("Por favor, introduce el valor de y");
    y=scanea.nextFloat();
    System.out.println("y vale " +y);

    double suma= x+y;
    double resta= x-y;
    double division=y/x;
    double multiplicacion=x*y;

    System.out.println("Su suma da como resultado "+suma+", su resta "+resta+", su division "+division+" y su multiplicación "+multiplicacion);

    scanea.close();
  }
} 