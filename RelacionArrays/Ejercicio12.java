//12. Crear un array de enteros y separar los números pares e impares en dos arrays diferentes.

public class Ejercicio12 {
    public static int[] obtenerPares(int[] array) {
        int contador = 0;
        for (int numero : array) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        int[] pares = new int[contador];
        int indice = 0;

        for (int numero : array) {
            if (numero % 2 == 0) {
                pares[indice] = numero;
                indice++;
            }
        }

        return pares;
    }

    public static int[] obtenerImpares(int[] array) {
        int contador = 0;

        for (int numero : array) {
            if (numero % 2 != 0) {
                contador++;
            }
        }
        int[] impares = new int[contador];
        int indice = 0;

        for (int numero : array) {
            if (numero % 2 != 0) {
                impares[indice] = numero;
                indice++;
            }
        }

        return impares;
    }

    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
