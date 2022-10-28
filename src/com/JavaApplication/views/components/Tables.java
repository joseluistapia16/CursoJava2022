/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.views.components;

import com.JavaApplication.domain.Producto;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Tables {
   
    public static DefaultTableModel emptyTable(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        return modelo;
    }
    
    public static void chargeTable(List<Producto> lista,JTable tabla){
        
    }
}
