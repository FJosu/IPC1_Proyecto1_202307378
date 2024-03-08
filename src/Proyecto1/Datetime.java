/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author fjosu
 */
public class Datetime {
    private int codigo;

    private String hour;

    public Datetime(int codigo, String hour) {
        this.codigo = codigo;
        this.hour = hour;
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
     * @return the edad
     */
    public String getHora() {
        return hour;
    }

    /**
     * @param hour the edad to set
     */
    public void setHora(String hour) {
        this.hour = hour;
    }
}