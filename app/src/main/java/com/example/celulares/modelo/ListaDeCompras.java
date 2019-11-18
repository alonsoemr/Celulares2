package com.example.celulares.modelo;

import java.util.ArrayList;

public class ListaDeCompras {
    public static ListaDeCompras instancia=new ListaDeCompras();
    private ArrayList<Celular> listaDeCompras;

    private ListaDeCompras(){
        listaDeCompras=new ArrayList<>();
        agregarCelular(new Celular("Nokia",1,"unidad","en buen estado"));
    }
    public static ListaDeCompras getInstancia(){

        return instancia;
    }

    public void agregarCelular(Celular celular){

        listaDeCompras.add(celular);
    }

    public Celular getCelular(int id){

        return listaDeCompras.get(id);
    }

    public ArrayList<Celular> getListaDeCompras(){

        return listaDeCompras;
    }
    public void eliminarComprados()
    {
        for (int i=0; i<listaDeCompras.size(); i++)
        {
            if (listaDeCompras.get(i).isEstado()==false) //si es false esta comprado, si es true esta en pendiente
            {
                listaDeCompras.remove(i);
                i--;
            }
        }
    }
}

