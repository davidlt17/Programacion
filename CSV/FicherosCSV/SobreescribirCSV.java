import java.io.*;
import java.util.List;

public class SobreescribirCSV {
    public void sobreescribirArchivo(String ruta, List<String> lineas) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(ruta))) {
            for (String linea : lineas) {
                wr.write(linea);
                wr.newLine();
            }
            System.out.println("El archivo CSV ha sido sobrescrito.");
        } catch (IOException e) {
            System.out.println("Error al intentar sobrescribir el archivo.");
        }
    }
}
