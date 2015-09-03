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
public class Empledor {
    private Integer codigo;
    private Double ingreso_mensual;
    private String lugar_trabajo;
    private String  direccion_empresa;
    private String telefono;
    private String cargo;
    private String ciudad;
    private Double tiempo_servicio_meses;
    private Egresado egresado;
    private Tipo_empresa tipo_empresa;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getIngreso_mensual() {
        return ingreso_mensual;
    }

    public void setIngreso_mensual(Double ingreso_mensual) {
        this.ingreso_mensual = ingreso_mensual;
    }

    public String getLugar_trabajo() {
        return lugar_trabajo;
    }

    public void setLugar_trabajo(String lugar_trabajo) {
        this.lugar_trabajo = lugar_trabajo;
    }

    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Double getTiempo_servicio_meses() {
        return tiempo_servicio_meses;
    }

    public void setTiempo_servicio_meses(Double tiempo_servicio_meses) {
        this.tiempo_servicio_meses = tiempo_servicio_meses;
    }

    public Egresado getEgresado() {
        return egresado;
    }

    public void setEgresado(Egresado egresado) {
        this.egresado = egresado;
    }

    public Tipo_empresa getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(Tipo_empresa tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    public Empledor(Integer codigo, Double ingreso_mensual, String lugar_trabajo, String direccion_empresa, String telefono, String cargo, String ciudad, Double tiempo_servicio_meses, Egresado egresado, Tipo_empresa tipo_empresa) {
        this.codigo = codigo;
        this.ingreso_mensual = ingreso_mensual;
        this.lugar_trabajo = lugar_trabajo;
        this.direccion_empresa = direccion_empresa;
        this.telefono = telefono;
        this.cargo = cargo;
        this.ciudad = ciudad;
        this.tiempo_servicio_meses = tiempo_servicio_meses;
        this.egresado = egresado;
        this.tipo_empresa = tipo_empresa;
    }

    public Empledor() {
    }
    
}
