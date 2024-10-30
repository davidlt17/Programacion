/* 19. Números aleatorios y media
Genera 10 números aleatorios entre 1 y 100 utilizando un bucle, y calcula y muestra la media de esos números.
*/

import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {

        Random generador = new Random();
        int suma = 0;
        int numero;
        double media;

        for (int i = 0; i < 10; i++) {
            numero = generador.nextInt(100) + 1;
            suma += numero;
            System.out.println("Número generado: " + numero);
        }
        media= suma/10.0;
        System.out.printf("\nLa media de los números es " +media);
    }
}
