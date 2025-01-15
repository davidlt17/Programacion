import java.io.File;
import java.util.Scanner;

public class Ejercicio10 {
    public void eliminarArchivo(String ruta) {
        Scanner sc = new Scanner(System.in);
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe ");
            return;
        }

        System.out.println("¿ eliminar '" + ruta + "'? (s/n)");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            if (archivo.delete()) {
                System.out.println("El archivo fue eliminado .");
            } else {
                System.out.println("No se pudo eliminar el .");
            }
        } else {
            System.out.println("El archivo se elimino.");
        }
    }
}
