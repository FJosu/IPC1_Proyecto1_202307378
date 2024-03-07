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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 *
 * @author fjosu
 */
public class Doctors_Module extends JFrame implements ActionListener {
    JButton btn_salir, editprofile;

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
        
        Panel panel1 = new Panel();
        panel1.setBounds(50, 120, 800, 70);
        panel1.setBackground(new Color(202, 222, 246));
        this.add(panel1);
        
        Panel panel2 = new Panel();
        panel2.setBounds(50, 220, 800, 70);
        panel2.setBackground(new Color(202, 222, 246));
        this.add(panel2);
        
        Panel panel3 = new Panel();
        panel3.setBounds(50, 320, 800, 70);
        panel3.setBackground(new Color(202, 222, 246));
        this.add(panel3);
        
        Panel panel4 = new Panel();
        panel4.setBounds(50, 420, 800, 70);
        panel4.setBackground(new Color(202, 222, 246));
        this.add(panel4);
        
        Panel panel5 = new Panel();
        panel5.setBounds(50, 520, 800, 70);
        panel5.setBackground(new Color(202, 222, 246));
        this.add(panel5);
        
        Panel panel6 = new Panel();
        panel6.setBounds(50, 620, 800, 70);
        panel6.setBackground(new Color(202, 222, 246));
        this.add(panel6);
        
        Panel panel7 = new Panel();
        panel7.setBounds(50, 720, 800, 70);
        panel7.setBackground(new Color(202, 222, 246));
        this.add(panel7);
     
        
        
                
        
        
        
        
        // ===========================Pestaña 2============================

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
        }
    }

}
