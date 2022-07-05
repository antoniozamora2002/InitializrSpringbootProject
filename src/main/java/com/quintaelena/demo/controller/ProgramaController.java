package com.quintaelena.demo.controller;

import com.quintaelena.demo.entity.Programa;
import com.quintaelena.demo.service.ProgramaService;
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
@RequestMapping("/programa")
public class ProgramaController {    
    
    @Autowired
    private ProgramaService programaService;
    
    @GetMapping("/all")
    public List<Programa> findAll(){
        return programaService.findAll();        
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Programa> findById(@PathVariable Long id){    
        Programa programa = programaService.findBy(id);
        return ResponseEntity.ok(programa);    
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        programaService.deleteById(id);
    }
    
    @PostMapping("/save")
    public Programa save(@RequestBody Programa programa){
        return programaService.save(programa);
    }
    
    @PutMapping("/update")
    public Programa update(@RequestBody Programa programa){
        return programaService.save(programa);
    }
    
}

    

