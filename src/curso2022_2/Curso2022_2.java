/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2022_2;

import com.curso2022_2.domain.Persona;
import com.curso2022_2.procesos.Procesos;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

//Hola mundo soy Andy PILAY
// Hola soy Jose , soy de tu equipo.
//Hola soy Isaac.
//hola soy jordan.
//hola soy franklin.

/**
 *
 * @author Usuario
 */
public class Curso2022_2 {

    static Scanner lec = new Scanner(System.in);
    static String nombre;
    static int numero;

    public static void main(String[] args) {
        Procesos obj = new Procesos();

        //System.out.println(obj.mensaje("Curso java"));
        /*
        Double precio=0.0;
        var cantidad=0;
        nombre="Java";
       
        numero = 30;
        System.out.println(nombre+numero);
         */
        eje12();
    }

    private static void eje1() {
        final double pi = 3.1416;
        var cantidad = 78;
        nombre = "Andres";
        System.out.print("ingrese cantidad:");
        cantidad = lec.nextInt();
        System.out.print("ingrese nombre:");
        nombre = lec.next();
        System.out.println("Valor ingresado " + cantidad);
    }

    private static void eje3() {
        String nombre, materia;
        double n1, n2, n3, promedio;
        System.out.print("ingrese nombre estudiante:");
        nombre = lec.next();
        System.out.print("ingrese materia:");
        materia = lec.next();
        System.out.print("Nota 1:");
        n1 = lec.nextDouble();
        System.out.print("Nota 2:");
        n2 = lec.nextDouble();
        System.out.print("Nota 3:");
        n3 = lec.nextDouble();
        promedio = Procesos.getPromedio(n1, n2, n3);
        System.out.println("Promedio es:" + promedio);
        var msg = Procesos.getEstado(promedio);
        System.out.println(msg);
    }

    private static void eje4() {
        var edad = 0;
        System.out.print("Edad:");
        edad = lec.nextInt();
        var msg = Procesos.getEtapa(edad);
        System.out.println(msg);
    }

    private static void eje5() {
        String cliente, producto;
        double precio, iva, subtotal, total;
        int cantidad;
        System.out.print("Cliente:");
        cliente = lec.next();
        System.out.print("Producto:");
        producto = lec.next();
        System.out.print("Precio:");
        precio = lec.nextDouble();
        System.out.print("Cantidad:");
        cantidad = lec.nextInt();
        subtotal = Procesos.getSubtotal(precio, cantidad);
        iva = Procesos.getIva(subtotal);
        total = Procesos.getTotal(subtotal, iva);
        var msg = "";
        msg = "Subtotal:" + (Math.round(subtotal * 100.0) / 100.0) + "\nIva:" + (Math.round(iva * 100.0) / 100.0) + "\nTotal:" + (Math.round(total * 100.0) / 100.0);
        System.out.println(msg);
    }

    private static void eje6() {
        var i = 0;
        var con = 0;
        var ac = 0;
        while (i < 11) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
                con = con + 1;
                ac = ac + i;
            }

        }
        System.out.println("Total impares:" + con);
        System.out.println("Total acumulado:" + ac);
    }

    private static void eje7() {
        var ac = 0;
        var con = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                ac = ac + i;
                con++;
            }

        }
        System.out.println("Total pares:" + con);
        System.out.println("Total acumulado:" + ac);
    }

    private static void eje8() {
        var i = 0;
        var con = 0;
        var ac = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
                con++;
                ac = ac + i;
            }

        } while (i < 11);
        System.out.println("Total impares:" + con);
        System.out.println("Total acumulado:" + ac);
    }

    public static void eje9() {
        String nombres[] = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("ingrese un nombre " + (i + 1) + ":");
            var nom = lec.next().toUpperCase();
            var res = Procesos.getValidate(nombres, nom);
            if (res != true) {
                nombres[i] = nom.toUpperCase();
            } else {
                i--;
                System.out.println("Nombre ya existe!");
            }

        }
        Arrays.sort(nombres);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    public static void eje10() {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(6);
        numeros.add(11);
        numeros.add(20);
        numeros.add(50);
        numeros.set(1, 1000);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("Despues");
        numeros.remove(3);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        var res = numeros.contains(2090);
        var pos = numeros.indexOf(1000);
        System.out.println(res + " " + pos);
    }

    public static void eje11() {
      HashMap<String,Integer>dic1= new HashMap<String,Integer>();
      dic1.put("PORT", 3000);
      dic1.put("Valor", 200);
      dic1.put("mes", 10);
        System.out.println(dic1.get("mes"));
      for(Entry<String,Integer> entry : dic1.entrySet()){
          System.out.println(entry.getKey()+":"+entry.getValue());
      }
    }
    
    public static void eje12(){
        Persona obj = new Persona("1234567890", "JOSE LUIS", 
                "LOPEZ CASTRO",
                1200.0);
       obj.setNombre("Carlos Ronald");
        System.out.println(obj.getData());
        var obj1 = new Persona();
        obj1.setCedula("0987654321");
        obj1.setNombre("CARLOS ADOLFO");
        obj1.setApellido("LOOR  JIMENEZ");
        obj1.setSueldo(2000.56);
        System.out.println(obj1.getData());
        var obj2 = new Persona("039386443", "MARIA JOSE", "DUARTE");
        System.out.println(obj2.getData());
        //hola soy Alam.
        var obj3 = new Persona("2456953690", "DANNY E", "TOLEDO");
        obj3.setSueldo(1500.56);
        System.out.println(obj3.getData());        
    }
}
