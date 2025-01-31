//Concatenar todos los elementos de un array de cadenas en una sola cadena.

public class Ejercicio5 {
    public static String ej5 (String[] arraystr){

        StringBuilder resultado = new StringBuilder();

        for (String cadena : arraystr) {
            resultado.append(cadena);
        }
        return resultado.toString();
    }

}
