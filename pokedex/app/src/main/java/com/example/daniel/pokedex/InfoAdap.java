package com.example.daniel.pokedex;

/**
 * Created by Daniel on 22/06/2017.
 */

public class InfoAdap  {

   /*extends BaseAdapter
   private Context context;
    private ArrayList<Pokemon> lista_pokemon;
    private Pokemon poke;


    public InfoAdap(Context context,Pokemon poke){
        this.context=context;
        this.poke=poke;
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

        Pokemon seleccionado=lista_pokemon.get(position);
        LayoutInflater inflater= LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.info,null);
        ImageView imagen=(ImageView) v.findViewById(R.id.imagen_pokemon);

        TextView nombre=(TextView) v.findViewById(R.id.nomp);
        TextView tipo=(TextView) v.findViewById(R.id.desc1_pokemon);
        TextView ataque=(TextView) v.findViewById(R.id.desc2_pokemon);
        TextView area=(TextView) v.findViewById(R.id.desc3_pokemon);
        ImageView evolucion=(ImageView) v.findViewById(R.id.evo_pokemon);
        nombre.setText(seleccionado.getNombre());
        tipo.setText(seleccionado.getTipo());
        Glide.with(context)
                .load(seleccionado.getUrlImangen())
                .into(imagen);



        return v;
    }*/
}

