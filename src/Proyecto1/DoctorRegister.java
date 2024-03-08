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

public class DoctorRegister extends JFrame implements ActionListener {

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField PasswordField;
    private JTextField PhoneField;
    private JTextField AgeField;
    private JComboBox<String> genderComboBox;
    private JComboBox<String> specialty;
    private JTable table_doctores; // Declarar la variable table_doctores


    JButton registerButton;

    public DoctorRegister() {

        JLabel titleLabel = new JLabel("Registro de Doctor");
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
        // Especialidad
        JLabel especialtyLabel = new JLabel("Especialidad:");
        especialtyLabel.setBounds(70, 130, 90, 25);
        especialtyLabel.setBackground(new Color(217, 234, 253));
        especialtyLabel.setOpaque(true);
        this.add(especialtyLabel);

        String[] Specialty = { "Cardiología", "Dermatología", "Gatroenterología", "Ginecología", "Neumología",
                "Neurología","Oftamología", "Pediatría", "Psicología", "Traumatología" };
        specialty = new JComboBox<>(Specialty);
        specialty.setBounds(180, 130, 210, 25);
        specialty.setBackground(new Color(202, 222, 246));
        this.add(specialty);

        // Contraseña
        JLabel passwordlabel = new JLabel("Contraseña:");
        passwordlabel.setBounds(70, 170, 90, 25);
        passwordlabel.setBackground(new Color(217, 234, 253));
        passwordlabel.setOpaque(true);
        this.add(passwordlabel);

        PasswordField = new JTextField();
        PasswordField.setBounds(150, 170, 240, 25);
        PasswordField.setBackground(new Color(202, 222, 246));
        this.add(PasswordField);
        // Teléfono
        JLabel phonelabel = new JLabel("Teléfono:");
        phonelabel.setBounds(70, 210, 60, 25);
        phonelabel.setBackground(new Color(217, 234, 253));
        phonelabel.setOpaque(true);
        this.add(phonelabel);

        PhoneField = new JTextField();
        PhoneField.setBounds(130, 210, 260, 25);
        PhoneField.setBackground(new Color(202, 222, 246));
        this.add(PhoneField);
        // Edad
        JLabel agelabel = new JLabel("Edad:");
        agelabel.setBounds(70, 250, 60, 25);
        agelabel.setBackground(new Color(217, 234, 253));
        agelabel.setOpaque(true);
        this.add(agelabel);

        AgeField = new JTextField();
        AgeField.setBounds(130, 250, 260, 25);
        AgeField.setBackground(new Color(202, 222, 246));
        this.add(AgeField);
        // Género
        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(70, 290, 60, 25);
        genderLabel.setBackground(new Color(217, 234, 253));
        genderLabel.setOpaque(true);
        this.add(genderLabel);

        String[] genders = { "M", "F" };
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(130, 290, 150, 25);
        genderComboBox.setBackground(new Color(202, 222, 246));
        this.add(genderComboBox);

        registerButton = new JButton("Registrarse");
        registerButton.setBounds(180, 350, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(97, 145, 199));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Registro Doctores");
        this.setBounds(650, 400, 500, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Panel fondo = new Panel();
        fondo.setBounds(0, 0, 500, 500);
        fondo.setBackground(new Color(217, 234, 253));
        this.add(fondo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String selectspecialty = (String) specialty.getSelectedItem();
            String password = PasswordField.getText();
            String phone = PhoneField.getText();
            String age = AgeField.getText();

            String selectedGender = (String) genderComboBox.getSelectedItem();

            DoctorsData.agregarDoctores(DoctorsData.contador, firstName, lastName, selectspecialty, password, phone,
                    age, selectedGender);
            DoctorsData.contador++;

            this.dispose();
            JOptionPane.showMessageDialog(this, "Doctor registrado exitosamente", "Confirmación de Registro", 1);
            this.dispose();
                 Administrador vtn_admin = new Administrador();
        }
    }

}
