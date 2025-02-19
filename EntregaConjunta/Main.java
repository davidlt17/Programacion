package David;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\David Lara\\Desktop\\OneDrive\\1ºDAW\\Programación\\EntregaConjunta\\src\\main\\java\\David\\estudiantes.csv";

        // Leer estudiantes desde el CSV
        ArrayList<Estudiante> estudiantes = LeerCSV.leerCsv(ruta);

        // Mostrar todos los estudiantes
        System.out.println("--- Lista de estudiantes ---");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        // Mostrar ciudades únicas
        HashSet<String> ciudades = LeerCSV.ciudadesUnicas(estudiantes);
        System.out.println("\n--- Ciudades únicas ---");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }

        // Mostrar estudiantes agrupados por ciudad
        Map<String, ArrayList<Estudiante>> estudiantesPorCiudad = LeerCSV.agruparCiudad(estudiantes);
        System.out.println("\n--- Estudiantes agrupados por ciudad ---");
        for (Map.Entry<String, ArrayList<Estudiante>> entry : estudiantesPorCiudad.entrySet()) {
            System.out.println("Ciudad: " + entry.getKey());
            for (Estudiante estudiante : entry.getValue()) {
                System.out.println("  " + estudiante);
            }
        }

        // Gestionar la atención de estudiantes
        GestionAtencionEstudiantes gestion = new GestionAtencionEstudiantes();
        for (Estudiante estudiante : estudiantes) {
            gestion.agregarEstudiante(estudiante);
        }
        gestion.atenderEstudiantes();
    }
}