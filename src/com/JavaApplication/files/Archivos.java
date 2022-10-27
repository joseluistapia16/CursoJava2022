/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.files;

import com.JavaApplication.Interfaces.ImplEmpleado;
import com.JavaApplication.domain.Empleado;
import com.JavaApplication.process.Procesos;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANKLIN RV
 */
public class Archivos implements ImplEmpleado {

    String ruta = "C:\\Users\\LAPTOP-HP\\Documents\\NetBeansProjects\\java\\prueba.json";
    List<Empleado> lista_emp;
    Procesos proc;

    public Archivos() {
        lista_emp = new ArrayList<>();
        proc = new Procesos();
    }

    @Override
    public String create(Empleado obj) {
        lista_emp = getAll();
        lista_emp.add(obj);
        var json = new Gson().toJson(lista_emp);
        var msg = "";
        try {
            try (java.io.FileWriter file = new FileWriter(ruta)) {
                file.write(json);
                file.flush();
            }
            msg = "Los datos han sido guardados!";
        } catch (IOException e) {
            msg = "Los datos NO han sido guardados!";
            //Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
        }
        return msg;
    }

    @Override
    public String update(Empleado obj) {
        lista_emp = getAll();
        var res = "";
        var pos = proc.getPosition(obj.getCedula(), lista_emp);
        if (pos < 0) {
            res = "Cedula no Existe!";
        } else {
            lista_emp = getAll();
            lista_emp.set(pos, obj);
            var json = new Gson().toJson(lista_emp);
            try {
                try (java.io.FileWriter files = new FileWriter(ruta)) {
                    files.write(json);
                    files.flush();
                }
                res = "Los datos han sido actualizados!";
            } catch (IOException e) {
                res = "Los datos no han sido actualizados!";
            }
        }
        return res;

    }

    @Override
    public String delete(String id) {
        lista_emp = getAll();
        var res = "";
        var pos = proc.getPosition(id, lista_emp);
        if (pos < 0) {
            res = "Cedula no Existe!";
        } else {
            lista_emp = getAll();
            lista_emp.remove(pos);
            var json = new Gson().toJson(lista_emp);
            try {
                var files = new FileWriter(ruta);
                files.write(json);
                files.flush();
                files.close();
                res = "Los datos han sido eliminados!";
            } catch (Exception e) {
                res = "Los datos no han sido eliminados!";
            }
        }
        return res;
    }

    @Override
    public List<Empleado> getAll() {
        List<Empleado> lista = new ArrayList<>();
        String strng = "", msg = "";
        var doc = new File(ruta);
        var gson = new Gson();
        BufferedReader obj1 = null;
        try {
            obj1 = new BufferedReader(new FileReader(doc));
            while ((strng = obj1.readLine()) != null) {
                msg = msg + strng;
            }
            lista = gson.fromJson(msg, new TypeToken<List<Empleado>>() {
            }.getType());
        } catch (JsonSyntaxException | IOException e) {
            System.out.println("Error");
        }
        return lista;
    }

    @Override
    public Empleado getOne(String id) {
        Empleado obj = null;
        try {
            lista_emp = getAll();
            obj = proc.getOne(id, lista_emp);
        } catch (Exception e) {
            obj = null;
        }
        return obj;
    }
}
