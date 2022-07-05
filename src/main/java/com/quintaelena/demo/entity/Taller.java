/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quintaelena.demo.entity;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.print.attribute.standard.MediaSize;
import lombok.Data;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.format.annotation.DateTimeFormat;

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
    private String tallDate;
    
    /*@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "tall_date")
    @NotNull
    private Date tallDate;    //fecha del taller*/
    
    @Column(name = "tall_time")
    private String tallTime;    //hora del taller
    
    @Column(name = "tall_direrccio")
    private String tallDireccion;    //direccion del taller
    
    @Column(name = "tall_estado")
    private String tallEstado;    //Estado del taller

    @ManyToOne
    @JoinColumn(name = "prog_id")
    private Programa programa;
    
}
