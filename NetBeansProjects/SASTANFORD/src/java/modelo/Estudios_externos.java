/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author david_000
 */
public class Estudios_externos {
    private Integer codigo;
    private String tipo_estudio;
    private Double duracion ;
    private String documento;
    private Curriculum curriculum;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTipo_estudio() {
        return tipo_estudio;
    }

    public void setTipo_estudio(String tipo_estudio) {
        this.tipo_estudio = tipo_estudio;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public Estudios_externos(Integer codigo, String tipo_estudio, Double duracion, String documento, Curriculum curriculum) {
        this.codigo = codigo;
        this.tipo_estudio = tipo_estudio;
        this.duracion = duracion;
        this.documento = documento;
        this.curriculum = curriculum;
    }

    public Estudios_externos() {
    }
    
}
