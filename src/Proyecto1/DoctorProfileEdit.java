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

public class DoctorProfileEdit extends JFrame implements ActionListener {

    private JTextField Nametext;
    private JTextField Lastnametext;
    private JTextField Passwordtext;
    private JTextField txtSpecialty;
    private JComboBox<String> Specialty;
    private JTextField phonetext;
    private JTextField codetext;
    private JTextField agetext;
    private JButton btnConfirmEditDoctor, search;

    public static void DoctorProfileEdit(int codigo, String nombre, String apellido, String especialidad, String contraseña,
            String telefono, String edad, String genero) {
        DoctorsData.updateDoctor(new Doctors(codigo, nombre, apellido, especialidad, contraseña, telefono,
                String.valueOf(edad), genero));
    }

    Doctors doctor;

    public DoctorProfileEdit() {

        JLabel title = new JLabel("Ingrese su código ");
        title.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 14));
        title.setBounds(45, -5, 300, 100);
        title.setForeground(Color.BLACK);
        this.add(title);

        JLabel code = new JLabel("Código:");
        code.setBounds(29, 100, 200, 25);
        this.add(code);

        codetext = new JTextField();
        codetext.setBounds(90, 100, 200, 25);
        this.add(codetext);

        // Botón para Buscar producto por SKU
        search = new JButton("Buscar");
        search.setBounds(95, 150, 150, 25);
        search.setForeground(Color.WHITE); // color de la letra del boton
        search.setBackground(new Color(97, 145, 199)); // color de fondo del boton
        search.addActionListener(this); // se agrega el ActionListener al botón
        this.add(search);

        // Campos de edición
        JLabel editprofile = new JLabel("Ingresa los cambios");
        editprofile.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 13));
        editprofile.setBounds(90, 210, 300, 100);
        editprofile.setForeground(Color.BLACK);
        this.add(editprofile);

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

        JLabel specialty2 = new JLabel("Especialidad:");
        specialty2.setBounds(10, 370, 200, 25);
        this.add(specialty2);

        String[] specialty = { "Cardiología", "Dermatología", "Gatroenterología", "Ginecología", "Neumología",
                "Neurología", "Oftamología", "Pediatría", "Psicología", "Traumatología" };
        Specialty = new JComboBox<>(specialty);
        Specialty.setBounds(90, 370, 200, 25);
        Specialty.setBackground(new Color(202, 222, 246));
        this.add(Specialty);

        JLabel Password = new JLabel("Contraseña:");
        Password.setBounds(10, 405, 200, 25);
        this.add(Password);

        Passwordtext = new JTextField();
        Passwordtext.setBounds(90, 405, 200, 25);
        this.add(Passwordtext);

        JLabel phone = new JLabel("Telefóno:");
        phone.setBounds(10, 440, 200, 25);
        this.add(phone);

        phonetext = new JTextField();
        phonetext.setBounds(90, 440, 200, 25);
        this.add(phonetext);

        JLabel age = new JLabel("Edad:");
        age.setBounds(10, 475, 200, 25);
        this.add(age);

        agetext = new JTextField();
        agetext.setBounds(90, 475, 200, 25);
        this.add(agetext);

        // Botón para confirmar cambios en el producto
        btnConfirmEditDoctor = new JButton("Confirmar");
        btnConfirmEditDoctor.setBounds(95, 515, 150, 25);
        btnConfirmEditDoctor.setForeground(Color.WHITE); // color de la letra del boton
        btnConfirmEditDoctor.setBackground(new Color(97, 145, 199)); // color de fondo del boton
        btnConfirmEditDoctor.addActionListener(this); // se agrega el ActionListener al botón
        this.add(btnConfirmEditDoctor);

        // Título de la ventana
        this.setTitle("Editar Doctor");
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
            String codigoTemp = codetext.getText();

            try {
                int codigo = Integer.parseInt(codigoTemp);
                doctor = DoctorsData.getDoctor(codigo);

                Nametext.setText(doctor.getNombre());
                Lastnametext.setText(doctor.getApellido());

                Passwordtext.setText(doctor.getContraseña());
                phonetext.setText(doctor.getTelefono());
                agetext.setText(String.valueOf(doctor.getEdad()));

            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una ID válido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnConfirmEditDoctor) {
            String codigoTemp = codetext.getText();
            String nameTemp = Nametext.getText();
            String lastnameTemp = Lastnametext.getText();
            String specialtyTemp = (String) Specialty.getSelectedItem();
            String passwordTemp = Passwordtext.getText();
            String phoneTemp = phonetext.getText();
            String ageTemp = agetext.getText();

            try {
                DoctorsData.updateDoctor(doctor);

                int ageTem = Integer.parseInt(ageTemp);
                int codigo = Integer.parseInt(codigoTemp);

                String ageTemp2 = agetext.getText();

                doctor.setNombre(nameTemp);
                doctor.setApellido(lastnameTemp);
                doctor.setEspecialidad(specialtyTemp);
                doctor.setContraseña(passwordTemp);
                doctor.setTelefono(phoneTemp);
                doctor.setEdad(ageTemp2);

                JOptionPane.showMessageDialog(this, "Doctor editado con éxito!", "Confirmación",
                        JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                Doctors_Module doctorsmodule = new Doctors_Module();
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor válido.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}