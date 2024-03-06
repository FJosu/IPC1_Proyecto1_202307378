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

public class ProductData {

    public static ArrayList<Products> Productlist = new ArrayList<>();
    public static int  contador=1;
    public static void main(String[] args) {

        
        Login vtn_login= new Login();
        
    }
    
    public static Object[][] convertirDatosProducto_tabla(){
        int filas= Productlist.size();
        Object[][] arreglo = new Object[filas][5];
        
        for (int i = 0; i < filas; i++) {
                Products temp_Producto = Productlist.get(i);
                
                arreglo[i][0]=temp_Producto.getCodigo();
                arreglo[i][1]=temp_Producto.getNombre();
                arreglo[i][2]=temp_Producto.getPrecio();
                arreglo[i][3]=temp_Producto.getDescripcion();
                arreglo[i][4]=temp_Producto.getCantidad();
                
                
        }
        
        return arreglo;
    
    }
    
    
    public static void agregarProducto(int codigo, String nombre, String precio, String descripcion, String cantidad){
        
      
        
        Productlist.add(new Products(codigo, nombre, precio, descripcion,cantidad));
    }
     public static void DeleteProduct(int counter) {
        Productlist.removeIf(tempproduct -> tempproduct.getCodigo() == counter);
    }
}