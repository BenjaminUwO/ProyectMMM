package com.example.proyectommm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityJusticiaLectura extends AppCompatActivity implements View.OnClickListener {

    Button BtnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_justicia_lectura);
        BtnRegresar = findViewById(R.id.BtnRegresar);
        BtnRegresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        openA();
    }
    public void openA() {
        Intent intentValores = new Intent(this, Activity_Cuestionario3.class);
        startActivity(intentValores);
    }
}