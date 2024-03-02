package ejemplo1;

/**
 *
 * @author coxla
 */
import java.util.ArrayList;

public class Array {

    public static ArrayList<Doctores> DoctorList = new ArrayList<>();
    public static int  contador=1;
    public static void main(String[] args) {

        
        Login vtn_login= new Login();
        
    }
    
    public static Object[][] convertirDatosDoctores_tabla(){
        int filas= DoctorList.size();
        Object[][] arreglo = new Object[filas][5];
        
        for (int i = 0; i < filas; i++) {
                Doctores temp_estudiante= DoctorList.get(i);
                
                arreglo[i][0]=temp_estudiante.getCodigo();
                arreglo[i][1]=temp_estudiante.getNombre();
                arreglo[i][2]=temp_estudiante.getApellido();
                arreglo[i][3]=temp_estudiante.getCorreo();
                arreglo[i][4]=temp_estudiante.getGenero();
                
        }
        
        return arreglo;
    
    }
    
    
    public static void agregarEstudiante(int codigo, String nombre, String apellido, String correo, String genero){
        
      
        
        DoctorList.add(new Doctores(codigo, nombre, apellido, correo, genero));
    }
}
