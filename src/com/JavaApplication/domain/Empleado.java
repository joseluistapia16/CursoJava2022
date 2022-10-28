/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 **/
package com.JavaApplication.domain;

import com.JavaApplication.Interfaces.Methodss;
import java.util.List;

/**
 *
 * @author FRANKLIN RV
 */
public class Empleado extends Persona implements Methodss {
    private String usuario;
    private String cargo;
    private String password;

    public Empleado() {
    }
    
    public Empleado( String cedula, String nombre, String apellido, String correo,String usuario,String password, String cargo) {
        super(cedula, nombre, apellido, correo);
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.usuario = password;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String getData(){
        return super.getData()+" "+getUsuario()+" "+getPassword()+" "+getCargo();
        
    }

    @Override
    public String concat(List<String> lista) {
        var msg = "";
        for (int i = 0; i < lista.size(); i++) {
            msg = msg + lista.get(i) + " ";
        }
        return msg;

    }
    
        
    
}

    