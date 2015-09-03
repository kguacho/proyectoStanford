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
public class Encuesta {
    private Integer codigo;
    private Egresado egresado;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Encuesta(Integer codigo, Egresado egresado) {
        this.codigo = codigo;
        this.egresado = egresado;
    }

    public Encuesta() {
    }
    
}
