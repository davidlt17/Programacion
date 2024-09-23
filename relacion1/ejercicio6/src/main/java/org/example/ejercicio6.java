//Ejercicio 6 David Lara

package org.example;
import java.util.Scanner;



public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce un número compuesto por 5 dígitos");
        int numero = sc.nextInt();



        int digito1= numero%10;
        numero/=10; // numero = numero / 10;
        int digito2= numero%10;
        numero/=10;
        int digito3= numero%10;
        numero/=10;
        int digito4= numero%10;
        numero/=10;
        int digito5= numero%10;

        System.out.println(+digito5+ "," +digito4+ "," +digito3+ "," +digito2+ "," +digito1);










        }
    }
