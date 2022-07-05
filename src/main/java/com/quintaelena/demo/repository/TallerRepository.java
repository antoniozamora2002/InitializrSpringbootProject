/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.quintaelena.demo.repository;

import com.quintaelena.demo.entity.Programa;
import com.quintaelena.demo.entity.Taller;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface TallerRepository extends CrudRepository<Taller, Long>{
    
    List<Programa> findByprograma(Long proId);
    
}
