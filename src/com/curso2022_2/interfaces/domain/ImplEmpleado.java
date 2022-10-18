/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.interfaces.domain;

import com.curso2022_2.domain.Empleado;
import java.util.List;

/**
 *
 * @author josel
 */
public interface ImplEmpleado {

    public String create(Empleado obj);

    public String update(Empleado obj);

    public String delete(String cedula);

    public List<Empleado> getAll();

    public Empleado getOne(String cedula);
}
