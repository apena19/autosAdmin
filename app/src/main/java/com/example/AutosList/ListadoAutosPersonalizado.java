package com.example.AutosList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListadoAutosPersonalizado extends AppCompatActivity {
    private ListView lista;
    private ArrayList<Automovil> automovil;
    private Context contexto;
    private AdaptadorAutomovil adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_autos_personalizado);


        lista = findViewById(R.id.lstListadoPersonalizado);
        contexto = this.getApplicationContext();
        automovil = Datos.obtener();

        adapter = new AdaptadorAutomovil(contexto, automovil);
        lista.setAdapter(adapter);
    }
}