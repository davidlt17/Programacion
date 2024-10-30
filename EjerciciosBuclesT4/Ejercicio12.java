/*12. Crear un menú
Crea un programa con un menú que permita al usuario elegir entre diferentes opciones, como contar caracteres o invertir una cadena. Usa bucles para repetir el menú hasta que el usuario decida salir.*/

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String seleccion;
        String contarchar;
        String invertircadena;
        String aux = "";
        int contador = 0;

        do {
            System.out.println("Bienvenido al menú, escribe contar  para contar los caracteres de una cadena, invertir para invertir una cadena o salir  si deseas salir");
            seleccion = sc.nextLine();


            switch (seleccion) {

                case "contar":

                    System.out.println("Introduce una cadena para contar sus caracteres");
                    contarchar = sc.nextLine();

                    for (int i = contarchar.length() - 1; i >= 0; i--) {
                        contador++;
                    }
                    System.out.println("La cadena tiene " + contador + " caracteres");

                    break;

                case "invertir":

                    System.out.println("Introduce una cadena para invertir sus caracteres");
                    invertircadena = sc.nextLine();

                    for (int i = invertircadena.length() - 1; i >= 0; i--) {
                        aux += invertircadena.charAt(i);
                    }
                    System.out.println("La cadena invertida es " + aux);

                    break;

                case "salir":

                    break;

                default:
                    System.out.println("La opcion no ha sido reconocida, intentalo de nuevo \n");

            }

        } while (!seleccion.equals("salir"));

        System.out.println("Has salido del programa");
    }
}





