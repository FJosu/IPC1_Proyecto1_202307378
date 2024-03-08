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
import java.util.List;

public class ProductData {

    public static List<Products> Productlist = new ArrayList<>();
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
     
      public static List<Products> getListProduct() {
        return Productlist;
    }

    public static void updateProduct(Products product) {
    for (Products products : Productlist) {
        if (product.getCodigo() == product.getCodigo()) {
            product.setNombre(product.getNombre());
            product.setPrecio(product.getPrecio());
            product.setDescripcion(product.getDescripcion());
            product.setCantidad(product.getCantidad());
            
            break; // Salir del bucle una vez que se actualiza el doctor
        }
    }
}

    public static Products getProduct(int codigo) {
        for (Products product : Productlist) {
            if (product.getCodigo() == codigo) {
                return product;
            }
        }
        return null;

    }
   
}