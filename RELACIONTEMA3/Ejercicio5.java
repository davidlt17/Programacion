/*Ejercicio 5: Sistema de clasificación de triángulos
Solicita al usuario las longitudes de los tres lados de un triángulo. Usa una serie
de `if-else` y operadores lógicos para determinar el tipo de triángulo:*/

package David;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int lado1;
        int lado2;
        int lado3;


        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce la longitud del lado 1: ");
        lado1 = sc.nextInt();

        System.out.println("Introduce la longitud del lado 2: ");
        lado2 = sc.nextInt();

        System.out.println("Introduce la longitud del lado 3: ");
        lado3 = sc.nextInt();

        if ((lado1 == 0) || (lado2 == 0) || (lado3 == 0)) {
            System.out.println("Invalido: NO forman un triangulo ");

        } else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
            System.out.println("Triangulo escaleno ");

        } else if ((lado1 == lado2) && (lado1 == lado3)) {
            System.out.println("Triangulo equilatero ");

        } else
            System.out.println("Triangulo isosceles ");


    }

}
