/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.service.impl;

import com.quintaelena.demo.entity.Programa;
import com.quintaelena.demo.repository.ProgramaRepository;
import com.quintaelena.demo.service.ProgramaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
public class ProgramaServiceImpl implements ProgramaService{
    
    @Autowired
    private ProgramaRepository employeeRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Programa> findAll() {
        return (List<Programa>) employeeRepository.findAll();
    }

    @Override
    public Programa findBy(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Programa save(Programa employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Programa employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
    
    
    
}
