/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.proyecto1.impl;

import com.curso2022_2.domain.Empleado;
import com.curso2022_2.menu.Menu;
import com.curso2022_2.procesos.Inputs;
import com.curso2022_2.procesos.Procesos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josel
 */
public class Run {

    List<Empleado> lista = null;
    Inputs inp;
    Menu menu1;
    Procesos proc;

    public void inicio() {
        proc = new Procesos();
        inp = new Inputs();
        menu1 = new Menu();
        lista = new ArrayList<>();
        menu();
    }

    public void menu() {
        String opc[] = {"REGISTRAR", "CONSULTAR",
            "ACTUALIZAR", "ELIMINAR", "LISTAR", "SALIR"};
        var op = menu1.getMenu(opc);
        switch (op) {
            case 1:
                registro();
                menu();
                break;
            case 2:
                consultar();
                menu();
                break;
            case 5:
                listado();
                menu();
                break;
            case 6:
                System.out.println("Gracias..");
        }
    }

    private void registro() {
        var cedula = inp.inputStr("Cedula:");
        var nombre = inp.inputStr("Nombres:");
        var apellido = inp.inputStr("Apellidos:");
        var sueldo = inp.inputDouble("Sueldo:");
        var turno = inp.inputStr("Turno:");
        var departamento = inp.inputStr("Departamento:");
        var obj = new Empleado(cedula, nombre, apellido, sueldo, turno, departamento);
        lista.add(obj);
        inp.inputStr("<Enter>para continuar...");
    }
    
    private void consultar(){
        System.out.println("Consulta de empleados");
        var id = inp.inputStr("Cedula:");
        var obj= proc.getOneL(id, lista);
        if(obj!=null){
            System.out.println(obj.getInfoData());
        }else{
            System.out.println("Cedula no existe!!");
        }
        inp.inputStr("<Enter>para continuar");
    }

    private void listado() {
        System.out.println("Listado de empleados.");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getData());
        }
        inp.inputStr("<Enter>para continuar...");
    }

}
