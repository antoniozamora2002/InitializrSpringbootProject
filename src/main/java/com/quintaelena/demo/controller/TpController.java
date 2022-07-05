/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.controller;

import com.quintaelena.demo.entity.TallerPersona;
import com.quintaelena.demo.service.TpService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */

@RestController
@RequestMapping("/tallerPersona")
public class TpController {
    
        @Autowired
    private TpService tpService;
    
    @GetMapping("/all")
    public List<TallerPersona> findAll(){
        return tpService.findAll();        
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TallerPersona> findById(@PathVariable Long id){    
        TallerPersona tallerPersona = tpService.findBy(id);
        return ResponseEntity.ok(tallerPersona);    
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        tpService.deleteById(id);
    }
    
    @PostMapping("/save")
    public TallerPersona save(@RequestBody TallerPersona tallerPersona){
        return tpService.save(tallerPersona);
    }
    
    @PutMapping("/update")
    public TallerPersona update(@RequestBody TallerPersona tallerPersona){
        return tpService.save(tallerPersona);
    }
    
}
