package com.example.android.personasmaterial;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 17/10/2017.
 */

public class adaptadorPersona extends RecyclerView.Adapter<adaptadorPersona.personaViewHolder> {
    private ArrayList<Persona> personas;
    private Resources res;

    public adaptadorPersona (Context contexto, ArrayList<Persona> personas){
        this.personas = personas;
        this.res=contexto.getResources();
    }

    @Override
    public personaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona,parent,false);
        return new personaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(personaViewHolder holder, int position) {
        final Persona p = personas.get(position);
        holder.foto.setImageDrawable(ResourcesCompat.getDrawable(res, p.getFoto(), null));
        holder.cc.setText(p.getCc());
        holder.nombre.setText(p.getNombre());
        holder.apellido.setText(p.getApellido());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class personaViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView cc;
        private TextView nombre;
        private TextView apellido;

        public personaViewHolder(View item){
            super(item);
            foto = (ImageView)item.findViewById(R.id.imageFoto);
            cc = (TextView)item.findViewById(R.id.lblcedula);
            nombre = (TextView)item.findViewById(R.id.lblnombre);
            apellido = (TextView)item.findViewById(R.id.lblapellido);
        }
    }
}
