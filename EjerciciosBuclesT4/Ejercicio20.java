/*20. Mostrar múltiplos de 5
Escribe un programa que muestre los múltiplos de 5 entre 1 y 100 utilizando un bucle y condicionales para filtrarlos.
*/

public class Ejercicio20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
