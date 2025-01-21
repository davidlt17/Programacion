import java.io.*;

public class CopiarCSV {
    public void copiarArchivo(String origen, String destino) {
        try (BufferedReader br = new BufferedReader(new FileReader(origen));
             BufferedWriter wr = new BufferedWriter(new FileWriter(destino))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                wr.write(linea);
                wr.newLine();
            }
            System.out.println("El archivo CSV ha sido copiado.");
        } catch (IOException e) {
            System.out.println("Error al intentar copiar el archivo.");
        }
    }
}
