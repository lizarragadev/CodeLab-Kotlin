package com.miramicodigo.pokekotlin.model;

import java.io.Serializable;

/**
 *
 * @author Gustavo Lizarraga
 * @version 1.1
 *
 */
public class Pokemon implements Serializable{

    private String nombre;
    private String cp;
    private int imagen;

    public Pokemon(String nombre, String cp, int imagen) {
        this.nombre = nombre;
        this.cp = cp;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

