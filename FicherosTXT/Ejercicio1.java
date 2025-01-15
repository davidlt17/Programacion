import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public void escribirArchivo(String texto , String ruta) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(ruta))) {
            wr.write(texto);
            wr.newLine();
            System.out.println("El archivo 'archivo1.txt' se ha creado.");
        } catch (IOException e) {
            System.out.println("No se ha podido escribir");
        }
    }
}
