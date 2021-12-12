package com.example.essai_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    Float  poids, taille, age, resultat;



     TextView message;
     TextView indice;
     TextView mm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        indice=(TextView) findViewById(R.id.textView7);
        message=(TextView) findViewById(R.id.textView8);
        mm=(TextView) findViewById(R.id.textView11);
        Bundle b =getIntent().getExtras();
        message.setText(b.getString("user") + " " +"a" + "" + b.getString("age") + " " + "ans"+ "." + "Il pèse" + " " + b.getString("poids") + "pour une taille de" + " " + b.getString("taille"));
        Intent intent= getIntent();

        poids= Float.parseFloat(intent.getStringExtra("poids"));
        taille= Float.parseFloat(intent.getStringExtra("taille"));

        resultat=poids/(taille*taille);

        indice.setText(resultat.toString());

        String res= "";

        if (resultat>=40){

            res="Obésité massive";

        }
        else if (resultat<40 && resultat>30){
            res="Obésité";
        }

        else if (resultat<29.9 && resultat>25.0){
            res="Surpoids ";
        }
        else if (resultat<24.9 && resultat>18.5){
            res="Normal";
        }

        else {
            res="Maigreur ";
        }
        mm.setText(res);


    }
}