package com.example.proyectommm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenuLecturas extends AppCompatActivity implements View.OnClickListener {

    Button Amor, Justicia, Respeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lecturas);

        Amor = findViewById(R.id.BtnLecturaAmor);
        Amor.setOnClickListener(this);

        Justicia = findViewById(R.id.BtnLecturaJusticia);
        Justicia.setOnClickListener(this);

        Respeto = findViewById(R.id.BtnLecturaRespeto);
        Respeto.setOnClickListener(this);

    }


    public void ActivityAmor(){
        Intent intent = new Intent(this, ActivityAmorLectura.class);
        startActivity(intent);
    }

    public void ActivityJusticia(){
        Intent intent2 = new Intent(this, ActivityJusticiaLectura.class);
        startActivity(intent2);
    }

    public void ActivityRespeto(){
        Intent intent3 = new Intent(this, ActivityRespetoLectura.class);
        startActivity(intent3);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnLecturaAmor:
                ActivityAmor();
                break;

            case R.id.BtnLecturaJusticia:
                ActivityJusticia();
                break;

            case R.id.BtnLecturaRespeto:
                ActivityRespeto();
                break;
        }
    }
}