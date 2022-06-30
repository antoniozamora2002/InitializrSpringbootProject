/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.quintaelena.demo.service;

import com.quintaelena.demo.entity.Taller;
import java.util.List;

/**
 *
 * @author User
 */
public interface TallerService {
    
    public List<Taller> findAll();
    
    public Taller findBy(Long id);
    
    public Taller save(Taller employee);
    
    public void delete(Taller employee);
    
    public void deleteById( Long id);
    
}
