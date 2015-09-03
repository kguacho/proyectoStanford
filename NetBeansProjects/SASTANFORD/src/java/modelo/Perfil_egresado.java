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
public class Perfil_egresado {
    private Integer codigo;
    private String fortaleza;
    private String devilidad;
    private String sugerencia;
    private String modalidad;
    private Egresado egresado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(String fortaleza) {
        this.fortaleza = fortaleza;
    }

    public String getDevilidad() {
        return devilidad;
    }

    public void setDevilidad(String devilidad) {
        this.devilidad = devilidad;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Perfil_egresado(Integer codigo, String fortaleza, String devilidad, String sugerencia, String modalidad, Egresado egresado) {
        this.codigo = codigo;
        this.fortaleza = fortaleza;
        this.devilidad = devilidad;
        this.sugerencia = sugerencia;
        this.modalidad = modalidad;
        this.egresado = egresado;
    }

    public Perfil_egresado() {
    }
    
}
