import java.io.*;

public class MostrarComponentes {
    public void mostrarComponentes(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] componentes = linea.split(",");
                for (String componente : componentes) {
                    System.out.println(componente);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV.");
        }
    }
}
