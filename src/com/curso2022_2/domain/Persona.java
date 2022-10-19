/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.domain;

/**
 *
 * @author Usuario
 */
abstract public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private Double sueldo;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, Double sueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getData() {
        // cambio
        if (this.sueldo == null) {
            this.sueldo = 0.0;
        }
        return this.cedula + " " + this.nombre + " "
                + this.apellido + " " + this.sueldo;
    }

    public String getInfoData() {
        // cambio
        if (this.sueldo == null) {
            this.sueldo = 0.0;
        }
        return "Cedula:"+this.cedula + "\nNombres:" + this.nombre + "\nApellidos:"
                + this.apellido + "\nSueldo:" + this.sueldo;
    }
}
