/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author fjosu
 */
public class Doctors_Module extends JFrame implements ActionListener {
    JButton btn_salir;
    public Doctors_Module(){
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

         // Crear un objeto JTabbedPane para gestionar pestañas
        

        //Crear tres panales para las pestañas
        JPanel pest1 = new JPanel(null); //Se coloca null para tener control en la posicion de los elemntos en la pestaña
        pest1.setBackground(new Color (217, 234, 253));
        JPanel pest2 = new JPanel(null);
        pest2.setBackground(new Color (217, 234, 253));
        JPanel pest3 = new JPanel(null);
        pest3.setBackground(new Color (217, 234, 253));
        
         // Agregar los paneles a las pestañas del JTabbedPane
        tabbedPane.addTab("Doctores", pest1);
        tabbedPane.addTab("Pacientes", pest2);
        tabbedPane.addTab("Productos", pest3);
        
        //===========================Pestaña Doctores============================00
        
        JLabel lbl4 = new JLabel("Listado Doctores");
        

        //===========================Pestaña 2============================
       
        
        // Titulo
        // Crear un nuevo JLabel con el texto "Listado Oficial"
        JLabel paciente = new JLabel("Listado Pacientes");
        //===========================Pestaña 3============================
        
        
        //=================================================================

        
        
         // Agregar el JTabbedPane al contenido del JFrame
        getContentPane().add(tabbedPane);

        

        //------------Creando JFrame------------------
        this.setBounds(325, 50, 900, 750);  // Hacer que la ventana se abra maximizada
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        this.setResizable(false); // Deshabilitar la capacidad de cambiar el tamaño de la ventana
        this.setVisible(true); // Hacer la ventana visible
        this.setBackground(new Color (131, 193, 255));
        
        

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn_salir) {
            this.dispose();
        }
    }
    
}
