/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java2022_2.files;

import com.curso2022_2.domain.Usuario;
import com.curso2022_2.interfaces.ImplUsuario;
import com.curso2022_2.procesos.Procesos;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsersFiles implements ImplUsuario{
    String ruta = "C:\\Users\\sopor\\OneDrive\\Documentos\\NetBeansProjects\\Curso2022_2\\usuarios.json";
    List<Usuario> lista;
    Procesos proc;
    public UsersFiles() {
        lista = new ArrayList<>();
        proc= new Procesos();
    }

    @Override
    public String create(Usuario obj) {
        lista = getAll();
        lista.add(obj);
        var json = new Gson().toJson(lista);
        var res = "";
        try{
            var file = new FileWriter(ruta);
            file.write(json);
            file.flush();
            file.close();
            res = "Los datos han sido guardados!";
        }catch(Exception e){
            res = "Los datos no fueron guardados!";
        }
       return res;
    }

    @Override
    public String update(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario getOne(String user) {
        Usuario obj=null;
        try{
            lista = getAll();
            obj = proc.getUser(user, lista);
        }catch(Exception e){
            obj= null;
        }
        return obj;
    }

    @Override
    public Usuario getLogin(String user, String password) {
       Usuario obj=null;
       try{
           lista= getAll();
           for (int i = 0; i < lista.size(); i++) {
               if (user.equals(lista.get(i).getUsuario()) && password.equals(lista.get(i).getPassword())) {
                   obj= lista.get(i);
                   break;
               }
           }
       }catch(Exception e){
           obj=null;
       }
        return obj;
    }

    @Override
    public List<Usuario> getAll() {
      List<Usuario> lista1 = new ArrayList<>();
      String str="" , msg="";
      var doc = new File(ruta);
      var gson = new Gson();
        BufferedReader obj1;
        try{
            obj1 = new BufferedReader(new FileReader(doc));
            while((str= obj1.readLine())!=null){
                msg=msg + str;
            }
            lista1=gson.fromJson(msg, new TypeToken<List<Usuario>>(){              
            }.getType());
        } catch(Exception e){
            System.out.println("Error de lectura..");
        }
        return lista1;
 
    }
    
}
