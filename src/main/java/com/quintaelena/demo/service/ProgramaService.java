package com.quintaelena.demo.service;

import com.quintaelena.demo.entity.Programa;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProgramaService {
    
    public List<Programa> findAll();
    
    public Programa findBy(Long id);
    
    public Programa save(Programa employee);
    
    public void delete(Programa employee);
    
    public void deleteById(Long id);
    
}
