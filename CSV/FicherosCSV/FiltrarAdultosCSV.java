import java.io.*;

public class FiltrarAdultosCSV {
    public void generarAdultos(String rutaOrigen, String rutaDestino) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaOrigen));
             BufferedWriter wr = new BufferedWriter(new FileWriter(rutaDestino))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int edad = Integer.parseInt(datos[1]);
                if (edad >= 18) {
                    wr.write(linea);
                    wr.newLine();
                }
            }
            System.out.println("Se ha generado el archivo.");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo.");
        }
    }
}
