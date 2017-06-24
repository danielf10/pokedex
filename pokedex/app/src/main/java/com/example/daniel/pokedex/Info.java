package com.example.daniel.pokedex;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Daniel on 21/06/2017.
 */


public class Info extends Activity implements View.OnClickListener {

    private Context context;
    private   TextView nombre;
    private  TextView  tipo;
    private  TextView ataques;
    private  TextView  area ;
    private ImageView icono;
    private TextView evolucion;
    Pokemon pikachu;
    String video="https://www.youtube.com/watch?v=lPoMfgLSPr0";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        nombre=(TextView)findViewById(R.id.nombre);
        tipo=(TextView)findViewById(R.id.desc1_pokemon);
        ataques =(TextView)findViewById(R.id.desc2_pokemon);
        area=(TextView)findViewById(R.id.desc3_pokemon);
        evolucion=(TextView)findViewById(R.id.evolucion);
        icono=(ImageView)findViewById(R.id.icon);
        icono.setOnClickListener(this);




        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {


            String aux = (String) bundle.get("pokemon");

            nombre.setText(aux);

            switch (aux) {
            case  "tortuga":
                 pikachu = new Pokemon("tortuga", "agua","chorro de agua,hidro bomba" ,"pueblo paleta", "http://www.alfabetajuega.com/multimedia/imagenes/201607/156652.alfabetajuega-squirtle-150716.png","https://www.youtube.com/watch?v=lPoMfgLSPr0","ranchu");

                tipo.setText(pikachu.getTipo());
                ataques.setText(pikachu.getAtaques());
                area.setText(pikachu.getArea());
                evolucion.setText(pikachu.getEvolucion());


                break;
            case "charizar":
                Pokemon charizar=new Pokemon("charizar","fuego","mar de llamas, poder solar","pueblo roca","https://vignette2.wikia.nocookie.net/new-monster/images/9/95/Charizard.png/revision/latest?cb=20131020094521","https://www.youtube.com/watch?v=lPoMfgLSPr0","ninguna");
                tipo.setText(charizar.getTipo());
                ataques.setText(charizar.getAtaques());
                area.setText(charizar.getArea());
                evolucion.setText(charizar.getEvolucion());


                break;

            case "lucario":

                Pokemon lucario=new Pokemon("lucario","Lucha","Esfera aural" ,"pueblo solar " ,"http://vignette1.wikia.nocookie.net/es.pokemon/images/d/d0/Lucario.png/revision/latest?cb=20150621180604","https://www.youtube.com/watch?v=lPoMfgLSPr0","ninguno");
                tipo.setText(lucario.getTipo());
                ataques.setText(lucario.getAtaques());
                area.setText(lucario.getArea());
                evolucion.setText(lucario.getEvolucion());



                break;

            case"Rhyhorn":
                Pokemon rino=new Pokemon("Rhyhorn","roca","cornada,Derribo","pueblo celeste","https://vignette3.wikia.nocookie.net/es.pokemon/images/3/36/Rhyhorn.png/revision/latest?cb=20080909114734","https://www.youtube.com/watch?v=lPoMfgLSPr0","Rhydon");
                tipo.setText(rino.getTipo());
                ataques.setText(rino.getAtaques());
                area.setText(rino.getArea());
                evolucion.setText(rino.getEvolucion());


        }


        }






        }


    @Override
    public void onClick(View v) {
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(video));
        startActivity(intent);

    }
}



