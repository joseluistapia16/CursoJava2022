/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.domain;

import com.curso2022_2.interfaces.domain.Methods;
import com.sun.jdi.Method;
import java.util.List;

/**
 *
 * @author josel
 */
public class Docente extends Persona implements Methods{
    private int horas;
    private String gestoria;

    public Docente() {
    }

    public Docente(String cedula, String nombre, String apellido, Double sueldo,int horas, String gestoria) {
        super(cedula, nombre, apellido, sueldo);
        this.horas = horas;
        this.gestoria = gestoria;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGestoria() {
        return gestoria;
    }

    public void setGestoria(String gestoria) {
        this.gestoria = gestoria;
    }

    @Override
    public String getData() {
        return super.getData()+" "+getHoras()+" "+getGestoria(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String concatenar(List cadenas) {
        var msg="";
        for (int i = 0; i < cadenas.size(); i++) {
            msg = msg + cadenas.get(i)+"\n";
        }
        return msg;      
    }

    @Override
    public Docente getObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
