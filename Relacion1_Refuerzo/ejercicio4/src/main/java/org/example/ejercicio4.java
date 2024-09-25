//Ejercicio4 David Lara
package org.example;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del alumno.");
         String Nombre= sc.next();
        System.out.println("Introduce la nota de prácticas");
         double pract= sc.nextDouble();
        System.out.println("Introduce la nota de teoría");
         double teoria=sc.nextDouble();
        System.out.println("Introduce la nota de problemas");
         double problemas=sc.nextDouble();

     //Calculo nota final
     double notaFinal = (0.1*pract)+(0.5*problemas)+(0.4*teoria);
        System.out.println("Nota final de "+Nombre+" es "+notaFinal+".");

     }


}
