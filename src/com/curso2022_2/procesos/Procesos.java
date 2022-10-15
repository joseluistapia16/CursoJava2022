/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.procesos;

/**
 *
 * @author Usuario
 */
public class Procesos {
    public  String valor;
    
    public String mensaje(String msg){
        return msg;
    }

    public static double getPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String getEstado(double promedio) {
        var estado = "";
        if (promedio < 7 && promedio >= 0) {
            estado = ("REPROBADO");
        }
        if (promedio >= 7 && promedio <= 10) {
            estado = ("APROBADO");
        }
        if (promedio < 0 || promedio > 10) {
            estado = ("VALOR INVALIDO");
        }
        return estado;
    }

    public static String getEtapa(int edad) {
        var res = "";
        if (edad >= 0 && edad < 11) {
            res = ("Infante.");
        }
        if (edad > 10 && edad < 18) {
            res = ("Adolescente.");
        }
        if (edad > 17 && edad < 26) {
            res = ("Joven");
        }
        if (edad > 25 && edad < 65) {
            res = ("Adulto");
        }
        if (edad > 64) {
            res = ("Adulto mayor.");
        }
        return res;
    }

    public static double getSubtotal(double precio, int cantidad) {
        return (precio * cantidad);
    }

    public static double getIva(double subtotal) {
        return (subtotal * 0.12);
    }

    public static double getTotal(double subtotal, double iva) {
        return (subtotal + iva);
    }
    
    public static boolean getValidate(String arr[],String valor){
        var res=false;
        for (int i = 0; i < arr.length; i++) {
            if (valor.equals(arr[i])) {
                res=true;
                break;
            }
        }
        return res;     
    }
    
}
