import java.io.*;

public class EscribirCSV {
    public void escribirLinea(String ruta, String linea) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(ruta))) {
            wr.write(linea);
            wr.newLine();
            System.out.println("Se ha escrito la línea en el archivo CSV.");
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo.");
        }
    }
}
