/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.menu;

import com.curso2022_2.procesos.Inputs;

/**
 *
 * @author josel
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
            
        } while (op <1 || op > opc.length);
        return op;
    }

}
