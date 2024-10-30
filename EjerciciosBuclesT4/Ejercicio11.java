/*11. Contar la cantidad de palabras en una cadena
Escribe un programa que cuente cuántas palabras hay en una cadena introducida por el usuario usando bucles y condicionales.*/


import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        char espacio = ' ';
        int contador = 1;
        //int num_palabras;

        System.out.println("Escribe una cadena");
        cadena = sc.nextLine();


        for (int i = 0; i < cadena.trim().length(); i++) {

            if (cadena.charAt(i) == espacio) {
                contador++;
            }

        }
        //num_palabras = contador + 1; Funciona bien pero prefiero iniciar el contador en 1 en vez de hacer una operacion mas

        System.out.println("La cadena tiene " + contador + " palabras");
    }
}
