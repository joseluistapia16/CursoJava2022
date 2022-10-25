/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.curso2022_2.interfaces;

import com.curso2022_2.domain.Usuario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ImplUsuario {    
    public String create(Usuario obj);
    public String update(Usuario obj);
    public String delete(String user);
    public Usuario getOne(String user);
    public Usuario getLogin(String user, String password);
    public List<Usuario> getAll();   
}
