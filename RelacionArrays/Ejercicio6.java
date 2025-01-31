//Invertir el orden de un array de enteros.

public class Ejercicio6 {
    public static int[] ej6 (int [] array){
        int[] invertido = new int[array.length];
        int j=0;
        for (int i= array.length-1; i>=0; i--){
            invertido[j]=array[i];
            j++;
        }
        return invertido;
    }
}
