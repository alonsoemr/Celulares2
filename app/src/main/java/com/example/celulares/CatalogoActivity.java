package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.celulares.modelo.Catalogo;

import org.w3c.dom.Text;

public class CatalogoActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Recuperamos el ListView
        ListView listaCatalogo=getListView();

        //Creamos un ArrayAdapter para asociarlo con el arreglo
        ArrayAdapter<Catalogo> listaAdapter= new ArrayAdapter<Catalogo>(
                this,
                android.R.layout.simple_list_item_1,
                Catalogo.catalogo);
        //Asociamos el ArrayAdapter al ListView
        listaCatalogo.setAdapter(listaAdapter);
    }
    @Override
    public void onListItemClick(ListView listView, View view,
                                int posicion, long id)
    {
        Intent intent=new Intent(CatalogoActivity.this,
                CelularesActivity.class);
        intent.putExtra("catalogoNro",(int)id);
        startActivity(intent);
    }
    }

