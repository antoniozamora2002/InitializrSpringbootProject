/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author User
 */

@Data
@Entity
@Table(name = "taller_persona")
public class TallerPersona {
    
    @Id
    @Column(name = "tp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TPId;
    
    @Column(name = "tp_carrera")
    private String TPcarrera;
    
    @Column(name = "tp_ciclo")
    private String TPciclo;
    
    @ManyToOne
    @JoinColumn(name = "tall_id")
    private Taller taller;
    
    @ManyToOne
    @JoinColumn(name = "pers_id")
    private Persona persona;
    
}
