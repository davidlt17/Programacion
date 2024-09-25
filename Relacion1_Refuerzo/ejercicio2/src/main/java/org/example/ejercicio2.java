//Ejercicio 2 David Lara
package org.example;
import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas por día");
        double horas_diarias = sc.nextInt();

        double salario_semanal= 5* horas_diarias *12 ; //Suponemos un trabajo de 5 días a la semana

        System.out.println("El salario semanal es de "+salario_semanal+" euros");




    }
}