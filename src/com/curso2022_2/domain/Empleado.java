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
    private String turno;
    private String departamento;
    
    public Empleado(){}

    public Empleado(String turno, String departamento) {
        this.turno = turno;
        this.departamento = departamento;
    }

    public Empleado( String cedula, String nombre, String apellido, Double sueldo,String turno, String departamento) {
        super(cedula, nombre, apellido, sueldo);
        this.turno = turno;
        this.departamento = departamento;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getData() {
        return super.getData()+" "+getTurno()+" "+getDepartamento();
    }
    
    
    
    
    
    
}
