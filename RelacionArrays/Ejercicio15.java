public class Ejercicio15 {
    public static boolean esPalindromo(String cadena) {
        int inicio = 0;
        int fin = cadena.length() - 1;

        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }

    public static void verificarPalindromos(String[] array) {
        for (String cadena : array) {
            if (esPalindromo(cadena)) {
                System.out.println(cadena + " es un palíndromo.");
            } else {
                System.out.println(cadena + " no es un palíndromo.");
            }
        }
    }
}
