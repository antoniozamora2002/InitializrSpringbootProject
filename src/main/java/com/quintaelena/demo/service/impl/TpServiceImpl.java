/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.service.impl;

import com.quintaelena.demo.entity.TallerPersona;
import com.quintaelena.demo.repository.TpRepository;
import com.quintaelena.demo.service.TpService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class TpServiceImpl implements TpService{

    @Autowired
    private TpRepository employeeRepository;
    
    @Override
    public List<TallerPersona> findAll() {
        return (List<TallerPersona>) employeeRepository.findAll();
    }

    @Override
    public TallerPersona findBy(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public TallerPersona save(TallerPersona employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(TallerPersona employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
    
}
