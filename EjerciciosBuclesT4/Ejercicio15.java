/*15. Contar los dígitos de un número
Solicita al usuario que ingrese un número entero y usa un bucle para contar cuántos dígitos tiene.
*/

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Introduce un número entero");
        numero = sc.nextInt();

        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos");
    }
}
