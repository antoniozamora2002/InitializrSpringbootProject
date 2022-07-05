/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.quintaelena.demo.service;

import com.quintaelena.demo.entity.TallerPersona;
import java.util.List;

/**
 *
 * @author User
 */
public interface TpService {
    
    public List<TallerPersona> findAll();
    
    public TallerPersona findBy(Long id);
    
    public TallerPersona save(TallerPersona employee);
    
    public void delete(TallerPersona employee);
    
    public void deleteById(Long id);
    
}
