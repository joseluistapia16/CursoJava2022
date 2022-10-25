/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.domain;

/**
 *
 * @author Usuario
 */
public class Usuario {
    
    private String usuario;
    private String password;
    private String nombres;
    private String apellidos;
    private String correo;

    public Usuario() {
    }

    public Usuario(String usuario, String password, String nombres, String apellidos, String correo) {
        this.usuario = usuario;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
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
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getData(){
        return getUsuario()+" "+getPassword()+" "+getNombres()
                +" "+getApellidos()+" "+getCorreo();
    }
    
    
}
