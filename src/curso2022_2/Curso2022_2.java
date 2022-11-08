/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso2022_2;

import com.curso2022_2.domain.Docente;
import com.curso2022_2.domain.Empleado;
import com.curso2022_2.domain.Persona;
import com.curso2022_2.domain.Usuario;
import com.curso2022_2.procesos.Inputs;
import com.curso2022_2.procesos.Procesos;
import com.curso2022_2.proyecto1.impl.Run;
import com.curso2022_2.views.Login;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

//Hola mundo soy Andy PILAY
//Soy Jose
// Asunto Arreglado
//Hola soy Isaac.
//hola soy jordan.
//hola soy franklin riofrio.
// HOLA SOY YO DE NUEVO JORDAN :)
// hola soy jesus por siacaso :3 wiiiiii si me salio 
// hola soy franklin de nuevo
//Hi soy Paulette <3
// Hello ingrese obj3 y obj4 - soy Alam
// Hola soy Emily Ortega :)
//hola a todos soy gabo salu2 
/**
 *
 * @author Usuario
 */
public class Curso2022_2 {

    static Inputs inp = new Inputs();

    static Scanner lec = new Scanner(System.in);
    static String nombre;
    static int numero;

    public static void main(String[] args) {
        var lg = new Login();
        lg.setVisible(true);
      //  var usu =  new Usuario("hdjdjd","Biggi","Ma","12345","vore@gmail.com");
        //System.out.println(usu.getData());
        //Procesos obj = new Procesos();

        //System.out.println(obj.mensaje("Curso java"));
        /*
        Double precio=0.0;
        var cantidad=0;
        nombre="Java";
       
        numero = 30;
        System.out.println(nombre+numero);
         */
        //eje18();
        var run = new Run();
       // run.inicio();
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
        HashMap<String, Integer> dic1 = new HashMap<String, Integer>();
        dic1.put("PORT", 3000);
        dic1.put("Valor", 200);
        dic1.put("mes", 10);
        System.out.println(dic1.get("mes"));
        for (Entry<String, Integer> entry : dic1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void eje12() {
        /*
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
        
        var obj4 = new Persona();
        obj4.setCedula("1307654321");
        obj4.setNombre("PABLO");
        obj4.setApellido("MARMOL");
        obj4.setSueldo(900.86);
        System.out.println(obj4.getData());
        
        var obj5 = new Persona();
        obj5.setCedula("0476589478");
        obj5.setNombre("Piero");
        obj5.setApellido("Fernandez");
        obj5.setSueldo(2000.75);
        System.out.println(obj5.getData());
         */
    }

    public static void eje14() {
        var obj1 = new Docente();
        obj1.setCedula("1234567890");
        obj1.setNombre("Piero");
        obj1.setApellido("Fernandez");
        obj1.setSueldo(2000.75);
        obj1.setHoras(8);
        obj1.setGestoria("PPP");
        System.out.println(obj1.getData());
        var obj2 = new Empleado();
        obj2.setCedula("0987654321");
        obj2.setNombre("PABLO");
        obj2.setApellido("MARMOL");
        obj2.setSueldo(900.86);
        obj2.setArea("SISTEMAS");
        obj2.setJornada("NOCTURNA");
        System.out.println(obj2.getData());
        var obj3 = new Docente("039386443", "HOMERO MIGUEL", "MACIAS DUARTE", 900.0, 4, "VINCULACION");
        System.out.println(obj3.getData());
        var obj4 = new Empleado("039386443", "MARIA JOSE", "ESCOBEDO PEÑA", 700.0, "CONTABILIDAD", "MATUTINA");
        System.out.println(obj4.getData());//bien
        var lista = Arrays.asList("C++", "Java", "Python", "PHP", "Kotlin");
        var msg = obj4.concat(lista);
        System.out.println(msg);

    }

    public static void eje15() {
        Docente docentes[] = new Docente[5];
        var obj1 = new Docente("12345", "MICHELLE", "LEON", 900.0, 10, "PPP");
        var obj2 = new Docente("09876", "LEONARDO", "RUIZ", 900.0, 10, "VINCULACION");
        var obj3 = new Docente("11223", "KEVIN", "LOPEZ", 900.0, 10, "INGLES");
        var obj4 = new Docente("11111", "RICARDO", "VANEGAS", 900.0, 10, "VINCULACION");
        var obj5 = new Docente("22222", "LAURA", "SOLIS", 900.0, 10, "INGLES");
        docentes[0] = obj1;
        docentes[1] = obj2;
        docentes[2] = obj3;
        docentes[3] = obj4;
        docentes[4] = obj5;
        for (int i = 0; i < docentes.length; i++) {
            System.out.println(docentes[i].getData());
        }
        System.out.println("**********");
        docentes[3] = new Docente("555555", "LOURDES", "PEÑA", 1900.0, 10, "VICERECTOR");
        for (int i = 0; i < docentes.length; i++) {
            System.out.println(docentes[i].getData());
        }
    }

    public static void eje16() {
        var lista = new ArrayList<Empleado>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingreso #"+(i+1));
            var cedula = inp.inputStr("Cedula:");
            var nombre = inp.inputStr("Nombres:");
            var apellido = inp.inputStr("Apellidos:");
            var sueldo = inp.inputDouble("Sueldo:");
            var turno = inp.inputStr("Turno:");
            var depar = inp.inputStr("Departamento:");
            var obj = new Empleado(cedula, nombre, apellido,
                    sueldo,  turno,depar);
            lista.add(obj);
        }      
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getInfoData());
        }
    }

    public static void eje17() {
        var num = inp.inputInt("ingrese un entero:");
        var nom = inp.inputStr("Ingrese su nombre:");
        var sueldo = inp.inputDouble("Sueldo:");
        System.out.println(nom + " " + sueldo);
    }
    
    public static void eje18(){
        var numero = inp.inputInt("Opcion:");
        switch(numero){
            case 1:
                   System.out.println("JAVA");
                   break;     
            case 2:
                  System.out.println("PYTHON");
                   break;
            case 3:
                  System.out.println("C++");
                   break;
           
            default : System.out.println("Nada");
        }
        
        
    }

}
