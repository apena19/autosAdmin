package com.example.AutosList;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorAutomovil extends BaseAdapter {
    private Context contexto;
    private ArrayList<Automovil> automovil;
    private Resources res;

    public AdaptadorAutomovil(Context contexto, ArrayList<Automovil> automovil) {
        this.contexto = contexto;
        this.automovil = automovil;
    }

    @Override
    public int getCount() {
        return automovil.size();
    }

    @Override
    public Object getItem(int i) {
        return automovil.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        res = contexto.getResources();
        View v = convertView;

        LayoutInflater inf = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inf.inflate(R.layout.item_automovil, null);

        ImageView foto = v.findViewById(R.id.imgFoto);
        TextView placa = v.findViewById(R.id.lblPlaca);
        TextView marca = v.findViewById(R.id.lblMarca);
        TextView modelo = v.findViewById(R.id.lblModelo);
        TextView color = v.findViewById(R.id.lblColor);
        TextView precio = v.findViewById(R.id.lblPrecio);


        Automovil p = automovil.get(i);


        foto.setImageDrawable(res.getDrawable(p.getFoto()));
        placa.setText(p.getPlaca());
        marca.setText(p.getMarca());
        modelo.setText(p.getModelo());
        color.setText(p.getColor());
        precio.setText(p.getPrecio());


        return v;
    }

}