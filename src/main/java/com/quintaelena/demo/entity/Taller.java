/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author User
 */

@Data
@Entity
@Table(name = "taller")
public class Taller implements Serializable{
    
    @Id
    @Column(name = "tall_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tallId;

    @Column(name = "tall_term")
    private String tallTerm;

    @Column(name = "tall_date")
    private String tallDate;    //fecha del taller
    
    @Column(name = "tall_time")
    private String tallTime;    //hora del taller
    
    @Column(name = "tall_direrccio")
    private String tallDireccion;    //direccion del taller
    
    @Column(name = "tall_estado")
    private String tallEstado;    //Estado del taller
    
    @Column(name = "prog_id")
    private Long progId;
    
}
