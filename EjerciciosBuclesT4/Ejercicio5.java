/*5. Verificar si una cadena es un palíndromo
Pide al usuario una cadena y utiliza un bucle para verificar si es un palíndromo. Muestra un mensaje adecuado.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        String inverso = "";
        char caracter;

        System.out.println("Introduce una palabra");
        cadena = sc.nextLine();


        for (int i = cadena.length() - 1; i >= 0; i--) {
            inverso += cadena.charAt(i);

        }

        if (inverso.equals(cadena)) {


            System.out.println("La palabra es palindroma");

        } else
            System.out.println("La palabra no es palindroma");

    }
}