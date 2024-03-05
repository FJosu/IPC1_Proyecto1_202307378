/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.util.ArrayList;

/**
 *
 * @author fjosu
 */

public class DateData {
    public static ArrayList<Date> Datelist = new ArrayList<>();
    public static int contador = 0001;

    public static void main(String[] args) {

        Login vtn_login = new Login();

    }

    public static Object[][] convertirDatosDate_tabla() {
        int filas = Datelist.size();
        Object[][] arreglo = new Object[filas][8];

        for (int i = 0; i < filas; i++) {
            Date temp_data = Datelist.get(i);

            arreglo[i][0] = temp_data.getCodigo();
            arreglo[i][1] = temp_data.getDescripcion();
            arreglo[i][2] = temp_data.getEspecialidad();
            arreglo[i][3] = temp_data.getDoctor();
            arreglo[i][4] = temp_data.getFecha();
            arreglo[i][5] = temp_data.getHora();

        }

        return arreglo;

    }

    public static void agregarDate(int codigo, String descripcion, String especialidad, String doctor, String fecha,
            String hora) {

        Datelist.add(new Date(codigo, descripcion, especialidad, doctor, fecha, hora));
    }
}
