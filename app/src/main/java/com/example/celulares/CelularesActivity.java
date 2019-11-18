package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.celulares.modelo.Catalogo;

public class CelularesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celulares);

        //Obtener el celular desde el Intent
        int catalogoNro=(Integer)getIntent().getExtras().get("catalogoNro");
        Catalogo catalogo=Catalogo.catalogo[catalogoNro];


        //Recuperamos la imagen y mostrarla
        ImageView foto=(ImageView)findViewById(R.id.foto);
        foto.setImageResource(catalogo.getIdfoto());
        foto.setContentDescription(catalogo.getModelo());

        //Nombre del celular
        TextView modelo=(TextView)findViewById(R.id.modelo);
        modelo.setText(catalogo.getModelo());

        //Precio del celular
        TextView precio=(TextView)findViewById(R.id.precio);
        precio.setText(catalogo.getPrecio());

        //Descripcion
        TextView descripcion=(TextView)findViewById(R.id.descripcion);
        descripcion.setText(catalogo.getDescripcion());
    }
}
