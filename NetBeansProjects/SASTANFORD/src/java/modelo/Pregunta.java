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
public class Pregunta {
    private Integer codigo;
    private String preguntas;
    private Encuesta encuesta;
    private Tipo_pregunta tipo_pregunta;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public Encuesta getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(Encuesta encuesta) {
        this.encuesta = encuesta;
    }

    public Tipo_pregunta getTipo_pregunta() {
        return tipo_pregunta;
    }

    public void setTipo_pregunta(Tipo_pregunta tipo_pregunta) {
        this.tipo_pregunta = tipo_pregunta;
    }

    public Pregunta(Integer codigo, String preguntas, Encuesta encuesta, Tipo_pregunta tipo_pregunta) {
        this.codigo = codigo;
        this.preguntas = preguntas;
        this.encuesta = encuesta;
        this.tipo_pregunta = tipo_pregunta;
    }

    public Pregunta() {
    }
    
}
