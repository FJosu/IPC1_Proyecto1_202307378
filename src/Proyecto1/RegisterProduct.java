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

public class RegisterProduct extends JFrame implements ActionListener {
    private JTextField firstNameField;

    private JTextField PriceField;
    private JTextField DescriptionField;
    private JTextField amountfield;
    JButton registerButton;
    private JTable table_doctores; // Declarar la variable table_doctores


    public RegisterProduct() {
        JLabel titleLabel = new JLabel("Registro de Producto");
        titleLabel.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 20));
        titleLabel.setBounds(150, 10, 220, 30);
        titleLabel.setBackground(new Color(217, 234, 253));
        titleLabel.setOpaque(true);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        this.add(titleLabel);
        // Nombre

        JLabel firstNameLabel = new JLabel("Nombre:");
        firstNameLabel.setBounds(70, 50, 60, 25);
        firstNameLabel.setBackground(new Color(217, 234, 253));
        firstNameLabel.setOpaque(true);
        this.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setBounds(130, 50, 260, 25);
        firstNameField.setBackground(new Color(202, 222, 246));
        this.add(firstNameField);
        // Precio

        JLabel PriceLabel = new JLabel("Precio:");
        PriceLabel.setBounds(70, 90, 60, 25);
        PriceLabel.setBackground(new Color(217, 234, 253));
        PriceLabel.setOpaque(true);
        this.add(PriceLabel);

        PriceField = new JTextField();
        PriceField.setBounds(130, 90, 260, 25);
        PriceField.setBackground(new Color(202, 222, 246));
        this.add(PriceField);
        // Descripción

        JLabel DescriptionLabel = new JLabel("Descripción:");
        DescriptionLabel.setBounds(70, 130, 80, 25);
        DescriptionLabel.setBackground(new Color(217, 234, 253));
        DescriptionLabel.setOpaque(true);
        this.add(DescriptionLabel);

        DescriptionField = new JTextField();
        DescriptionField.setBounds(150, 130, 240, 25);
        DescriptionField.setBackground(new Color(202, 222, 246));
        this.add(DescriptionField);
        // Apellidos

        JLabel amountlabel = new JLabel("Cantidad:");
        amountlabel.setBounds(70, 170, 60, 25);
        amountlabel.setBackground(new Color(217, 234, 253));
        amountlabel.setOpaque(true);
        this.add(amountlabel);

        amountfield = new JTextField();
        amountfield.setBounds(130, 170, 260, 25);
        amountfield.setBackground(new Color(202, 222, 246));
        this.add(amountfield);
        registerButton = new JButton("Registrarse");
        registerButton.setBounds(180, 250, 150, 25);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(97, 145, 199));
        registerButton.addActionListener(this);
        this.add(registerButton);

        this.setTitle("Registro Productos");
        this.setBounds(650, 400, 500, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Panel fondo = new Panel();
        fondo.setBounds(0, 0, 500, 350);
        fondo.setBackground(new Color(217, 234, 253));
        this.add(fondo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String name = firstNameField.getText();
            String price = PriceField.getText();
            String description = DescriptionField.getText();
            String amount = amountfield.getText();

            ProductData.agregarProducto(ProductData.contador, name, price, description, amount);
            ProductData.contador++;

            this.dispose();
            JOptionPane.showMessageDialog(this, "Producto registrado exitosamente", "Confirmación de Registro", 1);
            this.dispose();

                 Administrador vtn_admin = new Administrador();
        }
    }

}
