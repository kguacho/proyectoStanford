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
public class Informacion_laboral {
    private Integer codigo;
    private Boolean estado;
    private String nivel_relacion;
    private Boolean posgrado;
    private String sugerencias;
    private String razon;
    private Egresado egresado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNivel_relacion() {
        return nivel_relacion;
    }

    public void setNivel_relacion(String nivel_relacion) {
        this.nivel_relacion = nivel_relacion;
    }

    public Boolean getPosgrado() {
        return posgrado;
    }

    public void setPosgrado(Boolean posgrado) {
        this.posgrado = posgrado;
    }

    public String getSugerencias() {
        return sugerencias;
    }

    public void setSugerencias(String sugerencias) {
        this.sugerencias = sugerencias;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Informacion_laboral(Integer codigo, Boolean estado, String nivel_relacion, Boolean posgrado, String sugerencias, String razon, Egresado egresado) {
        this.codigo = codigo;
        this.estado = estado;
        this.nivel_relacion = nivel_relacion;
        this.posgrado = posgrado;
        this.sugerencias = sugerencias;
        this.razon = razon;
        this.egresado = egresado;
    }

    public Informacion_laboral() {
    }
    
}
