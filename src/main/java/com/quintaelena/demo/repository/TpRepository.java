/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.quintaelena.demo.repository;

import com.quintaelena.demo.entity.TallerPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */

@Repository
public interface TpRepository extends CrudRepository<TallerPersona, Long>{
    
}
