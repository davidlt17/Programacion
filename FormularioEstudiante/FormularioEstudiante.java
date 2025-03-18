package FormularioEstudiante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioEstudiante extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;
    private JButton btnGuardar;

    public FormularioEstudiante() {
        setTitle("Formulario de Estudiante");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(4, 2, 10, 10));

        // Crear los campos de texto y etiquetas
        panelPrincipal.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelPrincipal.add(txtNombre);

        panelPrincipal.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelPrincipal.add(txtEdad);

        panelPrincipal.add(new JLabel("Curso:"));
        txtCurso = new JTextField();
        panelPrincipal.add(txtCurso);

        // Crear el botón de guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarEstudiante();
            }
        });
        panelPrincipal.add(btnGuardar);

        // Añadir el panel principal al JFrame
        add(panelPrincipal);
    }

    private void guardarEstudiante() {
        String nombre = txtNombre.getText().trim();
        String edad = txtEdad.getText().trim();
        String curso = txtCurso.getText().trim();

        if (!nombre.isEmpty() && !edad.isEmpty() && !curso.isEmpty()) {
            String mensaje = "Estudiante registrado:\n" +
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + "\n" +
                    "Curso: " + curso;
            JOptionPane.showMessageDialog(this, mensaje, "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}