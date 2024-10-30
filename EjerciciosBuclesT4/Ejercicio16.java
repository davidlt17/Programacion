/*16. Sumar los dígitos de un número
Escribe un programa que sume todos los dígitos de un número entero introducido por el usuario utilizando bucles.*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Introduce un número entero");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es " + suma);
    }
}
