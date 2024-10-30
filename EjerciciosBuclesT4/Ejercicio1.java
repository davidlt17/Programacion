/*1. Contar caracteres en una cadena
Escribe un programa que pida al usuario una cadena y cuente cuántos caracteres tiene usando un bucle.
Muestra el resultado al finalizar.
*/


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int caracteres = 0;

        System.out.println("Escribe una frase");
        cadena= sc.nextLine();


        for (int i = 0; i <= cadena.length(); i++){
        caracteres++;
        }

        System.out.println(""+caracteres);
    }
}
