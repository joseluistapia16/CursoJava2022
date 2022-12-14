/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.procesos;

import com.curso2022_2.domain.Empleado;
import com.curso2022_2.domain.Usuario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Procesos {

    public String valor;

    public String mensaje(String msg) {
        return msg;
    }

    public Empleado getOne(String id, List<Empleado> lista1) {
        Empleado obj = null;
        for (int i = 0; i < lista1.size(); i++) {
            if (id.equals(lista1.get(i).getCedula())) {
                obj = lista1.get(i);
                break;
            }
        }
        return obj;
    }

    public Empleado getOneL(String id, List<Empleado> lista) {
        Empleado obj = lista.stream()
                .filter(elem -> id.equals(elem.getCedula()))
                .findFirst().get();
        return obj;
    }

    public int getPosition(String id, List<Empleado> lista) {
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i).getCedula())) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int getUserPosition(String id, List<Usuario> lista) {
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i).getUsuario())) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public Usuario getUser(String user, List<Usuario> lista) {
        Usuario obj = lista.stream()
                .filter(elem -> user.equals(elem.getUsuario()))
                .findFirst().get();
        return obj;
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

    public static boolean getValidate(String arr[], String valor) {
        var res = false;
        for (int i = 0; i < arr.length; i++) {
            if (valor.equals(arr[i])) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static String getMsqlPath(String cadena) {
        String c1 = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '\\') {
                c1 = c1 + "\\\\";
            } else {
                c1 = c1 + cadena.charAt(i);
            }
        }
        return c1;
    }

}
