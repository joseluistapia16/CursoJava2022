/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso2022_2.interfaces.domain;

import com.curso2022_2.domain.Docente;
import java.util.List;

/**
 *
 * @author josel
 */
public interface ImplDocente {
    public String create(Docente obj);
    public String update(Docente obj);
    public String delete(String cedula);
    public List<Docente> getAll();
    public Docente getOne(String cedula);
}
