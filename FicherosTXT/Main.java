import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejemplo de ejecución
        Ejercicio1 ej1 = new Ejercicio1();
        ej1.escribirArchivo("Probando,Probando","C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas");

        Ejercicio2 ej2 = new Ejercicio2();
        ej2.leerArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas");

        Ejercicio3 ej3 = new Ejercicio3();
        ej3.copiarArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas","C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas2");

        Ejercicio4 ej4 = new Ejercicio4();
        ej4.agregarDatos("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas", "Agregando Texto");

        Ejercicio5 ej5 = new Ejercicio5();
        ej5.contarLineas("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas");

        Ejercicio6 ej6 = new Ejercicio6();
        ej6.sobrescribirArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas","Sobreescribiendo");

        Ejercicio7 ej7 = new Ejercicio7();
        ej7.concatenarArchivos("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas","C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas2", "C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas3");

        Ejercicio8 ej8 = new Ejercicio8();
        ej8.buscarPalabra("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas","pruebas");

        Ejercicio9 ej9 = new Ejercicio9();
        ej9.filtrarLineas("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas","C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas2","Probando");

        Ejercicio10 ej10 = new Ejercicio10();
        ej10.eliminarArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas");
    }

}
