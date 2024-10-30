/*3. Invertir una cadena
        Solicita al usuario una cadena y utiliza un bucle para invertirla y mostrar el resultado.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        String aux="";

        System.out.println("Escribe una frase");
        cadena= sc.nextLine();

        for (int i =cadena.length()-1; i>=0;i--) {
            aux += cadena.charAt(i);

        }

        System.out.println(""+aux);
    }
}
