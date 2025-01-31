import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        int [] array = {12,23,33,44,78};
        Ejercicio1.ej1(array);

        //Ejercicio2
        int suma= Ejercicio2.ej2(array);
        System.out.println("La suma de los elementos es: " +suma);

        //Ejercicio 3
        int mayor= Ejercicio3.ej3(array);
        System.out.println("El mayor de los elementos es: "+mayor);

        //Ejercicio4
        char [] arraychar = {'a','H','o','b','i'};
        int vocales= Ejercicio4.ej4(arraychar);
        System.out.println("Hay "+vocales+ " vocales");

        //Ejercicio5
        String [] arrayString = {"adios","Hola","Hasta Luego"};
        String concat = Ejercicio5.ej5(arrayString);
        System.out.println(concat);

        //Ejercicio6
        int[] original = {1, 2, 3, 4, 5};
        int[] resultado = Ejercicio6.ej6(original);
        System.out.println(Arrays.toString(resultado));

        //Ejercicio 7
        int media= Ejercicio7.ej7(array);
        System.out.println("La media del array es: "+media);

        //Ejercicio 8
        int cuenta = Ejercicio8.ej8(arraychar, 'a');
        System.out.println("El caracter aparece "+cuenta+" veces");

        //Ejercicio 9
        System.out.println(Ejercicio9.ej9(original)); //True o False , ordenado o desordenado

        //Ejercicio 10
        int[][] matriz1 = {{1, 2}, {3, 4}};

        int[][] matriz2 = {{5, 6}, {7, 8}};

        // Sumar las matrices
        int[][] resultadomatrices = Ejercicio10.sumarMatrices(matriz1, matriz2);

        // Imprimir el resultado
        System.out.println("Resultado de la suma:");
        Ejercicio10.imprimirMatriz(resultadomatrices);

        //Ejercicio 11
        int[][] traspuesta =Ejercicio11.transponer(matriz1);
        Ejercicio11.imprimirMatriz(traspuesta);

        //Ejercicio 12
        int[] pares=Ejercicio12.obtenerPares(original);
        int[] impares=Ejercicio12.obtenerImpares(original);
        Ejercicio12.imprimirArray(pares);
        Ejercicio12.imprimirArray(impares);

        //Ejercicio 13
        int[] array13 = {5, 3, 8, 6, 2};
        System.out.println("Array original:");
        Ejercicio13.imprimirArray(array13);
        Ejercicio13.ordenar(array13);
        System.out.println("Array ordenado:");
        Ejercicio13.imprimirArray(array13);

        //Ejercicio14
        int[][] matriz14 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Ejercicio14.imprimirDiagonal(matriz14);

        //Ejercicio15
        String[] palin = {"ana", "civic", "java", "radar", "holao"};
        Ejercicio15.verificarPalindromos(palin);
    }
}