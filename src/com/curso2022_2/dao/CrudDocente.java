/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.dao;

import com.curso2022_2.domain.Docente;
import com.curso2022_2.domain.Usuario;
import com.curso2022_2.interfaces.ImplDocente;
import com.java2022_2.files.UsersFiles;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;

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
            var sql = "insert into docente(cedula,idUsuario,nombres,apellidos,sueldo,horas,gestoria,estado,imagen)"
                    + " values(?,?,?,?,?,?,?,?,?)";
            cone = con.conectar(base);
            PreparedStatement smt = cone.prepareStatement(sql);
            smt.setString(1, obj.getCedula());
            smt.setString(2, obj.getIdUsuario());
            smt.setString(3, obj.getNombre());
            smt.setString(4, obj.getApellido());
            smt.setDouble(5, obj.getSueldo());
            smt.setInt(6, obj.getHoras());
            smt.setString(7, obj.getGestoria());
            smt.setString(8, obj.getEstado());
            smt.setString(9, obj.getImagen());
            var filas = smt.executeUpdate();
            cone.close();
            if (filas > 0) {
                msg = "Sus datos han sido grabados con exito!";
            }
        } catch (SQLException ex) {
            msg = "" + ex;
            //Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }

    @Override
    public String update(Docente obj) {
        var msg = "";
        try {
            var script = "update docente set nombres=?,apellidos=?, sueldo=?,horas=?,"
                    + "gestoria=?,imagen=? where cedula=?";
            cone = con.conectar(base);
            PreparedStatement prd = cone.prepareStatement(script);
            prd.setString(1, obj.getNombre());
            prd.setString(2, obj.getApellido());
            prd.setDouble(3, obj.getSueldo());
            prd.setInt(4, obj.getHoras());
            prd.setString(5, obj.getGestoria());
            prd.setString(6, obj.getImagen());
            prd.setString(7, obj.getCedula());
            var rows = prd.executeUpdate();
            cone.close();
            if (rows > 0) {
                msg = "Los datos han sido actualizados!";
            } else {
                msg = "Los datos no han sido actualizados!";
            }
        } catch (SQLException ex) {

            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;
    }

    @Override
    public String delete(String id) {
        var msg = "";
        try {
            var script = "update docente set estado='I' where cedula=?";
            cone = con.conectar(base);
            PreparedStatement prd = cone.prepareStatement(script);
            prd.setString(1, id);
            var rows = prd.executeUpdate();
            cone.close();
            if (rows > 0) {
                msg = "El registro ha sido eliminado!";
            } else {
                msg = "El registro no ha sido eliminado!";
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msg;

    }

    @Override
    public List<Docente> getAll() {
        List<Docente> lista1 = new ArrayList<>();
        try {
            var query = "select * from docente where estado='A' order by apellidos";
            cone = con.conectar(base);
            Statement read = cone.createStatement();
            rs = read.executeQuery(query);
            while (rs.next()) {
                var obj1 = new Docente(rs.getString("cedula"),
                        rs.getString("idUsuario"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getDouble("sueldo"),
                        rs.getInt("horas"),
                        rs.getString("gestoria"),
                        rs.getString("estado"),rs.getString("imagen")
                );
                lista1.add(obj1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista1;
    }

    @Override
    public Docente getOne(String id) {
        Docente obj = null;
        try {
            var query = "select * from docente where cedula=?";
            cone = con.conectar(base);
            PreparedStatement read = cone.prepareStatement(query);
            read.setString(1, id);
            rs = read.executeQuery();
            while (rs.next()) {
                obj = new Docente(rs.getString("cedula"),
                        rs.getString("idUsuario"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getDouble("sueldo"),
                        rs.getInt("horas"),
                        rs.getString("gestoria"),
                        rs.getString("estado"),
                        rs.getString("imaagen")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return obj;
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
                        + lista.get(i).getCorreo() + "','A')";
                st.executeUpdate(script);
            }

            cone.close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(script);
    }

    public static void main(String[] args) {
//        var obj = new CrudDocente();
//        var arch = new UsersFiles();
//        var lista = arch.getAll();
//        for (int i = 0; i < lista.size(); i++) {
//            // System.out.println(lista.get(i).getData());
//        }
//        System.out.println("***************");
//        obj.saveJsontoTable("usuario,password,nombres,apellidos,correo,estado", lista);
        var crud = new CrudDocente();
        var obj = new Docente("098451133",
                "vivi1200",
                "JOSE LUIS",
                "PILAY COFRE",
                800.0,
                70,
                "DESARROLLO", "A","C:\\Users\\sopor\\Downloads\\java.jpg"
        );
        //var resp = crud.create(obj);
        //var resp= crud.update(obj);
        //var resp = crud.delete("123451133");
        obj = crud.getOne("093452244");
        if (obj!=null) {
             System.out.println(obj.getData());
        }
        var lista = crud.getAll();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getData());
        }
        //System.out.println(resp);
    }

}
