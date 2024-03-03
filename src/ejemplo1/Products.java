/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author fjosu
 */
public class Products {
    private int codigo;
    private String nombre;
    private String precio;
    private String descripcion;
    private String cantidad;
    

    public Products(int codigo, String nombre, String precio,String descripcion,String cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        
    }
 /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the apellido to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the especialidad to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     /**
     * @return the contraseña
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the contraseña to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
