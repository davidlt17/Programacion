import java.io.*;

public class ContarLineasCSV {
    public int contarLineas(String ruta) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while (br.readLine() != null) {
                contador++;
            }
        } catch (IOException e) {
            System.out.println("Error al contar las líneas del archivo.");
        }
        return contador;
    }
}
