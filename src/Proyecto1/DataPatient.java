/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author fjosu
 */
import java.util.ArrayList;

public class DataPatient {

    public static ArrayList<Patient> PacientList = new ArrayList<>();
    public static ArrayList<Patient_Module> patientModules = new ArrayList<>();
    public static int contador = 1;

    public static void main(String[] args) {

        Login vtn_login = new Login();

    }

    public static Object[][] convertirDatosPaciente_tabla() {
        int filas = PacientList.size();

        Object[][] arreglo = new Object[filas][6];

        for (int i = 0; i < filas; i++) {
            Patient temp_paciente = PacientList.get(i);

            arreglo[i][0] = temp_paciente.getCodigo();
            arreglo[i][1] = temp_paciente.getNombre();
            arreglo[i][2] = temp_paciente.getApellido();
            arreglo[i][3] = temp_paciente.getContraseña();
            arreglo[i][4] = temp_paciente.getEdad();
            arreglo[i][5] = temp_paciente.getGenero();
            

        }

        return arreglo;

    }

    public static String obtenerSiguienteCodigo() {
        int contador2 = contador - 1;

        String codigo = String.format("%04d", contador2);

        return codigo;
    }

    public static void agregarPaciente(int codigo, String nombre, String apellido, String contraseña, String edad,
            String genero) {

        PacientList.add(new Patient(codigo, nombre, apellido, contraseña, edad, genero));
    }

    public static boolean verificarCredenciales(int codigo, String contraseña) {
        for (Patient paciente : PacientList) {
            if (paciente.getCodigo() == codigo && paciente.getContraseña().equals(contraseña)) {
                return true; // Las credenciales son válidas
            }
        }
        return false; // Las credenciales no son válidas
    }
    public static void DeleteDoctor(int counter) {
        PacientList.removeIf(temppatient -> temppatient.getCodigo() == counter);
    }

}