/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.dao;

import com.curso2022_2.domain.Docente;
import com.curso2022_2.domain.Usuario;
import com.curso2022_2.interfaces.ImplDocente;
import com.java2022_2.files.UsersFiles;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class CrudDocente implements ImplDocente {

    String base = "cursojava";
    Conexion con = null;
    Connection cone = null;
    ResultSet rs = null;
    java.sql.Statement st = null;

    public CrudDocente() {
        con = new Conexion();
    }

    @Override
    public String create(Docente obj) {
        var msg = "";
        try {
            var sql = "insert into docente(cedula,idUsuario,nombres,apellidos,sueldo,horas,gestoria,estado)"
                    + " values(?,?,?,?,?,?,?,?)";
            cone = con.conectar(base);
            PreparedStatement smt = cone.prepareStatement(sql);
            smt.setString(1, obj.getCedula());
            smt.setString(2, obj.getIdUsuario());
            smt.setString(3, obj.getNombre());
            smt.setDouble(5, obj.getHoras());
            smt.setInt(6, obj.getHoras());
            smt.setString(7, obj.getGestoria());
            smt.setString(8, obj.getEstado());
            var filas = smt.executeUpdate();
            if (filas > 0) {
                msg = "Sus datos han sido grabados con exito!";
            } else {
                msg = "Sus datos no fueron grabados!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }

    @Override
    public String update(Docente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(Docente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Docente> getAll(Docente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Docente getOne(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void saveJsontoTable(String campos, List<Usuario> lista) {
        var script = "";
        try {
            cone = con.conectar(base);
            st = cone.createStatement();
            for (int i = 0; i < lista.size(); i++) {
                script = "insert into usuarios(" + campos + ") "
                        + "values('" + lista.get(i).getUsuario() + "','"
                        + lista.get(i).getPassword() + "','"
                        + lista.get(i).getNombres() + "','"
                        + lista.get(i).getApellidos() + "','"
                        + lista.get(i).getCorreo()+"','A')";                   
               st.executeUpdate(script);
            }
             
            cone.close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(script);
    }
    

    public static void main(String[] args) {
        var obj = new CrudDocente();
        var arch = new UsersFiles();
        var lista = arch.getAll();
        for (int i = 0; i < lista.size(); i++) {
           // System.out.println(lista.get(i).getData());
        }
        System.out.println("***************");
        obj.saveJsontoTable("usuario,password,nombres,apellidos,correo,estado", lista);
    }

}
