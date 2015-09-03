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
public class Disponibilidad_laboral {
    private Integer codigo;
    private String area_trabajo;
    private Integer tiempo_trabajo;
    private Egresado egresado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getArea_trabajo() {
        return area_trabajo;
    }

    public void setArea_trabajo(String area_trabajo) {
        this.area_trabajo = area_trabajo;
    }

    public Integer getTiempo_trabajo() {
        return tiempo_trabajo;
    }

    public void setTiempo_trabajo(Integer tiempo_trabajo) {
        this.tiempo_trabajo = tiempo_trabajo;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Disponibilidad_laboral(Integer codigo, String area_trabajo, Integer tiempo_trabajo, Egresado egresado) {
        this.codigo = codigo;
        this.area_trabajo = area_trabajo;
        this.tiempo_trabajo = tiempo_trabajo;
        this.egresado = egresado;
    }

    public Disponibilidad_laboral() {
    }
    
    
}
