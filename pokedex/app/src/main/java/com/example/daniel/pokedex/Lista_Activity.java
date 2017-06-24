package com.example.daniel.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Daniel on 19/06/2017.
 */

public class Lista_Activity extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Pokemon> listaPokemon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_activity);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String aux = (String) bundle.get("texto");
            Toast.makeText(this, aux, Toast.LENGTH_SHORT).show();
        }

        lista = (ListView) findViewById(R.id.lista);

        Pokemon pikachu = new Pokemon("tortuga", "agua", "http://www.alfabetajuega.com/multimedia/imagenes/201607/156652.alfabetajuega-squirtle-150716.png");
        Pokemon charizar=new Pokemon("charizar","fuego","https://vignette2.wikia.nocookie.net/new-monster/images/9/95/Charizard.png/revision/latest?cb=20131020094521");
        Pokemon lucario=new Pokemon("lucario","psiquico","http://vignette1.wikia.nocookie.net/es.pokemon/images/d/d0/Lucario.png/revision/latest?cb=20150621180604");
        Pokemon rino=new Pokemon("Rhyhorn","roca","https://vignette3.wikia.nocookie.net/es.pokemon/images/3/36/Rhyhorn.png/revision/latest?cb=20080909114734");

        listaPokemon=new ArrayList<>();
                listaPokemon.add(pikachu);
        listaPokemon.add(charizar);
        listaPokemon.add(lucario);
        listaPokemon.add(rino);


        listaAdaptada adapter=new listaAdaptada(this,listaPokemon);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Pokemon  seleccionado=listaPokemon.get(position);





                    Intent intent=new Intent(getApplicationContext(),Info.class);

                    intent.putExtra("pokemon", seleccionado.getNombre());


                    startActivity(intent);

                }

        });



    }



    }

