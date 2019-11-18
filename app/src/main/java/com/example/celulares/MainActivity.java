package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.celulares.modelo.Celular;
import com.example.celulares.modelo.ListaDeCompras;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListaDeCompras lista= ListaDeCompras.getInstancia();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verLista(View view)
    {
        ArrayList<Celular> celulares=lista.getListaDeCompras();
        if (celulares.size()>0){
            Intent intent = new Intent(this, ListaCelularesActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"La lista de celulares esta vacía",
                    Toast.LENGTH_SHORT).show();
        }
        Intent intent=new Intent(this,ListaCelularesActivity.class);
        startActivity(intent);// el intent sirve para invocar componentes de la activity
    }
    public void ingresarNuevo(View view){
        Intent intent=new Intent(this, NuevoCelularActivity.class);
        startActivity(intent);
    }
    public void eliminarComprados(View view){
        lista.eliminarComprados();
        Toast.makeText(this,"Se eliminaron los celulares comprados",
                Toast.LENGTH_SHORT).show();
    }
    public void verCatalogo(View view)
    {
        Intent intent=new Intent(this, CatalogoActivity.class);
        startActivity(intent);
    }

}
