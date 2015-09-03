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
public class Egresado {
   private Integer codigo;
   private CEstudiante estudiante;
   private Modalidad modalidad;
   private Boolean estado;
   private Integer tiempo_trabajo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public CEstudiante getCEstudiante() {
        return estudiante;
    }

    public void setCEstudiante(CEstudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getTiempo_trabajo() {
        return tiempo_trabajo;
    }

    public void setTiempo_trabajo(Integer tiempo_trabajo) {
        this.tiempo_trabajo = tiempo_trabajo;
    }

    public Egresado(Integer codigo, CEstudiante estudiante, Modalidad modalidad, Boolean estado, Integer tiempo_trabajo) {
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.modalidad = modalidad;
        this.estado = estado;
        this.tiempo_trabajo = tiempo_trabajo;
    }

    public Egresado() {
    }
   
    
}
