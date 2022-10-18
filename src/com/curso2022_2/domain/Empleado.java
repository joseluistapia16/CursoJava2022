/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.domain;

/**
 *
 * @author josel
 */
public class Empleado extends Persona{
    
    private String area;
    private String jornada;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String apellido, Double sueldo,String area, String jornada) {
        super(cedula, nombre, apellido, sueldo);
        this.area = area;
        this.jornada = jornada;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String getData() {
        return super.getData()+" "+getArea()+" "+getJornada();
    }
    
    
    
    
    
}
