import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public void copiarArchivo(String ruta, String ruta_copia) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta));
             BufferedWriter wr = new BufferedWriter(new FileWriter(ruta_copia))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                wr.write(linea);
                wr.newLine();
            }
            System.out.println("Contenido copiado");
        } catch (IOException e) {
            System.out.println("Error al copiar.");
        }
    }
}
