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
public class Tiempo_trabajo {
    private Integer codigo;
    private Integer tiempo;

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

    public Tiempo_trabajo(Integer codigo, Integer tiempo) {
        this.codigo = codigo;
        this.tiempo = tiempo;
    }

    public Tiempo_trabajo() {
    }
    
}
