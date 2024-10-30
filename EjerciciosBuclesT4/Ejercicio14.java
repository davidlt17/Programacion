/*14. Cambiar el caso de los caracteres
Pide al usuario una cadena y usa un bucle para cambiar todos los caracteres de minúsculas a mayúsculas y viceversa.*/


import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        String resultado = "";
        char aux;

        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            aux = cadena.charAt(i);
            if (aux >= 'a' && aux <= 'z') {
                resultado += (char) (aux - ('a'-'A'));
            } else  {
                resultado += (char) (aux +('a'-'A'));
            }
        }

        System.out.println("La cadena modificada es: " + resultado);
    }
}
