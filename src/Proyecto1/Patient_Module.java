/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

/**
 *
 * @author fjosu
 */
public class Patient_Module extends JFrame implements ActionListener {
    JButton btn_salir, editprofile, showdoctors, showdates, createdate;
    private JComboBox<String> doctorcombo;
    private JComboBox<String> specialtycombo;
    private JComboBox<String> datecombo;
    private JComboBox<String> hourcombo;
    private JTextField description;
    public static Patient patient;

    public Patient_Module(Patient patient) {
        this.patient = patient;

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        // Crear un objeto JTabbedPane para gestionar pestañas

        // Crear tres panales para las pestañas
        JPanel pest1 = new JPanel(null); // Se coloca null para tener control en la posicion de los elemntos en la
                                         // pestaña
        pest1.setBackground(new Color(217, 234, 253));
        JPanel pest2 = new JPanel(null);
        pest2.setBackground(new Color(217, 234, 253));
        JPanel pest3 = new JPanel(null);
        pest3.setBackground(new Color(217, 234, 253));

        // Agregar los paneles a las pestañas del JTabbedPane
        tabbedPane.addTab("Solicitar Cita", pest1);
        tabbedPane.addTab("Ver estado de cita", pest2);
        tabbedPane.addTab("Farmacia", pest3);

        // ===========================Pestaña Doctores============================00
        btn_salir = new JButton("Cerrar Sesión");
        btn_salir.setBounds(750, 50, 120, 40);
        btn_salir.setVisible(true);
        btn_salir.setEnabled(true);
        btn_salir.setBackground(new Color(97, 145, 199));
        btn_salir.setForeground(Color.white);
        btn_salir.addActionListener(this);
        this.add(btn_salir);

        // Salir
        editprofile = new JButton("Editar Perfil");
        editprofile.setBounds(600, 50, 120, 40);
        editprofile.setVisible(true);
        editprofile.setBackground(new Color(97, 145, 199));
        editprofile.setForeground(Color.white);
        editprofile.addActionListener(this);
        this.add(editprofile);

        JLabel reason = new JLabel("Motivo de Cita: ");
        reason.setBounds(70, 20, 300, 50);
        reason.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 30));
        reason.setForeground(new Color(12, 58, 109));
        reason.setVisible(true);
        pest1.add(reason);

        description = new JTextField();
        description.setBounds(70, 90, 600, 90);
        description.setBackground(new Color(202, 222, 246));
        pest1.add(description);

        JLabel specialty = new JLabel("Especialidad: ");
        specialty.setBounds(100, 200, 170, 30);
        specialty.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 24));
        specialty.setForeground(new Color(12, 58, 109));
        specialty.setVisible(true);
        pest1.add(specialty);
        String[] specialty2 = { "Cardiología", "Dermatología", "Gatroenterología", "Genecología", "Neumología",
                "Neurología", "Pediatría", "Psicología", "Traumatología" };
        specialtycombo = new JComboBox<>(specialty2);
        specialtycombo.setBounds(280, 200, 150, 30);
        specialtycombo.setBackground(new Color(202, 222, 246));
        pest1.add(specialtycombo);

        showdoctors = new JButton("Mostrar Doctores");
        showdoctors.setBounds(450, 200, 150, 30);
        showdoctors.setForeground(Color.WHITE);
        showdoctors.setBackground(new Color(97, 145, 199));
        showdoctors.addActionListener(this);
        pest1.add(showdoctors);

        JLabel Doctor = new JLabel("Doctor: ");
        Doctor.setBounds(100, 250, 200, 30);
        Doctor.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 24));
        Doctor.setForeground(new Color(12, 58, 109));
        Doctor.setVisible(true);
        pest1.add(Doctor);

        String[] doctors2 = { "" };
        doctorcombo = new JComboBox<>(doctors2);
        doctorcombo.setBounds(280, 250, 150, 30);
        doctorcombo.setBackground(new Color(202, 222, 246));
        pest1.add(doctorcombo);

        showdates = new JButton("Mostrar Fechas");
        showdates.setBounds(450, 250, 150, 30);
        showdates.setForeground(Color.WHITE);
        showdates.setBackground(new Color(97, 145, 199));
        showdates.addActionListener(this);
        pest1.add(showdates);

        JLabel line = new JLabel("__________________________________________________");
        line.setBounds(0, 300, 900, 30);
        line.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 30));
        line.setForeground(new Color(12, 58, 109));
        line.setVisible(true);
        pest1.add(line);

        JLabel dates = new JLabel("Horarios de citas Dispobibles:");
        dates.setBounds(100, 330, 500, 50);
        dates.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 30));
        dates.setForeground(new Color(12, 58, 109));
        dates.setVisible(true);
        pest1.add(dates);

        JLabel date = new JLabel("Fecha: ");
        date.setBounds(110, 380, 100, 30);
        date.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 20));
        date.setForeground(new Color(12, 58, 109));
        date.setVisible(true);
        pest1.add(date);

        String[] dates2 = { "M", "F" };
        datecombo = new JComboBox<>(dates2);
        datecombo.setBounds(190, 380, 150, 30);
        datecombo.setBackground(new Color(202, 222, 246));
        pest1.add(datecombo);

        JLabel hours = new JLabel("Hora: ");
        hours.setBounds(350, 380, 200, 30);
        hours.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 20));
        hours.setForeground(new Color(12, 58, 109));
        hours.setVisible(true);
        pest1.add(hours);

        String[] hour2 = { "M", "F" };
        hourcombo = new JComboBox<>(hour2);
        hourcombo.setBounds(420, 380, 150, 30);
        hourcombo.setBackground(new Color(202, 222, 246));
        pest1.add(hourcombo);

        createdate = new JButton("Crear Cita");
        createdate.setBounds(600, 450, 150, 30);
        createdate.setForeground(Color.WHITE);
        createdate.setBackground(new Color(97, 145, 199));
        createdate.addActionListener(this);
        pest1.add(createdate);

        // ===========================Pestaña 2============================
        // Titulo
        // Crear un nuevo JLabel con el texto "Listado Oficial"
        JLabel date2 = new JLabel("Listado de citas");
        // Estable_estudiantecer la posición y el tamaño del JLabel en el JPanel
        date2.setBounds(25, 25, 750, 50);
        // Estable_estudiantecer un borde alrededor del JLabel con un grosor de 2
        // píxeles y color negro
        // paciente.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        // Estable_estudiantecer el color de fondo del JLabel como GRIS CLARO
        date2.setBackground(new Color(217, 234, 253));
        date2.setForeground(new Color(12, 58, 109));
        // Hacer que el JLabel sea opaco para que se pueda ver el color de fondo
        date2.setOpaque(true);
        // Alinear vertical y horizontalmente el texto del JLabel al centro
        date2.setVerticalAlignment(SwingConstants.CENTER);
        date2.setHorizontalAlignment(SwingConstants.CENTER);
        // Estable_estudiantecer el tamaño de la fuente del JLabel, negrita y tamaño 24
        date2.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 24));
        // Hacer que el JLabel sea visible
        date2.setVisible(true);

        // Agregar el JLabel al JPanel llamado pest1
        pest2.add(date2);

        // Tabla
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnspaciente = { "Código", "Descripcion", "Especialidad", "Doctor", "Fecha", "Hora" };
        // Crear una instancia de JTable con los datos y nombres de columna
        JTable table_paciente = new JTable(DateData.convertirDatosDate_tabla(), columnspaciente);
        table_paciente.setBackground(new Color(217, 234, 253));

        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es
        // necesario)
        JScrollPane scrollPanel = new JScrollPane(table_paciente);

        scrollPanel.setBounds(25, 80, 750, 570);

        pest2.add(scrollPanel);

        // ===========================Pestaña 3============================
        JLabel productos = new JLabel("Listado de Producttos");
        // Estable_estudiantecer la posición y el tamaño del JLabel en el JPanel
        productos.setBounds(25, 25, 750, 50);
        // Estable_estudiantecer un borde alrededor del JLabel con un grosor de 2
        // píxeles y color negro

        // Estable_estudiantecer el color de fondo del JLabel como GRIS CLARO
        productos.setBackground(new Color(217, 234, 253));
        // Hacer que el JLabel sea opaco para que se pueda ver el color de fondo
        productos.setOpaque(true);
        // Alinear vertical y horizontalmente el texto del JLabel al centro
        productos.setVerticalAlignment(SwingConstants.CENTER);
        productos.setHorizontalAlignment(SwingConstants.CENTER);
        // Estable_estudiantecer el tamaño de la fuente del JLabel, negrita y tamaño 24
        productos.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 24));
        productos.setForeground(new Color(12, 58, 109));
        // Hacer que el JLabel sea visible
        productos.setVisible(true);

        // Agregar el JLabel al JPanel llamado pest1
        pest3.add(productos);

        // Tabla
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnsproducto = { "Códgio", "Nombre", "Cantidad", "Descripción", "Precio" };
        // Crear una instancia de JTable con los datos y nombres de columna
        JTable table_producto = new JTable(ProductData.convertirDatosProducto_tabla(), columnsproducto);
        table_producto.setBackground(new Color(131, 193, 255));

        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es
        // necesario)
        JScrollPane scrollPanel2 = new JScrollPane(table_producto);

        scrollPanel2.setBounds(25, 80, 750, 570);

        pest3.add(scrollPanel2);

        // =================================================================

        // Agregar el JTabbedPane al contenido del JFrame
        getContentPane().add(tabbedPane);

        // ------------Creando JFrame------------------
        this.setBounds(325, 50, 900, 600); // Hacer que la ventana se abra maximizada
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        this.setResizable(false); // Deshabilitar la capacidad de cambiar el tamaño de la ventana
        this.setVisible(true); // Hacer la ventana visible
        this.setBackground(new Color(131, 193, 255));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_salir) {
            Login vtn_login = new Login();
            this.dispose();
        } else if (e.getSource() == createdate) {
            String descripcion = description.getText();
            String selectspecialty = (String) specialtycombo.getSelectedItem();
            String selectdoctor = (String) doctorcombo.getSelectedItem();
            String selectdate = (String) datecombo.getSelectedItem();

            String selecthour = (String) hourcombo.getSelectedItem();

            DateData.agregarDate(DoctorsData.contador, descripcion, selectspecialty, selectdoctor, selectdate,
                    selecthour);
            DateData.contador++;

            this.dispose();

            Patient_Module patientModule = new Patient_Module(Patient_Module.patient);

        }

        showdoctors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la especialidad seleccionada por el usuario
                String selectedSpecialty = (String) specialtycombo.getSelectedItem();

                // Limpiar el ComboBox de doctores antes de agregar nuevas especialidades
                doctorcombo.removeAllItems();

                // Iterar sobre la lista de doctores y agregar aquellos que coincidan con la
                // especialidad seleccionada
                for (Doctors doctor : DoctorsData.DoctorList) {
                    if (doctor.getEspecialidad().equals(selectedSpecialty)) {
                        doctorcombo.addItem(doctor.getNombre()); // Ajusta esto según cómo quieras mostrar el nombre del
                                                                 // doctor
                    }
                }
            }
        });
    }
}
