package org.example;


import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce un valor de x");
         double x = sc.nextDouble();

         //Expresion matemática

        double fx= (x*x*x*x*x)+(7*(x*x*x*x))-(4*(x*x*x))+(2*(x*x))-(x)+10;

        System.out.println("El resultado es "+fx);

    }
}