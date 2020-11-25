import java.util.Scanner;

public class Ejercicio5 {
      public static void main(String[ ] arg) {
    double euros;

  Scanner scanea = new Scanner(System.in);   
  System.out.print("¿Cuantos euros quieres pasar a pesetas?");;
  euros=scanea.nextFloat();
    
  double pesetas=euros*166.386;
  System.out.println(euros+"€ son "+pesetas+" pesetas");

  scanea.close();
  }
} 