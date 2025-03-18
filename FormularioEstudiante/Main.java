import FormularioEstudiante.FormularioEstudiante;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Aplicar estilos con UIManager
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Ha habido un error");;
        }

        // Crear y mostrar la ventana
        new FormularioEstudiante().setVisible(true);
    }
}