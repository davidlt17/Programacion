public class Ejercicio14 {
    public static void imprimirDiagonal(int[][] matriz) {
        if (matriz.length != matriz[0].length) {
            System.out.println("La matriz no es cuadrada de 3x3 .");
            return;
        }

        System.out.println("La diagonal es :");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}
