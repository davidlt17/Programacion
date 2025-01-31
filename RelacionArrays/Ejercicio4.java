//Contar cuántas vocales hay en un array de caracteres.

public class Ejercicio4 {
    public static int ej4 (char [] arraychar){

        char letra;
        int contador=0;
        for(char c: arraychar){
            letra= Character.toLowerCase(c);
            if (letra  == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        return contador;
    }
}
