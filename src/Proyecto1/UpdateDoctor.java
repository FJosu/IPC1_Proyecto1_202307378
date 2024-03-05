/*
 * package Proyecto1;
 * import javax.swing.*;
 * import java.awt.*;
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 * 
 * 
 * public class UpdateDoctor extends JDialog {
 * private JTextField txtNombres;
 * private JTextField txtApellidos;
 * private JTextField txtEspecialidad;
 * private JTextField txtGenero;
 * private JTextField txtTelefono;
 * private JTextField txtEdad;
 * private JButton btnActualizar;
 * private JButton btnCancelar;
 * 
 * private Administrador administrador;
 * private String codigo;
 * 
 * public UpdateDoctor(Administrador administrador, String codigo, String
 * nombres, String apellidos, String especialidad, String genero, String
 * telefono, int edad) {
 * this.administrador = administrador;
 * this.codigo = codigo;
 * 
 * setTitle("Actualizar Doctor");
 * setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
 * setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
 * setSize(300, 250);
 * setResizable(false);
 * setLocationRelativeTo(administrador);
 * 
 * Container contentPane = getContentPane();
 * contentPane.setLayout(new BorderLayout());
 * 
 * JPanel panel = new JPanel();
 * panel.setLayout(new GridLayout(7, 2, 5, 5));
 * 
 * panel.add(new JLabel("Nombres:"));
 * txtNombres = new JTextField(nombres);
 * panel.add(txtNombres);
 * 
 * panel.add(new JLabel("Apellidos:"));
 * txtApellidos = new JTextField(apellidos);
 * panel.add(txtApellidos);
 * 
 * panel.add(new JLabel("Especialidad:"));
 * txtEspecialidad = new JTextField(especialidad);
 * panel.add(txtEspecialidad);
 * 
 * panel.add(new JLabel("Género:"));
 * txtGenero = new JTextField(genero);
 * panel.add(txtGenero);
 * 
 * panel.add(new JLabel("Teléfono:"));
 * txtTelefono = new JTextField(telefono);
 * panel.add(txtTelefono);
 * 
 * panel.add(new JLabel("Edad:"));
 * txtEdad = new JTextField(Integer.toString(edad));
 * panel.add(txtEdad);
 * 
 * contentPane.add(panel, BorderLayout.CENTER);
 * 
 * JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
 * btnActualizar = new JButton("Actualizar");
 * btnActualizar.addActionListener(new ActionListener() {
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * actualizarDoctor();
 * }
 * });
 * buttonPanel.add(btnActualizar);
 * 
 * btnCancelar = new JButton("Cancelar");
 * btnCancelar.addActionListener(new ActionListener() {
 * 
 * @Override
 * public void actionPerformed(ActionEvent e) {
 * dispose();
 * }
 * });
 * buttonPanel.add(btnCancelar);
 * 
 * contentPane.add(buttonPanel, BorderLayout.SOUTH);
 * }
 * 
 * public void actualizarDoctor() {
 * String nuevosNombres = txtNombres.getText();
 * String nuevosApellidos = txtApellidos.getText();
 * String nuevaEspecialidad = txtEspecialidad.getText();
 * String nuevoGenero = txtGenero.getText();
 * String nuevoTelefono = txtTelefono.getText();
 * int nuevaEdad = Integer.parseInt(txtEdad.getText());
 * 
 * Administrador.updatedoctor(codigo, nuevosNombres, nuevosApellidos,
 * nuevaEspecialidad, nuevoGenero, nuevoTelefono, nuevaEdad);
 * 
 * dispose();
 * }
 * }
 */