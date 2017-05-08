package com.example.lkdml.tp_buffete;

import java.io.Serializable;

/**
 * Created by lkdml on 6/5/2017.
 */

public class Menu_model implements Serializable{
    private String descripcion;
    private Double precio;

    public Menu_model(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
