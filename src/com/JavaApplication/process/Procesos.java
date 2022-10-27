/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.process;

import com.JavaApplication.domain.Empleado;
import java.util.List;

/**
 *
 * @author FRANKLIN RV
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

    
}
