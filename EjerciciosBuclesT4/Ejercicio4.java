/*4. Generar una cadena aleatoria
Crea un programa que genere una cadena de longitud `n` con caracteres aleatorios utilizando la clase Random. Pide `n` al usuario.*/


import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generador = new Random();

        char letra;
        int n;
        int random;
        String cadena = "";

        System.out.println("Escribe N para generar un numero aleatorio");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            random = generador.nextInt(30) + 65; //Rango ASCII razonable
            letra = (char) random;
            cadena += letra;
        }
        System.out.println("" + cadena);

    }
}
