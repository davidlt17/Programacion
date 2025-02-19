package David;

import java.util.LinkedList;
import java.util.Queue;

public class GestionAtencionEstudiantes {
    private Queue<Estudiante> colaEstudiantes = new LinkedList<>();

    // Agregar un estudiante a la cola
    public void agregarEstudiante(Estudiante estudiante) {
        colaEstudiantes.offer(estudiante); // Añade al final de la cola
        System.out.println("Estudiante agregado a la cola: " + estudiante.getNombre());
    }

    // Atender a los estudiantes en orden
    public void atenderEstudiantes() {
        System.out.println("\n--- Atención de estudiantes ---");
        while (!colaEstudiantes.isEmpty()) {
            Estudiante atendido = colaEstudiantes.poll(); // Haces el primero y s e elimina
            System.out.println("Atendiendo a: " + atendido.getNombre());
        }
        System.out.println("No quedan más estudiantes en la cola.");
    }
}