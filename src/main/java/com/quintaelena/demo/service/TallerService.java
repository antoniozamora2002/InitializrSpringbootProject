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
