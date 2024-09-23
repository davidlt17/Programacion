package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un Numero");
        int num= sc.nextInt();
       // System.out.println("El numero es "+num+".");

        System.out.println("Ahora Dime un Nombre");
        sc.nextLine();
        String cadena=sc.nextLine();
        System.out.println("Ahora Dime Edad");
        String edad=sc.nextLine();
        System.out.println("Ahora Dime un Direccion");
        String dir=sc.nextLine();
        System.out.println("Ahora Dime Salario");
        Double salario= sc.nextDouble();


        System.out.println("Has introducido el número "+num+" ,el nombre "+cadena+",edad = "+edad+" ,la direccion "+dir+" Y salario = "+salario);

    }

}