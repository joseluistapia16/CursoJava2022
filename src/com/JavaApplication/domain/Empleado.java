/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.domain;

/**
 *
 * @author FRANKLIN RV
 */
public class Empleado extends Persona{
    private String usuario;
    private String contraseña;
    private String cargo;

    public Empleado( String cedula, String nombre, String apellido, String correo,String usuario, String contraseña, String cargo) {
        super(cedula, nombre, apellido, correo);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getData(){
        return super.getData()+" "+getUsuario()+" "+getContraseña()+" "+getCargo();
        
    }
    
        
    
}

    