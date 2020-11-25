import java.text.DecimalFormat;
import java.lang.Math;
public class Ejercicio3t3 {
    public static void main(String[ ] arg) {
        DecimalFormat formatea= new DecimalFormat("0000000000");
       
        int a= 8;
        int b= 3;
        double c= (double) a/b;

        System.out.printf("%1.16f %n",c);
        System.out.printf("%1.2f %n",c);
        System.out.printf(" %1.2f %n",c);
        System.out.printf("   %1.3f %n",c);
        System.out.printf("%3.3f %n",c);
        System.out.printf("    %1.4f %n",c);
        System.out.printf("%1.3f %n",c);
        System.out.printf("   %1.5f %n",c);
        System.out.printf(formatea.format(c));
        


    }
}