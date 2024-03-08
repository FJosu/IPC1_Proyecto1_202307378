/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author fjosu
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PatientProfileEdit extends JFrame implements ActionListener {

    private JTextField Nametext;
    private JTextField Lastnametext;
    private JTextField Passwordtext;
    private JTextField code2;
    private JTextField Agetext;
    private JButton confirm, search;

    public static void PatientProfileEdit(int codigo, String nombre, String apellido, String contraseña, String edad,
            String genero) {

        PatientData.updatePatients(new Patient(codigo, nombre, apellido, contraseña, edad, genero));
    }

    Patient patient;

    public PatientProfileEdit() {

        JLabel lblTitle = new JLabel("Ingrese su código");
        lblTitle.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 14));
        lblTitle.setBounds(45, -5, 300, 100);

        this.add(lblTitle);

        JLabel code = new JLabel("ID:");
        code.setBounds(29, 100, 200, 25);
        this.add(code);

        code2 = new JTextField();
        code2.setBounds(90, 100, 200, 25);
        this.add(code2);

        // Botón para Buscar producto por SKU
        search = new JButton("Buscar");
        search.setBounds(95, 150, 150, 25);
        search.setForeground(Color.WHITE); // color de la letra del boton
        search.setBackground(new Color(97, 145, 199)); // color de fondo del boton
        search.addActionListener(this); // se agrega el ActionListener al botón
        this.add(search);

        // Campos de edición
        JLabel changes = new JLabel("Ingresa los cambios");
        changes.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 13));
        changes.setBounds(90, 210, 300, 100);
        changes.setForeground(Color.BLACK);
        this.add(changes);

        JLabel Name = new JLabel("Nombre:");
        Name.setBounds(10, 300, 200, 25);
        this.add(Name);

        Nametext = new JTextField();
        Nametext.setBounds(90, 300, 200, 25);
        this.add(Nametext);

        JLabel Lastname = new JLabel("Apellido:");
        Lastname.setBounds(10, 335, 200, 25);
        this.add(Lastname);

        Lastnametext = new JTextField();
        Lastnametext.setBounds(90, 335, 200, 25);
        this.add(Lastnametext);

        JLabel Password = new JLabel("Contraseña:");
        Password.setBounds(10, 370, 200, 25);
        this.add(Password);

        Passwordtext = new JTextField();
        Passwordtext.setBounds(90, 370, 200, 25);
        this.add(Passwordtext);

        JLabel Age = new JLabel("Edad:");
        Age.setBounds(10, 405, 200, 25);
        this.add(Age);

        Agetext = new JTextField();
        Agetext.setBounds(90, 405, 200, 25);
        this.add(Agetext);

        // Botón para confirmar cambios en el producto
        confirm = new JButton("Confirmar");
        confirm.setBounds(95, 460, 150, 25);
        confirm.setForeground(Color.WHITE); // color de la letra del boton
        confirm.setBackground(new Color(97, 145, 199)); // color de fondo del boton
        confirm.addActionListener(this); // se agrega el ActionListener al botón
        this.add(confirm);

        // Título de la ventana
        this.setTitle("Editar Paciente");
        // Tamaño de la ventana
        this.setSize(350, 600);
        // No permitir modificar el tamaño de la ventana
        setResizable(false);
        // Cerrar la aplicación al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Ubicar la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        // Color de la ventana
        getContentPane().setBackground(new Color(217, 234, 253));
        // Para permitir componentes en la ventana y su posición
        this.setLayout(null);
        // Hacer visible la ventana
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            String codigoTemp = code2.getText();

            try {
                int codigo = Integer.parseInt(codigoTemp);
                patient = PatientData.getPatient(codigo);

                // Llenar los campos de texto con los datos del producto
                Nametext.setText(patient.getNombre());
                Lastnametext.setText(patient.getApellido());
                Passwordtext.setText(patient.getContraseña());
                Agetext.setText(String.valueOf(patient.getEdad()));
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una ID válido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == confirm) {
            String nameTemp = Nametext.getText();
            String lastnameTemp = Lastnametext.getText();
            String passwordTemp = Passwordtext.getText();
            String ageTemp = Agetext.getText();
            String codigoTemp = code2.getText();

            try {
                // Conversión de stock y price de String a int
                // int age = Integer.parseInt(ageTemp);
                int codigo = Integer.parseInt(codigoTemp);

                // Actualizar el producto con los nuevos datos
                patient.setNombre(nameTemp);
                patient.setApellido(lastnameTemp);
                patient.setContraseña(passwordTemp);
                patient.setEdad(ageTemp);

                PatientData.getPatient(codigo);

                JOptionPane.showMessageDialog(this, "Paciente editado con éxito!", "Confirmación",
                        JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                Patient_Module admin = new Patient_Module();
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor válido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
