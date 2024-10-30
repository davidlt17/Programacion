/*18. Contar consonantes en una cadena
Escribe un programa que cuente cuántas consonantes hay en una cadena introducida por el usuario usando un bucle.*/

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        int contador = 0;

        System.out.println("Introduce una cadena");
        cadena = sc.nextLine().toLowerCase();//Pasamos a minuscula

        for (int i = 0; i < cadena.length(); i++) {
            char aux = cadena.charAt(i);

            if (aux != 'a' && aux != 'e' && aux != 'i' && aux != 'o' && aux != 'u'  && (aux >= 'a' && aux <= 'z')) { //Tambien filtro para estar en el rango de las minusculas (Si no se cuentan los espacios como consonantes)
                contador++;
            }
        }

        System.out.println("La cadena tiene " + contador + " consonantes");
    }
}
