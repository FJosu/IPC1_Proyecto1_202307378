package Proyecto1;

/**
 *
 * @author fjosu
 */
import java.util.ArrayList;

public class DoctorsData {

    public static ArrayList<Doctors> DoctorList = new ArrayList<>();
    public static int contador = 0001;

    public static void main(String[] args) {

        Login vtn_login = new Login();

    }

    public static Object[][] convertirDatosDoctores_tabla() {
        int filas = DoctorList.size();
        Object[][] arreglo = new Object[filas][8];

        for (int i = 0; i < filas; i++) {
            Doctors temp_doctores = DoctorList.get(i);

            arreglo[i][0] = temp_doctores.getCodigo();
            arreglo[i][1] = temp_doctores.getNombre();
            arreglo[i][2] = temp_doctores.getApellido();
            arreglo[i][3] = temp_doctores.getEspecialidad();
            arreglo[i][4] = temp_doctores.getContraseña();
            arreglo[i][5] = temp_doctores.getTelefono();
            arreglo[i][6] = temp_doctores.getEdad();
            arreglo[i][7] = temp_doctores.getGenero();

        }
        

        return arreglo;

    }


    public static void agregarDoctores(int codigo, String nombre, String apellido, String especialidad,
            String contraseña, String telefono, String edad, String genero) {

        DoctorList.add(new Doctors(codigo, nombre, apellido, especialidad, contraseña, telefono, edad, genero));
        
    }
     public static void DeleteDoctor(int counter) {
        DoctorList.removeIf(tempDoctor -> tempDoctor.getCodigo() == counter);
    }
     public static boolean verificarCredenciales(int codigo, String contraseña) {
        for (Doctors doctors : DoctorList) {
            if (doctors.getCodigo() == codigo && doctors.getContraseña().equals(contraseña)) {
                return true; // Las credenciales son válidas
            }
        }
        return false; // Las credenciales no son válidas
    }
}
