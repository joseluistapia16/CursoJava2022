/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.domain;

/**
 *
 * @author FRANKLIN RV
 */
public class Cliente extends Persona{
    private String direccion;
    private String telefono;

    public Cliente( String cedula, String nombre, String apellido, String correo,String direccion, String telefono) {
        super(cedula, nombre, apellido, correo);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDataE(){
        return super.getData()+" "+getDireccion()+" "+getTelefono();
        
    }
    
    
}
