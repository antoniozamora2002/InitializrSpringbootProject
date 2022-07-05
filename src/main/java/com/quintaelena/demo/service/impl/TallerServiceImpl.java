/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.service.impl;

import com.quintaelena.demo.entity.Taller;
import com.quintaelena.demo.repository.TallerRepository;
import com.quintaelena.demo.service.TallerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Service
public class TallerServiceImpl implements TallerService{

    @Autowired
    private TallerRepository employeeRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Taller> findAll() {
        return (List<Taller>) employeeRepository.findAll();
    }

    @Override
    public Taller findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Taller save(Taller employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Taller employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
