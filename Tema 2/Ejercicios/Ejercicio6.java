import java.util.Scanner;

public class Ejercicio6 {
      public static void main(String[ ] arg) {
    float nota1, notadeseada;

  Scanner scanea = new Scanner(System.in);   
  System.out.print("¿Qué nota sacaste en el primer examen?");;
  nota1=scanea.nextFloat();
  System.out.print("¿Qué nota quieres sacar en el trimestre?");;
  notadeseada=scanea.nextFloat();

  double nota2=((notadeseada-(0.4*nota1))/0.6);
  scanea.close();
  if (nota1>10||notadeseada>10){
    System.out.println("Eso es imposible...");

   } else if(nota2>10||nota2<0){
     System.out.println("No puedes sacar esa nota");



    }
    else{
      
  System.out.println("Tienes que sacar un "+nota2+" en el segundo examen.");
    }
  }
  
  }
