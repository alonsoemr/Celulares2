package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.celulares.modelo.Celular;
import com.example.celulares.modelo.ListaDeCompras;

public class NuevoCelularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_celular);
    }

    public void ingresarCelular(View view){
        String marca=((Spinner)findViewById(R.id.ingresarMarca)).getSelectedItem().toString();
        String descripcion=((TextView)findViewById(R.id.ingresarDescripcion)).getText().toString();
        String cantidadStr=((TextView)findViewById(R.id.ingresarCantidad)).getText().toString();
        String unidad=((Spinner)findViewById(R.id.ingresarUnidad)).getSelectedItem().toString();
        String unidadNueva=((TextView)findViewById(R.id.otraUnidad)).getText().toString();
        int cantidad=0;// estos son todos los datos que el usuarios debe llenar para ingresar algo
        try{
            cantidad=Integer.parseInt(cantidadStr);
        }catch (NumberFormatException ex) {
            Toast.makeText(this, "Debe ingresar un numero en la cantidad",
                    Toast.LENGTH_SHORT).show();
        }
        if(cantidad>0){
            if(unidad.equals("Otro")){
                unidad=unidadNueva;
            }
            Celular celular=new Celular (marca,cantidad,unidad,descripcion);
            ListaDeCompras listaDeCompras=ListaDeCompras.getInstancia();
            listaDeCompras.agregarCelular(celular);
            finish();
        }
        else{
            Toast.makeText(this, "Ingrese una cantidad mayor a cero",
                    Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this,"Celular ingresado correctamente",
                Toast.LENGTH_SHORT).show();
    }
}
