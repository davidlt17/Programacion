//11. Transponer una matriz 2x2.

public class Ejercicio11 {
        public static int[][] transponer(int[][] matriz) {
            int filas = matriz.length;
            int columnas = matriz[0].length;

            int[][] traspuesta = new int[columnas][filas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    traspuesta[j][i] = matriz[i][j];
                }
            }

            return traspuesta;
        }

        public static void imprimirMatriz(int[][] matriz) {
            for (int[] fila : matriz) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        }
    }

