/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.service.impl;

import com.quintaelena.demo.entity.Persona;
import com.quintaelena.demo.repository.PersonaRepository;
import com.quintaelena.demo.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 51950
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository employeeRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Persona> findAll() {
        return (List<Persona>) employeeRepository.findAll();
    }

    @Override
    public Persona findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Persona save(Persona employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Persona employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
