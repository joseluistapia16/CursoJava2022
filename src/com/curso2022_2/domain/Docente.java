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
public class Docente extends Persona implements Methods {

    private String idUsuario;
    private int horas;
    private String gestoria;
    private String estado;
    private String imagen;

    public Docente() {

    }

    public Docente(String cedula, String nombre, String apellido, Double sueldo, int horas, String gestoria) {
        super(cedula, nombre, apellido, sueldo);
        this.horas = horas;
        this.gestoria = gestoria;
    }
    



  

    public Docente(String cedula, String idUsuario, String nombre, String apellido, Double sueldo, int horas, String gestoria, String estado,
            String imagen) {
        super(cedula, nombre, apellido, sueldo);
        this.idUsuario = idUsuario;
        this.horas = horas;
        this.gestoria = gestoria;
        this.estado = estado;
        this.imagen= imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    

    @Override
    public String getData() {
        return super.getData() + " " + getHoras() + " " + getGestoria(); //To change body of generated methods, choose Tools | Templates.
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
