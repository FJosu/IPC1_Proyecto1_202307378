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
public class TimeData {
    public static ArrayList<Datetime> Timelist = new ArrayList<>();
    public static int contador = 0001;

    public static void main(String[] args) {

        Login vtn_login = new Login();

    }

    public static Object[][] convertirDatosTime_tabla() {
        int filas = Timelist.size();
        Object[][] arreglo = new Object[filas][2];

        for (int i = 0; i < filas; i++) {
            Datetime temp_time = Timelist.get(i);

            arreglo[i][0] = temp_time.getCodigo();
            arreglo[i][1] = temp_time.getHora();

        }

        return arreglo;

    }

    public static void agregarTime(int codigo, String hour) {

        Timelist.add(new Datetime(codigo, hour));
    }
}
