//Ejercicio 5 David Lara

package org.example;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce una cantidad de segundos a convertir");
        int segundos1= sc.nextInt();

        int minutos1= segundos1/60;
        int segundos2 = (segundos1%60);

        int horas1= minutos1/60;
        int minutos2=(minutos1%60);


        System.out.println(+horas1 + " horas " + minutos2 + " minutos " + segundos2+ " segundos.");








    }
}