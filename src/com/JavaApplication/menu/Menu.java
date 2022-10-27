/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.menu;

import com.JavaApplication.process.Inputs;

/**
 *
 * @author FRANKLIN RV
 */
public class Menu {
    
    Inputs inp;

    public Menu() {
        inp = new Inputs();
    }

    public int getMenu(String opc[]) {
        var op = 0;
        for (int i = 0; i < opc.length; i++) {
            System.out.println((i + 1) + ".- " + opc[i] + ".");
        }
        do {
            op = inp.inputInt("ingrese una opcion[1.."
                    + opc.length + "]:");

        } while (op < 1 || op > opc.length);
        return op;
    }
}
