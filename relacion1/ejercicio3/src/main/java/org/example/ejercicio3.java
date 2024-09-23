 //Ejercicio 3 David Lara

package org.example;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.println("¿Cuantos productos electrónicos se han vendido?");
        int electronica= sc.nextInt();

        System.out.println("¿Cuantos productos de ropa se han vendido?");
        int ropa= sc.nextInt();

        int suma=electronica+ropa;
        double por_ropa= (ropa*100)/suma;
        double por_electronica= (electronica*100)/suma;

        System.out.println(" El total de productos vendidos es " +suma+ ", de los cuales un "+por_electronica+"% es de electronica y un "+por_ropa+"% es de ropa");

    }
}