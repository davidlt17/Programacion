/*8. Juego de adivinanza
Crea un programa que genere un número aleatorio entre 1 y 100. El usuario tiene que adivinar el número. Usa Scanner para leer la entrada del usuario y un bucle para seguir pidiendo hasta que lo adivine.*/


import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generador = new Random();
        int num;
        int aleatorio;

        aleatorio = generador.nextInt(99) + 1;

        System.out.println("**Inserta un número para intentar resolver la adivinanza**");
        num = sc.nextInt();

        while (num != aleatorio) {
            System.out.println("**Inserta un número para intentar resolver la adivinanza**");
            num = sc.nextInt();

        }
        System.out.println("**Has acertado!!**");


    }
}
