package com.selmec.kitpruebas.Models;
// Generated Oct 26, 2014 8:36:36 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Prueba generated by hbm2java
 */
@Entity
@Table(name = "prueba", catalog = "kitpruebas"
)
//@Inheritance(strategy = InheritanceType.JOINED)
public class Prueba implements java.io.Serializable {

    private Integer id;
    private Ensamble ensamble;
    private Incidencias incidencias;
    private int tipo;
    private int estatus;
    private Date dtInicio;
    private Date dtFin;
    private String comentario;
    private Integer aprueba;
    private Date dtAprueba;
    private Integer apruebaSupervisor;
    private Date dtApruebaSupervisor;
    private Vacio vacio;
    private Instalacion instalacion;
    private Arranque arranque;
    private Set lecturases = new HashSet(0);

    public Prueba() {
    }

    public Prueba(Ensamble ensamble, int tipo, int estatus, Date dtInicio, Date dtFin) {
        this.ensamble = ensamble;
        this.tipo = tipo;
        this.estatus = estatus;
        this.dtInicio = dtInicio;
        this.dtFin = dtFin;
    }

    public Prueba(Ensamble ensamble, Incidencias incidencias, int tipo, int estatus, Date dtInicio, Date dtFin, String comentario, Integer aprueba, Date dtAprueba, Integer apruebaSupervisor, Date dtApruebaSupervisor, Vacio vacio, Instalacion instalacion, Arranque arranque, Set lecturases) {
        this.ensamble = ensamble;
        this.incidencias = incidencias;
        this.tipo = tipo;
        this.estatus = estatus;
        this.dtInicio = dtInicio;
        this.dtFin = dtFin;
        this.comentario = comentario;
        this.aprueba = aprueba;
        this.dtAprueba = dtAprueba;
        this.apruebaSupervisor = apruebaSupervisor;
        this.dtApruebaSupervisor = dtApruebaSupervisor;
        this.vacio = vacio;
        this.instalacion = instalacion;
        this.arranque = arranque;
        this.lecturases = lecturases;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "ID", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EnsambleID", nullable = false)
    public Ensamble getEnsamble() {
        return this.ensamble;
    }

    public void setEnsamble(Ensamble ensamble) {
        this.ensamble = ensamble;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IncidenciaID")
    public Incidencias getIncidencias() {
        return this.incidencias;
    }

    public void setIncidencias(Incidencias incidencias) {
        this.incidencias = incidencias;
    }

    @Column(name = "Tipo", nullable = false)
    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Column(name = "Estatus", nullable = false)
    public int getEstatus() {
        return this.estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtInicio", nullable = false, length = 19)
    public Date getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtFin", nullable = false, length = 19)
    public Date getDtFin() {
        return this.dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    @Column(name = "Comentario", length = 250)
    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Column(name = "Aprueba")
    public Integer getAprueba() {
        return this.aprueba;
    }

    public void setAprueba(Integer aprueba) {
        this.aprueba = aprueba;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtAprueba", length = 19)
    public Date getDtAprueba() {
        return this.dtAprueba;
    }

    public void setDtAprueba(Date dtAprueba) {
        this.dtAprueba = dtAprueba;
    }

    @Column(name = "ApruebaSupervisor")
    public Integer getApruebaSupervisor() {
        return this.apruebaSupervisor;
    }

    public void setApruebaSupervisor(Integer apruebaSupervisor) {
        this.apruebaSupervisor = apruebaSupervisor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtApruebaSupervisor", length = 19)
    public Date getDtApruebaSupervisor() {
        return this.dtApruebaSupervisor;
    }

    public void setDtApruebaSupervisor(Date dtApruebaSupervisor) {
        this.dtApruebaSupervisor = dtApruebaSupervisor;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "prueba")
    public Vacio getVacio() {
        return this.vacio;
    }

    public void setVacio(Vacio vacio) {
        this.vacio = vacio;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "prueba")
    public Instalacion getInstalacion() {
        return this.instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "prueba")
    public Arranque getArranque() {
        return this.arranque;
    }

    public void setArranque(Arranque arranque) {
        this.arranque = arranque;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "prueba")
    public Set getLecturases() {
        return this.lecturases;
    }

    public void setLecturases(Set lecturases) {
        this.lecturases = lecturases;
    }

}
