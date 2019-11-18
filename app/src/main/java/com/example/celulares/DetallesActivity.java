package com.example.celulares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.celulares.modelo.Celular;
import com.example.celulares.modelo.ListaDeCompras;

public class DetallesActivity extends AppCompatActivity {

    private Celular celular;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        //obtener el celular
        intent=getIntent();
        int id=(Integer) intent.getExtras().get("idCelular");
        celular= ListaDeCompras.getInstancia().getCelular(id);

        //Mostrar la informacion del celular
        TextView txtNombre=(TextView)findViewById(R.id.txtNombre);
        txtNombre.setText(celular.getMarca());

        TextView txtDescripcion=(TextView)findViewById(R.id.txtDescripcion);
        txtDescripcion.setText(celular.getDescripcion());

        TextView txtCantidad=(TextView)findViewById(R.id.txtCantidad);
        txtCantidad.setText("Cantidad: "+celular.getCantidad()+" "+ celular.getUnidad());

        TextView txtEstado=(TextView)findViewById(R.id.txtEstado);
        Button cambiar=(Button) findViewById(R.id.estado);
        if(celular.isEstado())
        {
            txtEstado.setText("Pendiente");
            cambiar.setText("Marcar como comprado");
        }
        else{
            txtEstado.setText("Comprado");
            cambiar.setText("Marcar como pendiente");
        }
    }
    public void cambiarEstado(View view)
    {
        celular.setEstado(!celular.isEstado());
        setResult(RESULT_OK,intent);
        finish();
    }
}
