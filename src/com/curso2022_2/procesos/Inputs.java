/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.procesos;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class Inputs {

    Scanner lec = new Scanner(System.in);

    public Inputs() {
    }

    public Integer inputInt(String cadena) {
        var num = -1;
        do {
            try {
                System.out.print(cadena);
                num = Integer.parseInt(lec.nextLine());
            } catch (Exception e) {
                num = -1;
            }
        } while (num < 0);
        return num;
    }

    public Double inputDouble(String cadena) {
        var num = -1.0;
        do {
            try {
                System.out.print(cadena);
                num = Double.parseDouble(lec.nextLine());
            } catch (Exception e) {
                num = -1.0;
            }
        } while (num < 0);
        return num;
    }

    public String inputStr(String cadena) {
        var cad = "";
        System.out.print(cadena);
        cad = lec.nextLine();
        return cad;
    }

}
