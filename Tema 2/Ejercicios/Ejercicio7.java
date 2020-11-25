import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7 {
    public static void main(String[ ] arg) {

        double x, y, z;

        Scanner scanea = new Scanner(System.in);

        System.out.println("Por favor, introduce el valor de x, gracias");
        x= scanea.nextDouble();
        System.out.println("Por favor, introduce el valor de y, gracias");
        y=scanea.nextDouble();

        z=(1+((Math.pow(x, 2)/y))/(Math.pow(x, 3)/(1+y)));

        System.out.println("El valor de z es igual a " + z);

        scanea.close();


    }
}
