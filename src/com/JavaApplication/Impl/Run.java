/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.Impl;

import com.JavaApplication.domain.Empleado;
import com.JavaApplication.menu.Menu;
import com.JavaApplication.process.Inputs;
import com.JavaApplication.process.Procesos;
import com.JavaApplication.files.Archivos;
import java.util.List;

/**
 *
 * @author FRANKLIN RV
 */
public class Run {
    
    List<Empleado> lista = null;
    Inputs inp;
    Menu menu1;
    Procesos proc;
    Archivos arch;
    
    public Run(){
        proc = new Procesos();
        inp = new Inputs();
        arch = new Archivos();
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
        var correo = inp.inputStr("Correo:");
        var usuario = inp.inputStr("Usuario:");
        var cargo= inp.inputStr("Cargo:");
        var obj = new Empleado(cedula, nombre, apellido,usuario,correo ,cargo);
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
            System.out.println(obj.getData());
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
            System.out.println(lista.get(pos).getData());
            var nombre = inp.inputStr("Nombres:");
            var apellido = inp.inputStr("Apellidos:");
            var correo = inp.inputStr("Correo:");
            var usuario = inp.inputStr("Usuario:");
            var cargo = inp.inputStr("Cargo:");
            var obj1 = new Empleado(id,nombre, apellido, correo, usuario, cargo);
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
            System.out.println(lista.get(pos).getData());
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
