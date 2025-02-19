package David;

import java.io.*;
import java.util.*;

public class LeerCSV {

    // Método para leer el archivo CSV y devolver una lista de estudiantes
    public static ArrayList<Estudiante> leerCsv(String ruta) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String fila;
            while ((fila = br.readLine()) != null) {
                String[] valores = fila.split(",");
                if (valores.length == 4) { // Para comprobar que una linea tiene 4 parametros y no esta mal
                    String nombre = valores[0];
                    int edad = Integer.parseInt(valores[1]);
                    String ciudad = valores[2];
                    double calificacion = Double.parseDouble(valores[3]);

                    Estudiante estudiante = new Estudiante(nombre, edad, ciudad, calificacion);
                    estudiantes.add(estudiante);
                } else {
                    System.out.println("Línea incompatible: " + fila);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el CSV: " );
        }
        return estudiantes;
    }

    // Método para obtener ciudades únicas
    public static HashSet<String> ciudadesUnicas(ArrayList<Estudiante> estudiantes) {
        HashSet<String> unicas = new HashSet<>();
        for (Estudiante estudiante : estudiantes) {
            unicas.add(estudiante.getCiudad());
        }
        return unicas;
    }

    // Método para agrupar estudiantes por ciudad
    public static Map<String, ArrayList<Estudiante>> agruparCiudad(ArrayList<Estudiante> estudiantes) {
        Map<String, ArrayList<Estudiante>> estudiantesAgrupados = new HashMap<>();
        for (Estudiante estudiante : estudiantes) {
            estudiantesAgrupados.putIfAbsent(estudiante.getCiudad(), new ArrayList<>());
            estudiantesAgrupados.get(estudiante.getCiudad()).add(estudiante);
        }
        return estudiantesAgrupados;
    }
}