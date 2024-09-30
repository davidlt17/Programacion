//Ejercicio 8 David Lara

package ejercicio8;
import java.util.Scanner;


public class ejercicio8 {
    public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);


       System.out.println("Introduce el año de tu nacimiento");
       int n1= sc.nextInt();

        System.out.println("Introduce el mes de tu nacimiento");
        int n2= sc.nextInt();


        System.out.println("Introduce el dia de tu nacimiento");
        int n3= sc.nextInt();


                //Calculo del numero de la suerte

        int n4= n1+n2+n3 ;
        int d1=n4%10;
        n4/=10;
        int d2= n4%10;
        n4/=10;
        int d3= n4%10;
        n4/=10;
        int d4=n4%10;

        int numsuerte= d1+d2+d3+d4;

        System.out.println("Tu numero de la suerte es "+numsuerte);






    }
}