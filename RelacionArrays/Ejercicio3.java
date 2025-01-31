//Encontrar el número mayor en un array de enteros.

public class Ejercicio3 {
    public static int ej3 (int [] array){

        int num= array[0];
        for (int i =0; i<= array.length-1 ; i++){
            if (array[i]>num){
                num=array[i];
            }
        }
        return num;
    }
}
