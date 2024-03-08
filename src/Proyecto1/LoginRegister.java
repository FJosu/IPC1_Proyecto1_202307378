/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;

/**
 *
 * @author fjosu
 */
public class LoginRegister extends JFrame implements ActionListener {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField PasswordField;
    private JTextField AgeField;
    private JComboBox<String> genderComboBox;
    JButton registerButton;

    public LoginRegister() {
        JLabel titleLabel = new JLabel("Registro de Paciente");
        titleLabel.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 20));
        titleLabel.setBounds(150, 10, 200, 30);
        titleLabel.setBackground(new Color(217, 234, 253));
        titleLabel.setOpaque(true);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(titleLabel);
        // Nombre

        JLabel firstNameLabel = new JLabel("Nombres:");
        firstNameLabel.setBounds(70, 50, 60, 25);
        firstNameLabel.setBackground(new Color(217, 234, 253));
        firstNameLabel.setOpaque(true);
        this.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(130, 50, 260, 25);
        firstNameField.setBackground(new Color(202, 222, 246));
        this.add(firstNameField);
        // Apellidos

        JLabel lastNameLabel = new JLabel("Apellidos:");
        lastNameLabel.setBounds(70, 90, 60, 25);
        lastNameLabel.setBackground(new Color(217, 234, 253));
        lastNameLabel.setOpaque(true);
        this.add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setBounds(130, 90, 260, 25);
        lastNameField.setBackground(new Color(202, 222, 246));
        this.add(lastNameField);

        JLabel passwordlabel = new JLabel("Contraseña:");
        passwordlabel.setBounds(70, 130, 80, 25);
        passwordlabel.setBackground(new Color(217, 234, 253));
        passwordlabel.setOpaque(true);
        this.add(passwordlabel);

        PasswordField = new JTextField();
        PasswordField.setBounds(150, 130, 240, 25);
        PasswordField.setBackground(new Color(202, 222, 246));
        this.add(PasswordField);
        // Teléfono

        JLabel agelabel = new JLabel("Edad:");
        agelabel.setBounds(70, 170, 60, 25);
        agelabel.setBackground(new Color(217, 234, 253));
        agelabel.setOpaque(true);
        this.add(agelabel);

        AgeField = new JTextField();
        AgeField.setBounds(130, 170, 260, 25);
        AgeField.setBackground(new Color(202, 222, 246));
        this.add(AgeField);
        // Género
        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(70, 210, 60, 25);
        genderLabel.setBackground(new Color(217, 234, 253));
        genderLabel.setOpaque(true);
        this.add(genderLabel);

        String[] genders = { "M", "F" };
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(130, 210, 150, 25);
        genderComboBox.setBackground(new Color(202, 222, 246));
        this.add(genderComboBox);

        registerButton = new JButton("Registrarse");
        registerButton.setBounds(180, 250, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(97, 145, 199));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Registro");
        this.setBounds(650, 400, 500, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Panel fondo = new Panel();
        fondo.setBounds(0, 0, 500, 350);
        fondo.setBackground(new Color(217, 234, 253));
        this.add(fondo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String password = PasswordField.getText();
            String age = AgeField.getText();

            String selectedGender = (String) genderComboBox.getSelectedItem();

            PatientData.agregarPaciente(PatientData.contador, firstName, lastName, password, age, selectedGender);
            PatientData.contador++;
            this.dispose();
            String siguienteCodigo = PatientData.obtenerSiguienteCodigo();

            JOptionPane.showMessageDialog(this, "su código es: " + siguienteCodigo, "Su código", 1);
            this.dispose();
            Login login = new Login();

        }
    }

}
