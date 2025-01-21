import java.io.*;
import java.util.*;

public class OrdenarCSV {
    public void ordenarArchivo(String rutaOrigen, String rutaDestino) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaOrigen))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            Collections.sort(lineas);
            try (BufferedWriter wr = new BufferedWriter(new FileWriter(rutaDestino))) {
                for (String lineaOrdenada : lineas) {
                    wr.write(lineaOrdenada);
                    wr.newLine();
                }
            }
            System.out.println("El archivo ha sido ordenado.");
        } catch (IOException e) {
            System.out.println("Error al ordenar el archivo CSV.");
        }
    }
}
