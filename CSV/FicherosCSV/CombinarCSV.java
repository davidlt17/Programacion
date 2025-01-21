import java.io.*;
import java.util.*;

public class CombinarCSV {
    public void combinarArchivos(String ruta1, String ruta2, String rutaDestino) {
        Set<String> lineasUnicas = new LinkedHashSet<>();
        try (BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
             BufferedReader br2 = new BufferedReader(new FileReader(ruta2))) {

            String linea;
            while ((linea = br1.readLine()) != null) {
                lineasUnicas.add(linea);
            }
            while ((linea = br2.readLine()) != null) {
                lineasUnicas.add(linea);
            }

            try (BufferedWriter wr = new BufferedWriter(new FileWriter(rutaDestino))) {
                for (String lineaUnica : lineasUnicas) {
                    wr.write(lineaUnica);
                    wr.newLine();
                }
            }
            System.out.println(" archivos han sido combinados.");
        } catch (IOException e) {
            System.out.println("Error al combinar ");
        }
    }
}
