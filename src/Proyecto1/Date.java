/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author fjosu
 */
public class Date {
    private int codigo;
    private String descripcion;
    private String especialidad;
    private String doctor;
    private String fecha;
    private String hora;


    public Date(int codigo, String descripcion,String especialidad,String doctor,String fecha, String hora) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.especialidad = especialidad;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
    }
    /**
     * @return the codigo
     */
    public int getCodigo(){
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

 
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
     /**
     * @return the contraseña
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the contraseña to set
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
     /**
     * @return the telefono
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the telefono to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
     /**
     * @return the edad
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the edad to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
}
