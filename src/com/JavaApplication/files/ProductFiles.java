/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.files;

import com.JavaApplication.Interfaces.ImplProducto;
import com.JavaApplication.domain.Producto;
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
public class ProductFiles implements ImplProducto{
    String ruta = "C:\\Users\\Gigabyte\\Desktop\\ESTUDIOS DE FRANKLIN\\Java\\java\\Resgistoproducto.json";
    List<Producto> lista_prod;
    Procesos proc;
    
    public ProductFiles(){
        lista_prod = new ArrayList<>();
        proc = new Procesos();
    }
    
    @Override
    public String create(Producto obj) {
       lista_prod = getAll();
        lista_prod.add(obj);
        var json = new Gson().toJson(lista_prod);
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
    public String update(Producto obj) {
        lista_prod = getAll();
        var res = "";
        var pos = proc.getPositionP(obj.getCodigo(), lista_prod);
        if (pos < 0) {
            res = "Cedula no Existe!";
        } else {
            lista_prod = getAll();
            lista_prod.set(pos, obj);
            var json = new Gson().toJson(lista_prod);
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
    public String delete(String codigo) {
        lista_prod = getAll();
        var res = "";
        var pos = proc.getPositionP(codigo,lista_prod);
        if (pos < 0) {
            res = "Ceodigo no Existe!";
        } else {
            lista_prod = getAll();
            lista_prod.remove(pos);
            var json = new Gson().toJson(lista_prod);
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
    public List<Producto> getAll() {
       List<Producto> lista = new ArrayList<>();
        String strng = "", msg = "";
        var doc = new File(ruta);
        var gson = new Gson();
        BufferedReader obj1 = null;
        try {
            obj1 = new BufferedReader(new FileReader(doc));
            while ((strng = obj1.readLine()) != null) {
                msg = msg + strng;
            }
            lista = gson.fromJson(msg, new TypeToken<List<Producto>>() {
            }.getType());
        } catch (JsonSyntaxException | IOException e) {
            System.out.println("Error");
        }
        return lista;
    }

    @Override
    public Producto getOne(String codigo) {
       Producto obj = null;
        try {
            lista_prod = getAll();
            obj = proc.getOneP(codigo, lista_prod);
        } catch (Exception e) {
            obj = null;
        }
        return obj;
    }
}

    