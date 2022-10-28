/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.domain;

/**
 *
 * @author user
 */
public class Producto {
    private String nombreP;
    private String codigo;
    private Float valor;
    private String marca;
    private String color;

    public Producto(String nombreP, String codigo, Float valor, String marca, String color) {
        this.nombreP = nombreP;
        this.codigo = codigo;
        this.valor = valor;
        this.marca = marca;
        this.color = color;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getDataP(){
        
        return getNombreP()+" "+getCodigo()+" "+getValor()+" "+getMarca()+" "+getColor();
        
    }
    
    
}
