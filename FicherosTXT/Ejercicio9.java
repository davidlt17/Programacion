import java.io.*;

public class Ejercicio9 {
    public void filtrarLineas(String ruta, String ruta2 ,String palabra) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta)); //Ruta Origen
             BufferedWriter wr = new BufferedWriter(new FileWriter(ruta2))) { //Ruta destino

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    wr.write(linea);
                    wr.newLine();
                }
            }
            System.out.println("Las líneas con la palabra:" + palabra + "' se guardaron.");
        } catch (IOException e) {
            System.out.println("Error al filtrar.");
        }
    }
}
