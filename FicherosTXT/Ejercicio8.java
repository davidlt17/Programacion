import java.io.*;

public class Ejercicio8 {
    public void buscarPalabra(String ruta,String palabra) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String p : palabras) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
            System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces ");
        } catch (IOException e) {
            System.out.println("No se puede buscar");
        }
    }
}
