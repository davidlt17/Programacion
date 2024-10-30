/*13. Generar una contraseña aleatoria
Usa la clase Random para generar una contraseña aleatoria de 8 caracteres, que contenga letras y números, en un bucle.*/


import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {

        Random generador = new Random();
        String caracteres = "123456789qwertyuiopasdfghjkl¿+´ç<>zxcvbnm,.;:_¨^*ÇAQWERTYUIOPSDFGHJKLÑZMNXBCV"; //77 caracteres
        String clave = "";
        int aleatorio;
        char caracter;

        for (int i = 0; i < 8; i++) {
            //aleatorio=generador.nextInt(77)
            caracter = caracteres.charAt(generador.nextInt(caracteres.length()));
            clave += caracter;
        }
        System.out.println("La clave es " + clave);
    }
}
