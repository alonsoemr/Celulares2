package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.celulares.modelo.Celular;
import com.example.celulares.modelo.ListaDeCompras;

import java.util.List;

public class ListaCelularesActivity extends ListActivity {
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        cargarLista();
    }

    public void cargarLista()
    {
        lista=getListView();
        List<Celular> celularList= ListaDeCompras.getInstancia().getListaDeCompras();
        ArrayAdapter<Celular> listaAdapter= new ArrayAdapter<Celular>(this,
                android.R.layout.simple_expandable_list_item_1,celularList);
        lista.setAdapter(listaAdapter);

    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id)
    {
        Intent intent=new Intent(ListaCelularesActivity.this,DetallesActivity.class);
        intent.putExtra("idCelular",(int)id);
        startActivityForResult(intent,1);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        //esto genera una respuesta
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                cargarLista();//esto actualiza la lista
            }
        }
    }
    }

