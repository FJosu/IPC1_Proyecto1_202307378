/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

/**
 *
 * @author fjosu
 */
public class Doctors_Module extends JFrame implements ActionListener {
    JButton btn_salir, editprofile, btn19;
    private JComboBox<String> hourcombo;

    public Doctors_Module() {
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        // Crear un objeto JTabbedPane para gestionar pestañas

        // Crear tres panales para las pestañas
        JPanel pest1 = new JPanel(null); // Se coloca null para tener control en la posicion de los elemntos en la
                                         // pestaña
        pest1.setBackground(new Color(217, 234, 253));
        JPanel pest2 = new JPanel(null);
        pest2.setBackground(new Color(217, 234, 253));

        // Agregar los paneles a las pestañas del JTabbedPane
        tabbedPane.addTab("Citas", pest1);
        tabbedPane.addTab("Asignar Horario", pest2);

        // ==============================Botones Fijos==================================
        JLabel lbl4 = new JLabel("Listado Doctores");
        btn_salir = new JButton("Cerrar Sesión");
        btn_salir.setBounds(750, 50, 120, 40);
        btn_salir.setVisible(true);
        btn_salir.setEnabled(true);
        btn_salir.setBackground(new Color(97, 145, 199));
        btn_salir.setForeground(Color.white);
        btn_salir.addActionListener(this);
        this.add(btn_salir);
        editprofile = new JButton("Editar Perfil");
        editprofile.setBounds(600, 50, 120, 40);
        editprofile.setVisible(true);
        editprofile.setBackground(new Color(97, 145, 199));
        editprofile.setForeground(Color.white);
        editprofile.addActionListener(this);
        this.add(editprofile);
        // ===========================Pestaña Doctores============================00
        JLabel Title = new JLabel("");
        // Estable_estudiantecer la posición y el tamaño del JLabel en el JPanel
        Title.setBounds(25, 25, 800, 50);
        // Estable_estudiantecer un borde alrededor del JLabel con un grosor de 2
        // píxeles y color negro
        // lbl4.setBorder(BorderFactory.createLineBorder(new Color (118, 165, 217), 2));
        // Estable_estudiantecer el color de fondo del JLabel como celeste
        Title.setBackground(new Color(217, 234, 253));
        Title.setForeground(new Color(12, 58, 109));
        // Hacer que el JLabel sea opaco para que se pueda ver el color de fondo
        Title.setOpaque(true);
        // Alinear vertical y horizontalmente el texto del JLabel al centro
        Title.setVerticalAlignment(SwingConstants.CENTER);
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        // Estable_estudiantecer el tamaño de la fuente del JLabel, negrita y tamaño 24
        Title.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 24));
        // Hacer que el JLabel sea visible
        Title.setVisible(true);

        // Agregar el JLabel al JPanel llamado pest1
        pest1.add(Title);
        // ===================================================================================================
        JButton btn1 = new JButton("Ver más");
        btn1.setBounds(400, 130, 120, 50);
        btn1.setVisible(true);
        btn1.setBackground(new Color(97, 145, 199));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        pest1.add(btn1);

        JButton btn2 = new JButton("Atender");
        btn2.setBounds(550, 130, 120, 50);
        btn2.setVisible(true);
        btn2.setBackground(new Color(82, 222, 67));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        pest1.add(btn2);
        JButton btn3 = new JButton("Rechazar");
        btn3.setBounds(700, 130, 120, 50);
        btn3.setVisible(true);
        btn3.setBackground(new Color(255, 0, 0));
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        pest1.add(btn3);
        // ========================================================================================================
        JButton btn4 = new JButton("Ver más");
        btn4.setBounds(400, 230, 120, 50);
        btn4.setVisible(true);
        btn4.setBackground(new Color(97, 145, 199));
        btn4.setForeground(Color.white);
        btn4.addActionListener(this);
        pest1.add(btn4);

        JButton btn5 = new JButton("Atender");
        btn5.setBounds(550, 230, 120, 50);
        btn5.setVisible(true);
        btn5.setBackground(new Color(82, 222, 67));
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        pest1.add(btn5);

        JButton btn6 = new JButton("Rechazar");
        btn6.setBounds(700, 230, 120, 50);
        btn6.setVisible(true);
        btn6.setBackground(new Color(255, 0, 0));
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        pest1.add(btn6);
        // ========================================================================================================
        JButton btn7 = new JButton("Ver más");
        btn7.setBounds(400, 330, 120, 50);
        btn7.setVisible(true);
        btn7.setBackground(new Color(97, 145, 199));
        btn7.setForeground(Color.white);
        btn7.addActionListener(this);
        pest1.add(btn7);

        JButton btn8 = new JButton("Atender");
        btn8.setBounds(550, 330, 120, 50);
        btn8.setVisible(true);
        btn8.setBackground(new Color(82, 222, 67));
        btn8.setForeground(Color.white);
        btn8.addActionListener(this);
        pest1.add(btn8);

        JButton btn9 = new JButton("Rechazar");
        btn9.setBounds(700, 330, 120, 50);
        btn9.setVisible(true);
        btn9.setBackground(new Color(255, 0, 0));
        btn9.setForeground(Color.white);
        btn9.addActionListener(this);
        pest1.add(btn9);
        // ========================================================================================================
        JButton btn10 = new JButton("Ver más");
        btn10.setBounds(400, 430, 120, 50);
        btn10.setVisible(true);
        btn10.setBackground(new Color(97, 145, 199));
        btn10.setForeground(Color.white);
        btn10.addActionListener(this);
        pest1.add(btn10);

        JButton btn11 = new JButton("Atender");
        btn11.setBounds(550, 430, 120, 50);
        btn11.setVisible(true);
        btn11.setBackground(new Color(82, 222, 67));
        btn11.setForeground(Color.white);
        btn11.addActionListener(this);
        pest1.add(btn11);

        JButton btn12 = new JButton("Rechazar");
        btn12.setBounds(700, 430, 120, 50);
        btn12.setVisible(true);
        btn12.setBackground(new Color(255, 0, 0));
        btn12.setForeground(Color.white);
        btn12.addActionListener(this);
        pest1.add(btn12);
        // ========================================================================================================
        JButton btn13 = new JButton("Ver más");
        btn13.setBounds(400, 530, 120, 50);
        btn13.setVisible(true);
        btn13.setBackground(new Color(97, 145, 199));
        btn13.setForeground(Color.white);
        btn13.addActionListener(this);
        pest1.add(btn13);

        JButton btn14 = new JButton("Atender");
        btn14.setBounds(550, 530, 120, 50);
        btn14.setVisible(true);
        btn14.setBackground(new Color(82, 222, 67));
        btn14.setForeground(Color.white);
        btn14.addActionListener(this);
        pest1.add(btn14);

        JButton btn15 = new JButton("Rechazar");
        btn15.setBounds(700, 530, 120, 50);
        btn15.setVisible(true);
        btn15.setBackground(new Color(255, 0, 0));
        btn15.setForeground(Color.white);
        btn15.addActionListener(this);
        pest1.add(btn15);
        // ========================================================================================================
        JButton btn16 = new JButton("Ver más");
        btn16.setBounds(400, 630, 120, 50);
        btn16.setVisible(true);
        btn16.setBackground(new Color(97, 145, 199));
        btn16.setForeground(Color.white);
        btn16.addActionListener(this);
        pest1.add(btn16);
        JButton btn17 = new JButton("Atender");
        btn17.setBounds(550, 630, 120, 50);
        btn17.setVisible(true);
        btn17.setBackground(new Color(82, 222, 67));
        btn17.setForeground(Color.white);
        btn17.addActionListener(this);
        pest1.add(btn17);

        JButton btn18 = new JButton("Rechazar");
        btn18.setBounds(700, 630, 120, 50);
        btn18.setVisible(true);
        btn18.setBackground(new Color(255, 0, 0));
        btn18.setForeground(Color.white);
        btn18.addActionListener(this);
        pest1.add(btn18);
        // ========================================================================================================

        // ========================================================================================================

        Panel panel1 = new Panel();
        panel1.setBounds(50, 120, 800, 70);
        panel1.setBackground(new Color(202, 222, 246));
        pest1.add(panel1);

        Panel panel2 = new Panel();
        panel2.setBounds(50, 220, 800, 70);
        panel2.setBackground(new Color(202, 222, 246));
        pest1.add(panel2);

        Panel panel3 = new Panel();
        panel3.setBounds(50, 320, 800, 70);
        panel3.setBackground(new Color(202, 222, 246));
        pest1.add(panel3);

        Panel panel4 = new Panel();
        panel4.setBounds(50, 420, 800, 70);
        panel4.setBackground(new Color(202, 222, 246));
        pest1.add(panel4);

        Panel panel5 = new Panel();
        panel5.setBounds(50, 520, 800, 70);
        panel5.setBackground(new Color(202, 222, 246));
        pest1.add(panel5);

        Panel panel6 = new Panel();
        panel6.setBounds(50, 620, 800, 70);
        panel6.setBackground(new Color(202, 222, 246));
        pest1.add(panel6);

        // ===========================Pestaña 2============================
        // Titulo
        // Crear un nuevo JLabel con el texto "Listado Oficial"
        JLabel date2 = new JLabel("Asignar Citas ");
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
        String[] columnshora = { "No.", "Hora" };
        // Crear una instancia de JTable con los datos y nombres de columna
        JTable table_paciente = new JTable(TimeData.convertirDatosTime_tabla(), columnshora);
        table_paciente.setBackground(new Color(217, 234, 253));

        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es
        // necesario)
        JScrollPane scrollPanel = new JScrollPane(table_paciente);

        scrollPanel.setBounds(25, 150, 500, 400);

        pest2.add(scrollPanel);

        JLabel hours = new JLabel("Hora: ");
        hours.setBounds(575, 300, 100, 30);
        hours.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 20));
        hours.setForeground(new Color(12, 58, 109));
        hours.setVisible(true);
        pest2.add(hours);

        String[] hour2 = { "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00",
                "17:00", "18:00", "19:00", "20:00", "21:00" };
        hourcombo = new JComboBox<>(hour2);
        hourcombo.setBounds(650, 300, 150, 30);
        hourcombo.setBackground(new Color(202, 222, 246));
        pest2.add(hourcombo);
        
        btn19 = new JButton("Asignar");
        btn19.setBounds(650, 350, 120, 50);
        btn19.setVisible(true);
        btn19.setBackground(new Color(82, 222, 67));
        btn19.setForeground(Color.white);
        btn19.addActionListener(this);
        pest2.add(btn19);
        // =================================================================

        // Agregar el JTabbedPane al contenido del JFrame
        getContentPane().add(tabbedPane);

        // ------------Creando JFrame------------------
        this.setBounds(325, 50, 900, 750); // Hacer que la ventana se abra maximizada
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        this.setResizable(false); // Deshabilitar la capacidad de cambiar el tamaño de la ventana
        this.setVisible(true); // Hacer la ventana visible
        this.setBackground(new Color(131, 193, 255));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_salir) {
            Login vtn_login = new Login();

            this.dispose();
        } else if (e.getSource() == btn19) {
            String hour = (String) hourcombo.getSelectedItem();

            TimeData.agregarTime(TimeData.contador,hour);
            TimeData.contador++;

            this.dispose();

            Doctors_Module doctors = new Doctors_Module();
        }else if (e.getSource() == editprofile) {
            DoctorProfileEdit doctorprofile = new DoctorProfileEdit();

            this.dispose();
        }

    }
}
