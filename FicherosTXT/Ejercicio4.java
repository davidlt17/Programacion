import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {
    public void agregarDatos(String ruta, String texto) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(ruta, true))) { //Uso true para no sobreescribir el archivo
            wr.write(texto);
            wr.newLine();
            System.out.println("Texto agregado");
        } catch (IOException e) {
            System.out.println("Error al pegar texto.");
        }
    }
}
