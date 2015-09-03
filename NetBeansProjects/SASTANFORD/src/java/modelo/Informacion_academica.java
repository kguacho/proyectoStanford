/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author david_000
 */
public class Informacion_academica {
    private Integer codigo;
    private Integer carrera;
    private Date año_egresamiento;
    private String financiamiento;
    private Egresado egresado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCarrera() {
        return carrera;
    }

    public void setCarrera(Integer carrera) {
        this.carrera = carrera;
    }

    public Date getAño_egresamiento() {
        return año_egresamiento;
    }

    public void setAño_egresamiento(Date año_egresamiento) {
        this.año_egresamiento = año_egresamiento;
    }

    public String getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Informacion_academica(Integer codigo, Integer carrera, Date año_egresamiento, String financiamiento, Egresado egresado) {
        this.codigo = codigo;
        this.carrera = carrera;
        this.año_egresamiento = año_egresamiento;
        this.financiamiento = financiamiento;
        this.egresado = egresado;
    }

    public Informacion_academica() {
    }
    
}
