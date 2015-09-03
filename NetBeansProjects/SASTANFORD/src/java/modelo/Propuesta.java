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
public class Propuesta {
    private Integer codigo;
    private String cargo;
    private Double sueldo;
    private String contacto;
    private String telefono;
    private String extra;
    private Empresa empresa;
    private Date inicio_propuesta;
    private Date fin_propuesta;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getInicio_propuesta() {
        return inicio_propuesta;
    }

    public void setInicio_propuesta(Date inicio_propuesta) {
        this.inicio_propuesta = inicio_propuesta;
    }

    public Date getFin_propuesta() {
        return fin_propuesta;
    }

    public void setFin_propuesta(Date fin_propuesta) {
        this.fin_propuesta = fin_propuesta;
    }

    public Propuesta(Integer codigo, String cargo, Double sueldo, String contacto, String telefono, String extra, Empresa empresa, Date inicio_propuesta, Date fin_propuesta) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.contacto = contacto;
        this.telefono = telefono;
        this.extra = extra;
        this.empresa = empresa;
        this.inicio_propuesta = inicio_propuesta;
        this.fin_propuesta = fin_propuesta;
    }

    public Propuesta() {
    }
    
}
