package Proyecto1;

/**
 *
 * @author coxla
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Librerías para usar ArrayListA, Map y hacer el ordenamiento
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

//Librerías para poder gráficar
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.table.DefaultTableModel;


public class Administrador extends JFrame implements ActionListener {

    JButton btn_salir, btnRegistro, btnRegistro2, btn_salir2, btnRegistro3, btn_salir3, btnActualizar1, btnActualizar2,
            btnActualizar3, btnEliminar1, btnEliminar2, btnEliminar3;
        private JTable table_doctores; // Declarar table_doctores como atributo de la clase
        private JTextField doctorCodeField;


    public Administrador() {
        

        // Crear un objeto JTabbedPane para gestionar pestañas
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        // Crear tres panales para las pestañas
        JPanel pest1 = new JPanel(null); // Se coloca null para tener control en la posicion de los elemntos en la
                                         // pestaña
        pest1.setBackground(new Color(217, 234, 253));
        JPanel pest2 = new JPanel(null);
        pest2.setBackground(new Color(217, 234, 253));
        JPanel pest3 = new JPanel(null);
        pest3.setBackground(new Color(217, 234, 253));

        // Agregar los paneles a las pestañas del JTabbedPane
        tabbedPane.addTab("Doctores", pest1);
        tabbedPane.addTab("Pacientes", pest2);
        tabbedPane.addTab("Productos", pest3);

        // ===========================Pestaña Doctores============================00
        // Botones
        // Registro
        btnRegistro = new JButton("Crear Doctor");
        btnRegistro.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnRegistro.setBounds(950, 25, 180, 50);
        btnRegistro.setBackground(new Color(97, 145, 199));
        btnRegistro.setForeground(Color.white);
        btnRegistro.setVisible(true);
        btnRegistro.setEnabled(true);
        btnRegistro.addActionListener(this);
        pest1.add(btnRegistro);

        // Salir
        btn_salir = new JButton("Salir");
        btn_salir.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btn_salir.setBackground(new Color(97, 145, 199));
        btn_salir.setForeground(Color.white);
        btn_salir.setBounds(1150, 25, 180, 50);
        btn_salir.setVisible(true);
        btn_salir.addActionListener(this);
        pest1.add(btn_salir);

        btnActualizar1 = new JButton("Actualizar Doctor");
        btnActualizar1.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnActualizar1.setBackground(new Color(97, 145, 199));
        btnActualizar1.setForeground(Color.white);
        btnActualizar1.setBounds(950, 90, 180, 50);
        btnActualizar1.setVisible(true);
        btnActualizar1.addActionListener(this);
        pest1.add(btnActualizar1);
        
        
        btnEliminar1 = new JButton("Eliminar Doctor");
        btnEliminar1.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnEliminar1.setBounds(1150, 90, 180, 50);
        btnEliminar1.setVisible(true);
        btnEliminar1.setBackground(new Color(97, 145, 199));
        btnEliminar1.setForeground(Color.white);
        btnEliminar1.addActionListener(this);
        pest1.add(btnEliminar1);
        //===================================================================================================
        

        
        
        //======================================================================

        // Titulo
        // Crear un nuevo JLabel con el texto "Listado Oficial"
        JLabel Title = new JLabel("Listado Doctores");
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
        
        

        // Tabla
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnsNames = { "Código", "Nombre", "Apellido", "Especialidad", "Contraseña", "Teléfono", "Edad",
                "Género" };
        // Crear una instancia de JTable con los datos y nombres de columna
        table_doctores = new JTable(DoctorsData.convertirDatosDoctores_tabla(), columnsNames);
        table_doctores.setBackground(new Color(217, 234, 253));

        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es
        // necesario)
        JScrollPane scrollPane = new JScrollPane(table_doctores);
        scrollPane.setBackground(new Color(217, 234, 253));

        scrollPane.setBounds(25, 80, 900, 570);

        pest1.add(scrollPane);
        
  


        // ===========================Pestaña 2============================
        btnRegistro2 = new JButton("Crear Paciente");
        btnRegistro2.setBounds(800, 25, 180, 50);
        btnRegistro2.setBackground(new Color(97, 145, 199));
        btnRegistro2.setForeground(Color.white);
        btnRegistro2.setVisible(true);
        btnRegistro2.setEnabled(true);
        btnRegistro2.addActionListener(this);
        pest2.add(btnRegistro2);

        // Salir
        btn_salir2 = new JButton("Salir");
        btn_salir2.setBounds(1000, 25, 180, 50);
        btn_salir2.setVisible(true);
        btn_salir2.setBackground(new Color(97, 145, 199));
        btn_salir2.setForeground(Color.white);
        btn_salir2.addActionListener(this);
        pest2.add(btn_salir2);
        btnActualizar2 = new JButton("Actualizar Paciente");
        btnActualizar2.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnActualizar2.setBounds(800, 90, 180, 50);
        btnActualizar2.setBackground(new Color(97, 145, 199));
        btnActualizar2.setForeground(Color.white);
        btnActualizar2.setVisible(true);
        btnActualizar2.addActionListener(this);
        pest2.add(btnActualizar2);

        btnEliminar2 = new JButton("Eliminar Paciente");
        btnEliminar2.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnEliminar2.setBounds(1000, 90, 180, 50);
        btnEliminar2.setVisible(true);
        btnEliminar2.setBackground(new Color(97, 145, 199));
        btnEliminar2.setForeground(Color.white);
        btnEliminar2.addActionListener(this);
        pest2.add(btnEliminar2);

        // Titulo
        // Crear un nuevo JLabel con el texto "Listado Oficial"
        JLabel paciente = new JLabel("Listado Pacientes");
        // Estable_estudiantecer la posición y el tamaño del JLabel en el JPanel
        paciente.setBounds(25, 25, 750, 50);
        // Estable_estudiantecer un borde alrededor del JLabel con un grosor de 2
        // píxeles y color negro
        // paciente.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        // Estable_estudiantecer el color de fondo del JLabel como GRIS CLARO
        paciente.setBackground(new Color(217, 234, 253));
        paciente.setForeground(new Color(12, 58, 109));
        // Hacer que el JLabel sea opaco para que se pueda ver el color de fondo
        paciente.setOpaque(true);
        // Alinear vertical y horizontalmente el texto del JLabel al centro
        paciente.setVerticalAlignment(SwingConstants.CENTER);
        paciente.setHorizontalAlignment(SwingConstants.CENTER);
        // Estable_estudiantecer el tamaño de la fuente del JLabel, negrita y tamaño 24
        paciente.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 24));
        // Hacer que el JLabel sea visible
        paciente.setVisible(true);

        // Agregar el JLabel al JPanel llamado pest1
        pest2.add(paciente);

        // Tabla
        // Crear un modelo de tabla y agregar datos de ejemplo
        String[] columnspaciente = { "Número", "Nombre", "Apellido", "Contraseña", "Edad", "Género" };
        
        // Crear una instancia de JTable con los datos y nombres de columna
        JTable table_paciente = new JTable(DataPatient.convertirDatosPaciente_tabla(), columnspaciente);
        table_paciente.setBackground(new Color(217, 234, 253));

        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es
        // necesario)
        JScrollPane scrollPanel = new JScrollPane(table_paciente);

        scrollPanel.setBounds(25, 80, 750, 570);

        pest2.add(scrollPanel);

        // =================================Productos============================================
        btnRegistro3 = new JButton("Crear");
        btnRegistro3.setBounds(800, 25, 180, 50);
        btnRegistro3.setVisible(true);
        btnRegistro3.setEnabled(true);
        btnRegistro3.setBackground(new Color(97, 145, 199));
        btnRegistro3.setForeground(Color.white);
        btnRegistro3.addActionListener(this);
        pest3.add(btnRegistro3);

        // Salir
        btn_salir3 = new JButton("Salir");
        btn_salir3.setBounds(1000, 25, 180, 50);
        btn_salir3.setVisible(true);
        btn_salir3.setBackground(new Color(97, 145, 199));
        btn_salir3.setForeground(Color.white);
        btn_salir3.addActionListener(this);
        pest3.add(btn_salir3);

        btnActualizar3 = new JButton("Actualizar Producto");
        btnActualizar3.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnActualizar3.setBounds(800, 90, 180, 50);
        btnActualizar3.setBackground(new Color(97, 145, 199));
        btnActualizar3.setForeground(Color.white);
        btnActualizar3.setVisible(true);
        btnActualizar3.addActionListener(this);
        pest3.add(btnActualizar3);

        btnEliminar3 = new JButton("Eliminar Producto");
        btnEliminar3.setFont(new Font("Kdam Thmor Pro", Font.BOLD, 10));
        btnEliminar3.setBounds(1000, 90, 180, 50);
        btnEliminar3.setVisible(true);
        btnEliminar3.setBackground(new Color(97, 145, 199));
        btnEliminar3.setForeground(Color.white);
        btnEliminar3.addActionListener(this);
        pest3.add(btnEliminar3);

        // Titulo
        // Crear un nuevo JLabel con el texto "Listado Oficial"
        JLabel productos = new JLabel("Listado de Productos");
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
        table_producto.setBackground(new Color(217, 234, 253));

        // Crear un JScrollPane para la tabla (permite desplazarse por la tabla si es
        // necesario)
        JScrollPane scrollPanel2 = new JScrollPane(table_producto);

        scrollPanel2.setBounds(25, 80, 750, 570);

        pest3.add(scrollPanel2);

        // =========================================================================================
        

        

        //============================Vista Estudiantes==================================0
        //============================Vista Doctor==================================
        //Elementos de la grafica especialidad
        DefaultCategoryDataset datos_Especialidad = new DefaultCategoryDataset();

        Map<String, Integer> especialidades = new HashMap();

        //for each
        // Contar la cantidad de especialidades
        for (Doctors doctor_x : DoctorsData.DoctorList) {

            String espec = doctor_x.getEspecialidad();

            if (especialidades.containsKey(espec)) {
                // Incrementar el contador si la especialidad ya está en el mapa
                especialidades.put(espec, especialidades.get(espec) + 1);
            } else {
                // Agregar la especialidad al mapa con contador 1 si no existe
                especialidades.put(espec, 1);
            }

        }

        // Ordenar el mapa por valores (número de especialides)
        //Pasamos el anterior map a un ArrayList
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(especialidades.entrySet());
        //Ordenamos la lista del número mayor al menor
        //Collections.sort(lista que vamos a ordenar, Comparator.comparing(Que valor vamos a tomcar para ordenar, ordenarlo de mayor a menor) )
        Collections.sort(listaOrdenada, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        // Agregar las primeras 5 especialidades al gráfico
        int contadort = 0;
        for (Map.Entry<String, Integer> dato_mapa : listaOrdenada) {
            contadort++;
            //                         (valor que va a tener en la grafica, especialidad, especialidad)
            datos_Especialidad.addValue(dato_mapa.getValue(), dato_mapa.getKey(), dato_mapa.getKey());

            if (contadort == 3) {
                break;
            }

        }
        //Creando Grafica
        JFreeChart graficaEspecialidad = ChartFactory.createBarChart(
                "Top 3 de Especialidades", //Titulo grafica
                "Especialidad", //Titulo eje X
                "Cantidad", //Titulo eje Y
                datos_Especialidad //datos utilizado para construir el gráfico
        );

        // Cambiar la orientación de las etiquetas en el eje X a vertical
        CategoryPlot plot_xd = graficaEspecialidad.getCategoryPlot();
        CategoryAxis xAxis = plot_xd.getDomainAxis();
        xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

        // Crear un panel para mostrar el gráfico
        ChartPanel chartPanel = new ChartPanel(graficaEspecialidad);
        chartPanel.setBounds(1000, 350, 400, 400);
        pest1.add(chartPanel);
        
        //=========================================================================================
         //Elementos de la grafica producto
        DefaultCategoryDataset datos_producto = new DefaultCategoryDataset();

        Map<String, Integer> productost2 = new HashMap();

        //for each
        // Contar la cantidad de especialidades
        for (Products productos_x : ProductData.Productlist) {

            String espec2 = productos_x.getNombre();

            if (productost2.containsKey(espec2)) {
                // Incrementar el contador si la especialidad ya está en el mapa
                productost2.put(espec2, productost2.get(espec2) + 1);
            } else {
                // Agregar la especialidad al mapa con contador 1 si no existe
                productost2.put(espec2, 1);
            }

        }

        // Ordenar el mapa por valores (número de especialides)
        //Pasamos el anterior map a un ArrayList
        List<Map.Entry<String, Integer>> listaOrdenada2 = new ArrayList<>(productost2.entrySet());
        //Ordenamos la lista del número mayor al menor
        //Collections.sort(lista que vamos a ordenar, Comparator.comparing(Que valor vamos a tomcar para ordenar, ordenarlo de mayor a menor) )
        Collections.sort(listaOrdenada2, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        // Agregar las primeras 5 especialidades al gráfico
        int contadort2 = 0;
        for (Map.Entry<String, Integer> dato_mapa2 : listaOrdenada2) {
            contadort2++;
            //                         (valor que va a tener en la grafica, especialidad, especialidad)
            datos_producto.addValue(dato_mapa2.getValue(), dato_mapa2.getKey(), dato_mapa2.getKey());

            if (contadort2 == 3) {
                break;
            }

        }
        //Creando Grafica
        JFreeChart graficaProduc = ChartFactory.createBarChart(
                "Top 3 de Productos", //Titulo grafica
                "Especialidad", //Titulo eje X
                "Cantidad", //Titulo eje Y
                datos_producto //datos utilizado para construir el gráfico
        );

        // Cambiar la orientación de las etiquetas en el eje X a vertical
        CategoryPlot plot = graficaProduc.getCategoryPlot();
        CategoryAxis xAxis2 = plot.getDomainAxis();
        xAxis2.setCategoryLabelPositions(CategoryLabelPositions.UP_45);

        // Crear un panel para mostrar el gráfico
        ChartPanel chartPanel2 = new ChartPanel(graficaProduc);
        chartPanel2.setBounds(1000, 350, 400, 400);
        pest3.add(chartPanel2);
        
        //=========================================================================================
        

        // Agregar el JTabbedPane al contenido del JFrame
        getContentPane().add(tabbedPane);

        // ------------Creando JFrame------------------
        this.setExtendedState(MAXIMIZED_BOTH); // Hacer que la ventana se abra maximizada
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        this.setResizable(false); // Deshabilitar la capacidad de cambiar el tamaño de la ventana
        this.setVisible(true); // Hacer la ventana visible
        this.setBackground(new Color(131, 193, 255));

    }

    // =========Método Abstracto para los eventos==============
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_salir) {
            this.dispose();
            Login vtn_login = new Login();
        } else if (e.getSource() == btnRegistro) {
            this.dispose();
            RegisterDoctors vtn_registro = new RegisterDoctors();
        } else if (e.getSource() == btnRegistro2) {
            this.dispose();
            RegisterPatient vtn_registropa = new RegisterPatient();

        } else if (e.getSource() == btn_salir2) {
            this.dispose();
            Login vtn_login = new Login();
        } else if (e.getSource() == btnRegistro3) {
            this.dispose();
            RegisterProduct vtn_registropa = new RegisterProduct();

        } else if (e.getSource() == btn_salir3) {
            this.dispose();
            Login vtn_login = new Login();
        }else if(e.getSource() == btnEliminar1) {
            this.dispose();
            
                DeleteDoctors delete= new DeleteDoctors();
        }else if(e.getSource() == btnEliminar2) {
            this.dispose();
            
                DeletePatient deletep= new DeletePatient();
        }else if(e.getSource() == btnEliminar3) {
            this.dispose();
            
                DeleteProduct delete= new DeleteProduct();
        }
          
          
             }
        
    }
            

        

               


