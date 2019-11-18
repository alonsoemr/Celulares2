package com.example.celulares.modelo;

public class Celular {
    private String marca;
    private int cantidad;
    private String unidad;
    private String descripcion;
    private boolean estado; //true si esta pendiente - false si esta comprado
    private static final boolean PENDIENTE=true;

    //Constructor


    public Celular(String marca, int cantidad, String unidad, String descripcion) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.estado = PENDIENTE;
    }
    //Getter y Setters

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //toString para mostrar en la lista

    @Override
    public String toString() {
        //Devuelve el nombre del producto y si esta comprado o pendiente
        String comprado;
        if(estado) comprado="pendiente";
        else comprado="comprado";
        return marca + ": " + comprado;
    }






}
