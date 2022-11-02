/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso2020_2.views.components;

import com.curso2022_2.domain.Docente;
import com.curso2022_2.domain.Usuario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class Tables {

    static DefaultTableModel model;

    public static DefaultTableModel emptyTable(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        return modelo;
    }

    public static void chargeTable(List<Usuario> lista1, JTable tabla) {
        int a[] = {40, 80, 80, 160};
        String column[] = {"USUARIO", "NOMBRES", "APELLIDOS", "CORREO"};
        var tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        model = emptyTable(tabla);
        String filas[] = new String[4];
        model = new DefaultTableModel(null, column);
        tabla.setShowGrid(true);
        for (int i = 0; i < lista1.size(); i++) {
            filas[0] = lista1.get(i).getUsuario();
            filas[1] = lista1.get(i).getNombres();
            filas[2] = lista1.get(i).getApellidos();
            filas[3] = lista1.get(i).getCorreo();
            model.addRow(filas);
            tabla.setModel(model);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
        }
    }

    public static void chargeDocenteTable(List<Docente> lista1, JTable tabla) {
        int a[] = {40, 80, 80, 160, 100};
        String column[] = {"CEDULA", "NOMBRES", "APELLIDOS", "HORAS", "GESTORIA"};
        var tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        model = emptyTable(tabla);
        String filas[] = new String[5];
        model = new DefaultTableModel(null, column);
        tabla.setShowGrid(true);
        for (int i = 0; i < lista1.size(); i++) {
            filas[0] = lista1.get(i).getCedula();
            filas[1] = lista1.get(i).getNombre();
            filas[2] = lista1.get(i).getApellido();
            filas[3] = "" + lista1.get(i).getHoras();
            filas[4] = lista1.get(i).getGestoria();
            model.addRow(filas);
            tabla.setModel(model);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(a[0]);
            tabla.getColumnModel().getColumn(0).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(a[1]);
            tabla.getColumnModel().getColumn(1).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(a[2]);
            tabla.getColumnModel().getColumn(2).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(a[3]);
            tabla.getColumnModel().getColumn(3).setCellRenderer(tcr);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(a[4]);
            tabla.getColumnModel().getColumn(4).setCellRenderer(tcr);
        }
    }

    public static void filter(String value, JTable tabla) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + value));
    }

}
