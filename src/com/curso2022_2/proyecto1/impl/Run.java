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
import com.java2022_2.files.Archivo;
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
    Archivo arch;
    
    public Run(){
        proc = new Procesos();
        inp = new Inputs();
        arch = new Archivo();
        menu1 = new Menu();
        lista = arch.getAll();
        
    }

    public void inicio() {
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
            case 3:
                actualizar();
                menu();
                break;
            case 4:
                eliminar();
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
        lista = arch.getAll();
        var ob = arch.getOne(cedula);
        if (ob == null){
        var nombre = inp.inputStr("Nombres:");
        var apellido = inp.inputStr("Apellidos:");
        var sueldo = inp.inputDouble("Sueldo:");
        var turno = inp.inputStr("Turno:");
        var departamento = inp.inputStr("Departamento:");
        var obj = new Empleado(cedula, nombre, apellido, sueldo, turno, departamento);
        var msg = arch.create(obj);
        System.out.println(msg);
        }else {
            System.out.println("Cedula ya existe!");
        }
        inp.inputStr("<Enter>para continuar...");
    }

    private void consultar() {
        System.out.println("Consulta de empleados");
        var id = inp.inputStr("Cedula:");
        var obj = arch.getOne(id);
        if (obj != null) {
            System.out.println(obj.getInfoData());
        } else {
            System.out.println("Cedula no existe!!");
        }
        inp.inputStr("<Enter>para continuar");
    }

    private void actualizar() {
        lista = arch.getAll();
        System.out.println("Actualizacion de datos");
        var id = inp.inputStr("Cedula:");
        var pos = proc.getPosition(id, lista);
        if (pos != -1) {
            System.out.println(lista.get(pos).getInfoData());
            var nombre = inp.inputStr("Nombres:");
            var apellido = inp.inputStr("Apellidos:");
            var sueldo = inp.inputDouble("Sueldo:");
            var turno = inp.inputStr("Turno:");
            var departamento = inp.inputStr("Departamento:");
            var obj1 = new Empleado(nombre, apellido, sueldo, turno, departamento);
            obj1.setCedula(id);
            var msg = arch.update(obj1);
            System.out.println(msg);
        } else {
            System.out.println("Empleado no existe!");
        }
        inp.inputStr("<Enter>para continuar...");
    }

    private void eliminar() {
        System.out.println("Eliminacion de Empleados");
        var id = inp.inputStr("Cedula:");
        var pos = proc.getPosition(id, lista);
        if (pos != -1) {
            System.out.println(lista.get(pos).getInfoData());
            var res = arch.delete(id);
            System.out.println(res);
        }else{
            System.out.println("Cedula no existe!");
        }
        inp.inputStr("<Enter>para continuar...");
    }

    private void listado() {
        lista = arch.getAll();
        System.out.println("Listado de empleados.");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getData());
        }
        inp.inputStr("<Enter>para continuar...");
    }

}
