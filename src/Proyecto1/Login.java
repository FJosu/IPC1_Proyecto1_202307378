package Proyecto1;

/**
 *
 * @author fjosu
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private JTextField usernameFiel;
    private JPasswordField passwordFiel;
    private JTable table_doctores; // Declarar la variable table_doctores
    private JRadioButton optiopatient;
    private JRadioButton optiondoctor;


    public Login() {

        // Etiqueta con el título "Login"
        JLabel titleLabel = new JLabel("Welcome");
        titleLabel.setBounds(50, 50, 250, 60); // Posición y tamaño (x, y, width, height)

        titleLabel.setFont(new Font("Kristen ITC", Font.BOLD, 50)); // Establece el tipo de letra y el tamaño
        titleLabel.setBackground(new Color(217, 234, 253));
        titleLabel.setOpaque(true);
        /*
         * x: La posición horizontal de la esquina superior izquierda de la ventana en
         * píxeles desde el borde izquierdo de la pantalla.
         * y: La posición vertical de la esquina superior izquierda de la ventana en
         * píxeles desde la parte superior de la pantalla.
         * width: El ancho de la ventana en píxeles.
         * height: La altura de la ventana en píxeles.
         */
        this.add(titleLabel);

        // Cargar la imagen
        ImageIcon Icom = new ImageIcon(getClass().getResource("/imgs/logo.png"));

        // Ajusta el tamaño de la imagen, es decir, redimencionar
        Image imageDemension = Icom.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        // Crear un nuevo ImageIcon con la imagen ajustada
        ImageIcon adjustedImageIcon = new ImageIcon(imageDemension);

        // JLabel Para mostrar la imagen
        JLabel imageLabel = new JLabel(adjustedImageIcon);
        imageLabel.setBounds(320, 30, 160, 100);
        imageLabel.setBackground(new Color(217, 234, 253));
        imageLabel.setOpaque(true);
        this.add(imageLabel);

        // Etiqueta para el nombre de usuario
        JLabel usernameLabel = new JLabel("Código:");
        usernameLabel.setBackground(new Color(217, 234, 253));
        usernameLabel.setOpaque(true);
        usernameLabel.setBounds(50, 140, 80, 20);
        usernameLabel.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));

        this.add(usernameLabel);
        // Campi de texto para el nombre del usuario
        usernameFiel = new JTextField();
        usernameFiel.setBounds(130, 140, 260, 25); // (x, y, width, height)
        usernameFiel.setBackground(new Color(202, 222, 246));

        this.add(usernameFiel);

        // Etiqeuta para la contraseña
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBackground(new Color(217, 234, 253));
        passwordLabel.setOpaque(true);
        passwordLabel.setBounds(50, 180, 80, 25);
        passwordLabel.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));

        this.add(passwordLabel);
        // Campo para la contraseña

        passwordFiel = new JPasswordField();
        passwordFiel.setBounds(130, 180, 260, 25);
        passwordFiel.setBackground(new Color(202, 222, 246));

        this.add(passwordFiel);

        
        // --------------------
        // Boton de inicio de sesión
        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(80, 270, 150, 25); // Ajuste de posición
        loginButton.setForeground(Color.WHITE); // Ajuste de color de letra
        loginButton.setBackground(new Color(97, 145, 199)); // Ajuste de color de boton, con color en RGB
        loginButton.addActionListener(this); // Agregamos un ActionListener al botón
        loginButton.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        this.add(loginButton);

        // Botón de Registro
        JButton registerButton = new JButton("Registrarse");
        registerButton.setBounds(250, 270, 150, 25); // Ajuste de posición
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(97, 145, 199)); // Ajuste de color de boton, con color en RGB
        registerButton.addActionListener(this); // Agregamos un ActionListener al botón
        registerButton.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        this.add(registerButton);
        
        JRadioButton optiopatient= new JRadioButton("Paciente");
        optiopatient.setBounds(270, 220, 150, 25); // Posición y tamaño (x, y, width, height)
        optiopatient.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 15)); // Establece el tipo de letra y el tamaño
        optiopatient.setBackground(new Color(217, 234, 253)); // Color
        optiopatient.setOpaque(true);  
        this.add(optiopatient);

        JRadioButton optiondoctor= new JRadioButton("Doctor");
        optiondoctor.setBounds(100, 220, 150, 25); // Posición y tamaño (x, y, width, height)
        optiondoctor.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 15)); // Establece el tipo de letra y el tamaño
        optiondoctor.setBackground(new Color(217, 234, 253)); // Color
        optiondoctor.setOpaque(true);  
        this.add(optiondoctor);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(optiopatient);
        bg.add(optiondoctor);

        // Creacion de la ventana de inicio
        this.setTitle("Login"); // Título de la ventana
        this.setSize(500, 350);// Tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        this.setLayout(null); // Diseño nulo (sin diseño predeterminado), para poder posicionar los
                              // componentes donde queramos
        this.setResizable(false); // No permite redimensionar la ventana
        this.setLocationRelativeTo(null); // Despliega la ventana en el centro de la pantalla
        this.setVisible(true); // Hace visible la ventana
        Panel fondo = new Panel();
        fondo.setBounds(0, 0, 500, 350);
        fondo.setBackground(new Color(217, 234, 253));
        this.add(fondo);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (optiondoctor.isSelected()) {
                    Doctors_Module doc = new Doctors_Module();
                    doc.setVisible(true);
                    Login.this.setVisible(false);
            } else if (optiopatient.isSelected()) {
                Patient_Module Pac = new Patient_Module();
                Pac.setVisible(true);
                Login.this.setVisible(false);
            }


        }
        });
    }
    @Override
    public void actionPerformed(ActionEvent Ae) {
        if (Ae.getActionCommand().equals("Iniciar Sesión")) {
            String username = usernameFiel.getText();
            String pwd = new String(passwordFiel.getPassword());

            if (username.equals("") && pwd.equals("")) {
                Administrador vtn_admin = new Administrador();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "User and/or password incorrect.", "Error con el LOGIN", 0);
            }

        } else if (Ae.getActionCommand().equals("Registrarse")) {
            RegisterLogin vtn_registropa = new RegisterLogin();
            //Patient_Module vtn_andmin = new Patient_Module();

            this.dispose();

        }
    }



}



