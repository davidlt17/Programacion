/*7. Imprimir números del 1 al N
Pide al usuario un número `N` y utiliza un bucle para imprimir todos los números desde 1 hasta `N`.*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n;
        int num=0;

        System.out.println("Imprimir números de 1 a N: \n Introduce el valor de N");
        n=sc.nextInt();


        for (int i=1;i<=n;i++){
            num++;
            System.out.println(""+num);
        }



    }
}
