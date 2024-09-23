package org.example;

import java.util.Scanner;


public class ejercicio1 {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("iNGRESA EL RADIO DEL CIRCULO");
        double radio= sc.nextDouble();

        final double PI=3.14;
                double area = PI*radio*radio;
                double perimetro = 2*PI*radio;

    System.out.println("El area es " +area+ " Y el perimetro es "+perimetro);




    }
}