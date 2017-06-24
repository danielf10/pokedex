package com.example.daniel.pokedex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText usuario;
    private EditText contrasenia;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
        usuario=(EditText) findViewById(R.id.us);
        contrasenia=(EditText) findViewById(R.id.cont);
        boton=(Button) findViewById(R.id.bot);
        boton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bot){
            String t1=usuario.getText().toString();
            t1.trim();
            String t2=contrasenia.getText().toString();
            t2.trim();
            String us="codeus@pokemon.com";
            String cont="123452";

            if (t1.length()>5  && t1.equals(us) && t2.equals(cont) ) {
                Intent intent = new Intent(this, Lista_Activity.class);
                intent.putExtra("usuario", t1);
                startActivity(intent);
            }
            else {
                Toast.makeText(this,"correo o contrasenia incorrecta",Toast.LENGTH_SHORT).show();
            }

        }

    }
}
