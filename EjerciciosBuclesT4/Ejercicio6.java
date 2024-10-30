/*6. Contar vocales en una cadena
Escribe un programa que cuente cuántas vocales hay en una cadena introducida por el usuario utilizando un bucle.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador=0;
        String cadena;
        char aux;

        System.out.println("Escribe una cadena");
        cadena = sc.nextLine();

        for (int j=0; j<cadena.length();j++){
           aux= cadena.charAt(j);
            if (aux=='a'||aux=='e'||aux=='i'||aux=='o'||aux=='u'){
                contador++;
            }

        }

        System.out.println("La palabra "+cadena+" tiene "+contador+ " vocales");

    }
}
