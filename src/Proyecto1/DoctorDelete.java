/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

 //Librerias importadas
      import javax.swing.*;
      import java.awt.*;
      import java.awt.event.ActionEvent;
      import java.awt.event.ActionListener;

public class DoctorDelete extends JFrame implements ActionListener {
    
    
        private JTextField txtId;
        private JButton Delete; 
    
        public DoctorDelete() {
            JLabel title = new JLabel("¿Qué doctor deseas eliminar?");
            title.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 14));
            title.setBounds(45, -5, 300, 100);
            title.setForeground(Color.BLACK);
            this.add(title);
    

            JLabel code = new JLabel("Código:");
            code.setBounds(29, 100, 200, 25);
            this.add(code);

            JLabel ID = new JLabel("ID:");
            ID.setBounds(29, 100, 200, 25);
            this.add(ID);

    
            txtId = new JTextField();
            txtId.setBounds(90, 100, 200, 25);
            this.add(txtId);
    
            
    
            // Botón para eliminar paciente
            Delete = new JButton("Eliminar");
            Delete.setBounds(95, 200, 150, 25);
            Delete.setForeground(Color.WHITE); // color de la letra del boton
            Delete.setBackground(new Color(97, 145, 199)); // color de fondo del boton
            Delete.addActionListener(this); // se agrega el ActionListener al botón
            this.add(Delete);
    
            // Título de la ventana
            this.setTitle("Eliminar Doctor");
            // Tamaño de la ventana
            this.setSize(350, 300);
            // No permitir modificar el tamaño de la ventana
            setResizable(false);
            // Cerrar la aplicación al cerrar la ventana
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            // Ubicar la ventana en el centro de la pantalla
            setLocationRelativeTo(null);
            //Color de la ventana
            getContentPane().setBackground(new Color(217, 234, 253)); 
            // Para permitir componentes en la ventana y su posición
            this.setLayout(null);
            // Hacer visible la ventana
            setVisible(true);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Delete) {
                String ID = txtId.getText();
                
    
                try {
                    // Conversión de edad de String a int
                    int idDoctor = Integer.parseInt(ID);
                    // Si la conversión es exitosa, el sistema agrega el doctor
                    DoctorsData.DeleteDoctor(idDoctor);
                    JOptionPane.showMessageDialog(this, "Doctor eliminado con éxito!", "Confirmación", JOptionPane.PLAIN_MESSAGE);
                    this.dispose();
                    Administrador adminWindow = new Administrador();
                
                } catch (NumberFormatException ex) {
                    // Si la conversión falla, muestra un mensaje de error
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese una paciente válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
    
            }
        }
}
