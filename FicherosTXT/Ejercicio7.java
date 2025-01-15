import java.io.*;

public class Ejercicio7 {
    public void concatenarArchivos(String ruta1, String ruta2 ,String ruta3) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
             BufferedReader br2 = new BufferedReader(new FileReader(ruta2));
             BufferedWriter wr = new BufferedWriter(new FileWriter(ruta3))) {

            String linea;
            while ((linea = br1.readLine()) != null) {
                wr.write(linea);
                wr.newLine();
            }
            while ((linea = br2.readLine()) != null) {
                wr.write(linea);
                wr.newLine();
            }
            System.out.println("El texto ha sido concatenado.");
        } catch (IOException e) {
            System.out.println("Error al concatenar.");
        }
    }
}