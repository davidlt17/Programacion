/*10. Cadenas de longitud variable
Pide al usuario que ingrese varias cadenas hasta que ingrese 'salir'. Utiliza un bucle para contar cuántas cadenas ingresó y muestra cuál es la más larga.
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;
        String cadenarecord = "";
        int contador = 0;
        int longitud;
        int record = 0;
        int numcadenas;

        do {

            System.out.println("Escribe una cadena o 'salir' para finalizar");
            cadena = sc.nextLine();
            contador++;

            if ((cadena.length() > record) && (!(cadena.equals("salir")))) {
                record = cadena.length();
                cadenarecord = (cadena);
            }


        }
        while (!(cadena.toLowerCase().equals("salir")));

        numcadenas = contador - 1;

        if (contador == 1) {
            System.out.println("El usuario ha salido sin introducir ninguna cadena");
        } else {

            System.out.println("El usuario ha introducido " + numcadenas + " cadenas antes de salir");
            System.out.println("La cadena " + cadenarecord + " es la más larga con una longitud de " + record + " caracteres.");
        }

    }
}
