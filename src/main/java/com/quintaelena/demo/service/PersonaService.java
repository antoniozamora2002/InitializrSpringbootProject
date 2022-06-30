/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.quintaelena.demo.service;

import com.quintaelena.demo.entity.Persona;
import java.util.List;

/**
 *
 * @author 51950
 */
public interface PersonaService {

    public List<Persona> findAll();

    public Persona findById(Long id);

    public Persona save(Persona employee);

    public void delete(Persona employee);

    public void deleteById(Long id);
}
