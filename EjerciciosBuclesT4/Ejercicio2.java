/*2. Buscar una letra en una cadena
Pide al usuario una cadena y una letra. Utiliza un bucle para contar cuántas veces aparece la letra en la cadena y muestra el resultado.
*/


import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char letra;
        int caracteres = 0;
        int contador=0;

        System.out.println("Escribe una frase");
        cadena= sc.nextLine().toLowerCase();
        System.out.println("Escribe una letra");
        letra =  sc.next().charAt(0);
        char minuscula = Character.toLowerCase(letra);

        for (int i = 0; i < cadena.length(); i++){
            if (minuscula == cadena.charAt(i)){
               contador++;
            }
        }

        System.out.println("La letra "+letra+ " se repite "+contador+" veces.");




    }
}
