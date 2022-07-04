/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.service.impl;

import com.quintaelena.demo.entity.User;
import com.quintaelena.demo.repository.UserRepository;
import com.quintaelena.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository employeeRepository;
    
    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return (List<User>) employeeRepository.findAll();
    }

    @Override
    public User findBy(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(User employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteBy(Long id) {
        employeeRepository.deleteById(id);
    }
    
}
