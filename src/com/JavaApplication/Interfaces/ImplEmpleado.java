/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.JavaApplication.Interfaces;

import com.JavaApplication.domain.Empleado;
import java.util.List;

/**
 *
 * @author FRANKLIN RV
 */
public interface ImplEmpleado {

    public String create(Empleado obj);

    public String update(Empleado obj);

    public String delete(String id);

    public List<Empleado> getAll();

    public Empleado getOne(String id);
    
    public Empleado getLogin(String user, String password);

}
