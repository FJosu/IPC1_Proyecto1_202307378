/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author fjosu
 */
import java.util.ArrayList;

public class DatosPaciente {

    public static ArrayList<Pacientes> PacientList = new ArrayList<>();
    public static int  contador=1;
    public static void main(String[] args) {

        
        Login vtn_login= new Login();
        
    }
    public static Object[][] convertirDatosPaciente_tabla(){
        int filas= PacientList.size();
        Object[][] arreglo = new Object[filas][6];
        
        for (int i = 0; i < filas; i++) {
                Pacientes temp_paciente= PacientList.get(i);
                
                arreglo[i][0]=temp_paciente.getCodigo();
                arreglo[i][1]=temp_paciente.getNombre();
                arreglo[i][2]=temp_paciente.getApellido();
                arreglo[i][3]=temp_paciente.getContraseña();
                arreglo[i][4]=temp_paciente.getEdad();
                arreglo[i][5]=temp_paciente.getGenero();
                
        }
        
        return arreglo;
    
    }
    
    
    public static void agregarPaciente(int codigo, String nombre, String apellido, String contraseña, String edad,  String genero){
        
      
        
        PacientList.add(new Pacientes(codigo, nombre, apellido,contraseña,edad, genero));
    }
}