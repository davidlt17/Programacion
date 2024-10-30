/*17. Adivina el número
Crea un juego donde se le pida al usuario que adivine un número entre 1 y 10. Utiliza Random para generar el número y un bucle para seguir pidiendo hasta que lo adivine.
*/

import java.util.Scanner;
import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        int numero = generador.nextInt(10) + 1;
        int intento;

        do {
            System.out.println("Adivina el número entre 1 y 10");
            intento = sc.nextInt();
        } while (intento != numero);

        System.out.println("Has acertado, el número era " + numero);
    }
}
