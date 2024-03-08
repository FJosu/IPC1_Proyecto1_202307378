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

public class ProductEdit extends JFrame implements ActionListener {

    private JTextField txtName;
    private JTextField txtprice;
    private JTextField txtdescription;
    private JTextField txtamount;
  
    private JTextField txtId;

    private JButton btnConfirmEditDoctor, btnSearchId;

    public static void ProductEdit(int codigo, String nombre, String precio, String descripcion, String cantidad) {
        ProductData.updateProduct(new Products(codigo, nombre, precio, descripcion, cantidad));
    }

    Products product;

    public ProductEdit() {

        JLabel lblTitleEditPr = new JLabel("¿Qué producto deseas editar?");
        lblTitleEditPr.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 14));
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
        lblTitleEditPrFields.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 13));
        lblTitleEditPrFields.setBounds(90, 210, 300, 100);
        lblTitleEditPrFields.setForeground(Color.BLACK);
        this.add(lblTitleEditPrFields);

        JLabel lblName = new JLabel("Nombre:");
        lblName.setBounds(10, 300, 200, 25);
        this.add(lblName);

        txtName = new JTextField();
        txtName.setBounds(90, 300, 200, 25);
        this.add(txtName);

        JLabel lblprice = new JLabel("Precio:");
        lblprice.setBounds(10, 335, 200, 25);
        this.add(lblprice);

        txtprice = new JTextField();
        txtprice.setBounds(90, 335, 200, 25);
        this.add(txtprice);
        

        JLabel lblPassword = new JLabel("Descripción:");
        lblPassword.setBounds(10, 370, 200, 25);
        this.add(lblPassword);

        txtdescription = new JTextField();
        txtdescription.setBounds(90, 370, 200, 25);
        this.add(txtdescription);

        JLabel lblPhone = new JLabel("Cantidad:");
        lblPhone.setBounds(10, 405, 200, 25);
        this.add(lblPhone);

        txtamount = new JTextField();
        txtamount.setBounds(90, 405, 200, 25);
        this.add(txtamount);

        // Botón para confirmar cambios en el producto
        btnConfirmEditDoctor = new JButton("Confirmar");
        btnConfirmEditDoctor.setBounds(95, 460, 150, 25);
        btnConfirmEditDoctor.setForeground(Color.WHITE); // color de la letra del boton
        btnConfirmEditDoctor.setBackground(new Color(97, 145, 199)); // color de fondo del boton
        btnConfirmEditDoctor.addActionListener(this); // se agrega el ActionListener al botón
        this.add(btnConfirmEditDoctor);

        // Título de la ventana
        this.setTitle("Editar Producto");
        // Tamaño de la ventana
        this.setSize(350, 530);
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
                product = ProductData.getProduct(codigo);

                // Llenar los campos de texto con los datos del producto
                txtName.setText(product.getNombre());
                txtprice.setText(product.getPrecio());
                txtdescription.setText(product.getDescripcion());
                txtamount.setText(product.getCantidad());

                
                
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una código válido.", "Error",JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnConfirmEditDoctor) {
            String codigoTemp = txtId.getText();
            String nameTemp = txtName.getText();
            String price = txtprice.getText();
            String description = txtdescription.getText();
            String amount = txtamount.getText();
            
            

            try {
                ProductData.updateProduct(product);

                int codigo = Integer.parseInt(codigoTemp);

               


                product.setNombre(nameTemp);
                product.setPrecio(price);
                product.setDescripcion(description);
                product.setCantidad(amount);

                

                JOptionPane.showMessageDialog(this, "Producto editado con éxito!", "Confirmación",   JOptionPane.PLAIN_MESSAGE);
                this.dispose();
                Administrador adminWindow = new Administrador();
            } catch (NumberFormatException ex) {
                // Si la conversión falla, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}

    
