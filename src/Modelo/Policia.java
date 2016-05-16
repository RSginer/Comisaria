/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;

/**
 * Objeto que corresponde con la tabla policias en la BD
 * @author Rubén Soler
 */
public class Policia {
    private Integer idPolicia;
    private Integer numeroDePlaca;
    private String nombre;   
    private String numPlaca;
    private Integer edad;
    private String departamento;
    private Image foto;

    public Policia(Integer idPolicia, String nombre, String numPlaca, Integer edad, String departamento, Image foto) {
        this.idPolicia = idPolicia;
        this.nombre = nombre;
        this.numPlaca = numPlaca;
        this.edad = edad;
        this.departamento = departamento;
        this.foto = foto;
    }

    public Policia(Integer idPolicia, String nombre, String numPlaca) {
        this.idPolicia = idPolicia;
        this.nombre = nombre;
        this.numPlaca = numPlaca;
    }

    public Integer getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(Integer idPolicia) {
        this.idPolicia = idPolicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
    
}
