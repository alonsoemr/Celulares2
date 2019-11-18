package com.example.celulares.modelo;

import com.example.celulares.R;

public class Catalogo {
    private String modelo;
    private String precio;
    private String descripcion;
    private int idfoto;

    public static final Catalogo[] catalogo={
            new Catalogo("Samsung", "precio: 50.000","Galaxy s10", R.drawable.s10),
            new Catalogo("Sony", "precio: 100.000","Z4", R.drawable.sony),
            new Catalogo("LG", "precio: 150.000","G5", R.drawable.lg)
    };

    public Catalogo(String modelo, String precio, String descripcion, int idfoto) {
        this.modelo = modelo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.idfoto = idfoto;
    }

    public String getModelo() { return modelo; }

    public String getPrecio() { return precio; }

    public String getDescripcion() { return descripcion; }

    public int getIdfoto() { return idfoto; }

    @Override
    public String toString() { return modelo;}
}
