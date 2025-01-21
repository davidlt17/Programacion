import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Escribir una sola línea en un archivo CSV
        EscribirCSV ej1 = new EscribirCSV();
        ej1.escribirLinea("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv", "David,25,Granada");

        // Ejercicio 2: Leer y mostrar el contenido de un archivo CSV
        LeerCSV ej2 = new LeerCSV();
        ej2.leerArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv");

        // Ejercicio 3: Agregar varias líneas a un archivo CSV
        AgregarLineas ej3 = new AgregarLineas();

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas líneas vas a  agregar?");
        int numLineas = sc.nextInt();
        sc.nextLine();
        String[] lineas = new String[numLineas];
        for (int i = 0; i < numLineas; i++) {
            System.out.println("Introduce la línea " + (i + 1) + " ( nombre,edad,ciudad ):");
            lineas[i] = sc.nextLine();
        }

        ej3.agregarLineas("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv", lineas);



        // Ejercicio 4: Sobrescribir un archivo CSV
        SobreescribirCSV ej4 = new SobreescribirCSV();
        ej4.sobreescribirArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv",
                Arrays.asList("Carlos,40,Barcelona", "María,22,Valencia"));

        // Ejercicio 5: Contar el número total de líneas en un archivo CSV
        ContarLineasCSV ej5 = new ContarLineasCSV();
        int totalLineas = ej5.contarLineas("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv");
        System.out.println("Número total de líneas: " + totalLineas);

        // Ejercicio 6: Leer y mostrar componentes de un archivo CSV
        MostrarComponentes ej6 = new MostrarComponentes();
        ej6.mostrarComponentes("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv");

        // Ejercicio 7: Copiar el contenido de un archivo CSV
        CopiarCSV ej7 = new CopiarCSV();
        ej7.copiarArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv",
                "C:\\Users\\David Lara\\Desktop\\txt\\src\\copia_datos.csv");

        // Ejercicio 8: Filtrar personas mayores de edad y generar otro archivo CSV
        FiltrarAdultosCSV ej8 = new FiltrarAdultosCSV();
        ej8.generarAdultos("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv",
                "C:\\Users\\David Lara\\Desktop\\txt\\src\\adultos.csv");

        // Ejercicio 9: Ordenar un archivo CSV por el primer campo (nombre)
        OrdenarCSV ej9 = new OrdenarCSV();
        ej9.ordenarArchivo("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv",
                "C:\\Users\\David Lara\\Desktop\\txt\\src\\ordenado.csv");

        // Ejercicio 10: Combinar dos archivos CSV en un tercer archivo sin duplicados
        CombinarCSV ej10 = new CombinarCSV();
        ej10.combinarArchivos("C:\\Users\\David Lara\\Desktop\\txt\\src\\pruebas.csv", "C:\\Users\\David Lara\\Desktop\\txt\\src\\copia_datos.csv", "C:\\Users\\David Lara\\Desktop\\txt\\src\\combinado.csv");
    }
}
