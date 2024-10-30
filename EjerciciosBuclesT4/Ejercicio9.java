/*9. Suma de números pares
Escribe un programa que pida un número `N` y sume todos los números pares desde 1 hasta `N` utilizando un bucle.*/


import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args){

        Scanner sc=new Scanner(System.in);
        int contador=0;
        int num;

        System.out.println("Inserta un número N");
        num= sc.nextInt();


        for (int i=1; i<=num;i++){
            contador++;
            if (contador%2==0){
                System.out.println("El numero "+contador+ " es par");
            }
        }

    }
}
