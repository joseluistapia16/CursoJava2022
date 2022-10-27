/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaApplication.process;

import java.util.Scanner;

/**
 *
 * @author FRANKLIN RV
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
