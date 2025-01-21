import java.io.*;
import java.util.Scanner;

public class AgregarLineas {
    public void agregarLineas(String ruta, String[] lineas) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(ruta, true))) {
            for (String linea : lineas) {
                wr.write(linea);
                wr.newLine();
            }
            System.out.println("Lineas agregadas.");
        } catch (IOException e) {
            System.out.println("Error al agregar lineas.");
        }
    }
}
