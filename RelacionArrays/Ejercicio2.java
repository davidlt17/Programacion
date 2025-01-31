//2. Calcular la suma de los elementos en un array de enteros

public class Ejercicio2 {
    public static int ej2(int[] array){
        int suma =0;
        for (int i=0; i<= array.length-1;i++){
            suma+=array[i];
        }
        return suma;
    }
}
