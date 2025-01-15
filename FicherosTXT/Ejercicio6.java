import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
    public void sobrescribirArchivo(String ruta, String texto) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(ruta))) { //False(Sobreescribir por defecto)
            wr.write(texto);
            wr.newLine();
            System.out.println("Texto Sobreescrito.");
        } catch (IOException e) {
            System.out.println("No se ha podido sobreescribir.");
        }
    }
}
