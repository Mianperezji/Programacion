import java.util.Scanner;

public class Ejercicio4 {
      public static void main(String[ ] arg) {
    int ninyos, ninyas, total, pninyos, pninyas;

    Scanner scanea = new Scanner(System.in);   
    System.out.println("¿Cuantos niños hay en clase?");
    ninyos=scanea.nextInt();
    
    System.out.println("¿Cuantas niñas hay en clase?");
    ninyas=scanea.nextInt();
    total=ninyos+ninyas;
    pninyos = (ninyos* 100)/total;
    pninyas= (ninyas*100)/total;

   System.out.println("Hay un "+pninyos+" % de niños y un "+pninyas+" % de niñas.");

        scanea.close();
  }
} 