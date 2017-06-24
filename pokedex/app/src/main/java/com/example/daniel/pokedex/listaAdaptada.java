package com.example.daniel.pokedex;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Daniel on 20/06/2017.
 */

public class listaAdaptada extends BaseAdapter   {


private Context context;
    private ArrayList<Pokemon> lista_pokemon;
    public Pokemon seleccionado;
    private CardView carta;

    public listaAdaptada(Context context,ArrayList<Pokemon> lista_pokemon){
        this.context=context;
        this.lista_pokemon=lista_pokemon;
    }

    @Override
    public int getCount(){
        return lista_pokemon.size();
    }



    @Override
    public Object getItem(int position) {
        return lista_pokemon.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

         seleccionado=lista_pokemon.get(position);
        LayoutInflater inflater= LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.adaptador,null);
        ImageView imagen=(ImageView) v.findViewById(R.id.imagen_pokemon);
        TextView nombre=(TextView) v.findViewById(R.id.nombre_pokemon);
        TextView tipo=(TextView) v.findViewById(R.id.tipo_pokemon);

        nombre.setText(seleccionado.getNombre());
        tipo.setText(seleccionado.getTipo());
        Glide.with(context)
                .load(seleccionado.getUrlImangen())
                .into(imagen);



        return v;
    }




   /* @Override
    public void onClick(View v) {

        if (v.getId()==R.id.click){
            Intent intent=new Intent(this,Info.class);

            startActivity(intent);
        }
*/
    }
//}
