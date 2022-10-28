/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.JavaApplication.Interfaces;

import com.JavaApplication.domain.Producto;
import java.util.List;

/**
 *
 * @author FRANKLIN RV
 */
public interface ImplProducto {
     public String create(Producto obj);

    public String update(Producto obj);

    public String delete(String codigo);

    public List<Producto> getAll();

    public Producto getOne(String codigo);
   
    
}
