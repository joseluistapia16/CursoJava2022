/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.domain;

import com.curso2022_2.interfaces.Methods;
import java.util.List;

/**
 *
 * @author josel
 */
public class Empleado extends Persona implements Methods{

    private String area;
    private String jornada;

    public Empleado() {
    }

    public Empleado(String area) {
        this.area = area;
    }

    public Empleado(String nombre, String apellido, Double sueldo,String area, String jornada) {
        super(nombre, apellido, sueldo);
        this.area = area;
        this.jornada = jornada;
    }

    public Empleado(String cedula, String nombre, String apellido, Double sueldo, String area, String jornada) {
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
        return super.getData() + " " + getArea() + " " + getJornada();
    }

    @Override
    public String concat(List<String> lista) {
        var msg = "";
        for (int i = 0; i < lista.size(); i++) {
            msg = msg + lista.get(i) + " ";
        }
        return msg;

    }

    @Override
    public String getInfoData() {
        return super.getInfoData()+"\nArea:"+getArea()+"\nTurno:"+getJornada(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
