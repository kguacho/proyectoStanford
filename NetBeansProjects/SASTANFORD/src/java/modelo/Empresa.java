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
public class Empresa {
    private Integer codigo;
    private String nombre;
    private String razon_social;
    private String ruc;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String descripcion;
    private String representante_legal;
    private String cedula_representante;
    private Tipo_empresa tipo_empresa;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(String representante_legal) {
        this.representante_legal = representante_legal;
    }

    public String getCedula_representante() {
        return cedula_representante;
    }

    public void setCedula_representante(String cedula_representante) {
        this.cedula_representante = cedula_representante;
    }

    public Tipo_empresa getTipo_empresa() {
        return tipo_empresa;
    }

    public void setTipo_empresa(Tipo_empresa tipo_empresa) {
        this.tipo_empresa = tipo_empresa;
    }

    public Empresa(Integer codigo, String nombre, String razon_social, String ruc, String ciudad, String direccion, String telefono, String email, String descripcion, String representante_legal, String cedula_representante, Tipo_empresa tipo_empresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.razon_social = razon_social;
        this.ruc = ruc;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
        this.representante_legal = representante_legal;
        this.cedula_representante = cedula_representante;
        this.tipo_empresa = tipo_empresa;
    }

    public Empresa() {
    }
    
    
}
