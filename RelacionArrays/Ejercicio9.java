//9. Verificar si un array de enteros está en orden ascendente.

public class Ejercicio9 {
    public static boolean ej9(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
