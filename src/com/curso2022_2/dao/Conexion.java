/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2022_2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Conexion {

    Connection conect;

    public Connection conectar(String base) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            var path = "jdbc:mysql://localhost:3306/" + base;
            conect = DriverManager.getConnection(path, "root", "1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conect;

    }

//    public static void main(String[] args) {
//        var con = new Conexion();
//        System.out.println(con.conectar("cursojava"));
//    }

}
