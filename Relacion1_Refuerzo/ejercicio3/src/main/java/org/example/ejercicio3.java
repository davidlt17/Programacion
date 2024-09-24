//Ejercicio 3 David Lara
package org.example;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
            System.out.println("¿Cuantos partidos ha ganado el equipo?");
                int vic= sc.nextInt();
            System.out.println("¿Cuantos partidos ha empatado el equipo?");
                int emp= sc.nextInt();
            System.out.println("¿Cuantos partidos ha perdido el equipo?");
                int der = sc.nextInt();

                int puntos= (vic*3)+ emp;

            System.out.println("El equipo tiene un total de "+puntos+ " puntos.");



    }
}