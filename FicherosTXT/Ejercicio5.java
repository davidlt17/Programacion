import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public void contarLineas(String ruta) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while (br.readLine() != null) {
                contador++;
            }
            System.out.println("El archivo en la ruta tiene " + contador + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al contar lienas");
        }
    }
}
