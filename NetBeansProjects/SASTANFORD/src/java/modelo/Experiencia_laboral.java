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
public class Experiencia_laboral {
    private Integer codigo;
    private Integer tiempo;
    private String nombre_empresa;
    private String rol_desempeño;
    private Curriculum curriculum;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getRol_desempeño() {
        return rol_desempeño;
    }

    public void setRol_desempeño(String rol_desempeño) {
        this.rol_desempeño = rol_desempeño;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public Experiencia_laboral(Integer codigo, Integer tiempo, String nombre_empresa, String rol_desempeño, Curriculum curriculum) {
        this.codigo = codigo;
        this.tiempo = tiempo;
        this.nombre_empresa = nombre_empresa;
        this.rol_desempeño = rol_desempeño;
        this.curriculum = curriculum;
    }

    public Experiencia_laboral() {
    }
    
}
