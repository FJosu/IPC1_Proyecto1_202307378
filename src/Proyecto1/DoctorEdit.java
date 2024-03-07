/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author fjosu
 */


//Librerias importadas
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorEdit extends JFrame implements ActionListener {

    private JTextField txtName;
    private JTextField txtLastname;
    private JTextField txtPassword;
    private JTextField txtSpecialty;
    private JComboBox<String> Specialty;
    private JTextField txtPhone;
    private JTextField txtId;
    private JTextField txtAge;
    private JButton btnConfirmEditDoctor, btnSearchId;

    public static void DoctorEdit(int codigo, String nombre, String apellido, String especialidad, String contraseña, String telefono, String edad, String genero) {
        DoctorsData.updateDoctor(new Doctors(codigo, nombre, apellido, especialidad, contraseña, telefono, String.valueOf(edad),genero ));
    }

    Doctors doctor;

    public DoctorEdit() {

        JLabel lblTitleEditPr = new JLabel("¿Qué doctor deseas editar?");
        lblTitleEditPr.setFont(new Font("Elephant", Font.BOLD, 14));
        lblTitleEditPr.setBounds(45, -5, 300, 100);
        lblTitleEditPr.setForeground(Color.BLACK);
        this.add(lblTitleEditPr);

        JLabel lblId = new JLabel("Código:");
        lblId.setBounds(29, 100, 200, 25);
        this.add(lblId);

        txtId = new JTextField();
        txtId.setBounds(90, 100, 200, 25);
        this.add(txtId);

        // Botón para Buscar producto por SKU
        btnSearchId = new JButton("Buscar");
        btnSearchId.setBounds(95, 150, 150, 25);
        btnSearchId.setForeground(Color.WHITE); // color de la letra del boton
        btnSearchId.setBackground(new Color(97, 145, 199)); // color de fondo del boton
        btnSearchId.addActionListener(this); // se agrega el ActionListener al botón
        this.add(btnSearchId);

        // Campos de edición
        JLabel lblTitleEditPrFields = new JLabel("Ingresa los cambios");
        lblTitleEditPrFields.setFont(new Font("Elephant", Font.BOLD, 13));
        lblTitleEditPrFields.setBounds(90, 210, 300, 100);
        lblTitleEditPrFields.setForeground(Color.BLACK);
        this.add(lblTitleEditPrFields);

        JLabel lblName = new JLabel("Nombre:");
        lblName.setBounds(10, 300, 200, 25);
        this.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(90, 300, 200, 25);
        this.add(txtName);

        JLabel lblLastname = new JLabel("Apellido:");
        lblLastname.setBounds(10, 335, 200, 25);
        this.add(lblLastname);

        txtLastname = new JTextField();
        txtLastname.setBounds(90, 335, 200, 25);
        this.add(txtLastname);
        
        JLabel lblSpecialty = new JLabel("Especialidad:");
        lblSpecialty.setBounds(10, 370, 200, 25);           
        this.add(lblSpecialty);

        
        String[] specialty = { "Cardiología", "Dermatología", "Gatroenterología", "Ginecología", "Neumología",
                "Neurología","Oftamología", "Pediatría", "Psicología", "Traumatología" };
        Specialty = new JComboBox<>(specialty);
        Specialty.setBounds(90, 370, 200, 25);
        Specialty.setBackground(new Color(202, 222, 246));
        this.add(Specialty);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(10, 405, 200, 25);
        this.add(lblPassword);

        txtPassword = new JTextField();
        txtPassword.setBounds( 90, 405, 200, 25);
        this.add(txtPassword);

        JLabel lblPhone = new JLabel("Telefóno:");
        lblPhone.setBounds(10, 440, 200, 25);
        this.add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(90, 440, 200, 25);
        this.add(txtPhone);


        
        JLabel lblAge = new JLabel("Edad:");
        lblAge.setBounds(10, 475, 200, 25);
        this.add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(90, 475, 200, 25);
        this.add(txtAge);

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
        if (e.getSource() == btnSearchId) {
            String codigoTemp = txtId.getText();

            try {
                int codigo = Integer.parseInt(codigoTemp);
                doctor = DoctorsData.getDoctor(codigo);

                // Llenar los campos de texto con los datos del producto
                txtName.setText(doctor.getNombre());
                txtLastname.setText(doctor.getApellido());
               // txtSpecialty.setText(doctor.getEspecialidad());
                txtPassword.setText(doctor.getContraseña());
                txtPhone.setText(doctor.getTelefono());
                txtAge.setText(String.valueOf(doctor.getEdad()));
                
                
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una ID válido.", "Error",JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnConfirmEditDoctor) {
            String codigoTemp = txtId.getText();
            String nameTemp = txtName.getText();
            String lastnameTemp = txtLastname.getText();
            String specialtyTemp = (String) Specialty.getSelectedItem();
            String passwordTemp = txtPassword.getText();
            String phoneTemp = txtPhone.getText();
            String ageTemp = txtAge.getText();
            
            

            try {
                DoctorsData.updateDoctor(doctor);
               
                int ageTem = Integer.parseInt(ageTemp);
                int codigo = Integer.parseInt(codigoTemp);

               
                String ageTemp2 = txtAge.getText();

                doctor.setNombre(nameTemp);
                doctor.setApellido(lastnameTemp);
                doctor.setEspecialidad(specialtyTemp);
                doctor.setContraseña(passwordTemp);
                doctor.setTelefono(phoneTemp);
                doctor.setEdad(ageTemp2);

                

                JOptionPane.showMessageDialog(this, "Doctor editado con éxito!", "Confirmación",   JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                Administrador adminWindow = new Administrador();
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}