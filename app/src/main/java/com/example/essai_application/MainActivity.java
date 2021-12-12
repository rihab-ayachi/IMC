package com.example.essai_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nom=null;
    private EditText poids =null;
    private EditText taille =null;
    private EditText age  =null;
    private Button calcul =null;
    private TextView resultat ;

    private double r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = (EditText) findViewById(R.id.nom);
        poids = (EditText) findViewById(R.id.poids);
        taille = (EditText) findViewById(R.id.taille);
        age= (EditText) findViewById(R.id.age);
        calcul = (Button) findViewById(R.id.calcul);
        resultat =(TextView) findViewById(R.id.textView9);



        calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();


            }
        });

    }
    public void openActivity2() {
        Intent intent =  new Intent(this, MainActivity2.class);









        Bundle b=new Bundle();
        b.putString("user",nom.getText().toString());
        b.putString("age",age.getText().toString());
        b.putString("poids", poids.getText().toString());
        b.putString("taille", taille.getText().toString());
        

        intent.putExtras(b);
        //intent.putExtra("nom",nom.getText().toString());
        //intent.putExtra("poids",poids.getText().toString());
        //intent.putExtra("taille",taille.getText().toString());
       //double name = r ;
        //intent.putExtra("name",name);
        startActivity(intent);
    }

}
