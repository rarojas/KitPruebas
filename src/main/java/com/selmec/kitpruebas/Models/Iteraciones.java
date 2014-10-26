package com.selmec.kitpruebas.Models;
// Generated Oct 26, 2014 4:12:39 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Iteraciones generated by hbm2java
 */
@Entity
@Table(name="iteraciones"
    ,catalog="kitpruebas"
)
public class Iteraciones  implements java.io.Serializable {


     private int id;
     private Lecturas lecturas;

    public Iteraciones() {
    }

    public Iteraciones(Lecturas lecturas) {
       this.lecturas = lecturas;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="lecturas"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Lecturas getLecturas() {
        return this.lecturas;
    }
    
    public void setLecturas(Lecturas lecturas) {
        this.lecturas = lecturas;
    }




}


