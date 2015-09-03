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
public class Estudio {
    private Integer codigo;
    private String codigo_estudio;
    private Curriculum curriculum;
    private Date año_egresado;
    private String archivo_respaldo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigo_estudio() {
        return codigo_estudio;
    }

    public void setCodigo_estudio(String codigo_estudio) {
        this.codigo_estudio = codigo_estudio;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public Date getAño_egresado() {
        return año_egresado;
    }

    public void setAño_egresado(Date año_egresado) {
        this.año_egresado = año_egresado;
    }

    public String getArchivo_respaldo() {
        return archivo_respaldo;
    }

    public void setArchivo_respaldo(String archivo_respaldo) {
        this.archivo_respaldo = archivo_respaldo;
    }

    public Estudio(Integer codigo, String codigo_estudio, Curriculum curriculum, Date año_egresado, String archivo_respaldo) {
        this.codigo = codigo;
        this.codigo_estudio = codigo_estudio;
        this.curriculum = curriculum;
        this.año_egresado = año_egresado;
        this.archivo_respaldo = archivo_respaldo;
    }

    public Estudio() {
    }
    
}
