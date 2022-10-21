/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java2022_2.files;

import com.curso2022_2.domain.Empleado;
import com.curso2022_2.interfaces.ImplEmplado;
import com.google.gson.Gson;
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
 * @author josel
 */
public class Archivo implements ImplEmplado{
    String ruta1 ="C:\\Proyecto\\Maestria\\mavenproject1\\Curso2022_2V2\\empleados.json";
    List<Empleado> lista_emp;

    public Archivo() {
        lista_emp = new ArrayList<>();
    }
    
    
    
    @Override
    public String create(Empleado obj) {
       lista_emp = getAll();
       var json = new Gson().toJson(lista_emp);
       var msg="";
       try{
           var file = new FileWriter(ruta1);
           file.write(msg);
           file.flush();
           file.close();
           msg="Los datos han sido guardados!";
       }catch(IOException e ){
           
       }
        return msg;     
    }

    @Override
    public String update(Empleado obj) {
       
        return null;
       
    }

    @Override
    public String delete(Empleado obj) {
     
        return null;
     
    }

    @Override
    public List<Empleado> getAll() {
        List<Empleado> lista = new ArrayList<>();
        String strng="",msg="";
        var doc = new File(ruta1);
        BufferedReader obj1=null;
        try{
            obj1 = new BufferedReader( new FileReader(doc));
            while((strng= obj1.readLine())!=null){
                msg = msg+ strng;
            }
            var gson = new Gson();
            lista=gson.fromJson(msg,new TypeToken<List<Empleado>>(){
            }.getType());     
        }catch(Exception e){
            System.out.println("Error");
        }       
        return lista;
    }

    @Override
    public Empleado getOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
