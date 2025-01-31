//7. Calcular el promedio de un array de enteros

public class Ejercicio7 {
    public static int ej7 (int [] array){
        int suma=0;
        int media=0;
        for (int i=0; i<=array.length -1; i++){
            suma+=array[i];
        }
        media=suma/array.length;
        return media;
    }
}
