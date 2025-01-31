//8. Contar cuántas veces aparece un carácter específico en un array de caracteres.

public class Ejercicio8 {
    public static int ej8 (char [] array , char caracter){
        int contador=0;
        for (char c: array){
            if (c==caracter){
                contador ++;
            }
        }
        return contador;
    }
}
