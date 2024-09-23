package org.example;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el primer número");
        double num1=sc.nextDouble();

        System.out.println("Introduce el segundo número");
        double num2=sc.nextDouble();

        System.out.println("Introduce el tercer número");
        double num3=sc.nextDouble();

        System.out.println("Introduce el cuarto número");
        double num4=sc.nextDouble();

        double multiplicacion= num1*num2*num3*num4;
        double suma = num1+num2+num3+num4;
        double media = (suma/4.0) ;

        System.out.println("La suma es "+suma+ " ,la multiplicacion es "+multiplicacion+ " ,y la media es "+media);



    }
    }

