package com.example.proyectommm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class Activity_Cuestionario3 extends AppCompatActivity implements View.OnClickListener {

    RadioButton correcto1, correcto2, correcto3;
    Button BtnResponder,BtnRegresar;
    TextView LblRes;
    LinearLayout ContJuegos, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);

        BtnRegresar = findViewById(R.id.BtnRegresar);
        BtnResponder = findViewById(R.id.BtnResponder);
        BtnResponder.setOnClickListener(this);
        correcto1 = findViewById(R.id.correcto1);
        correcto2 = findViewById(R.id.correcto2);
        correcto3 = findViewById(R.id.correcto3);
        LblRes = findViewById(R.id.LblRes);
        BtnRegresar.setOnClickListener(this);
        ContJuegos = findViewById(R.id.ContJuegos);
        mensaje = findViewById(R.id.mensaje);
    }

    @Override
    public void onClick(View v) {

        int bien = 0;

        switch (v.getId()){
            case R.id.BtnResponder:
                if(correcto1.isChecked()){
                    bien++;
                }
                if(correcto2.isChecked()){
                    bien++;
                }
                if(correcto3.isChecked()){
                    bien++;
                }
                ContJuegos.setVisibility(View.GONE);
                LblRes.setText("Tuviste "+bien+" Aciertos!!");
                BtnRegresar.setVisibility(View.VISIBLE);
                mensaje.setVisibility(View.VISIBLE);
                break;
            case R.id.BtnRegresar:
                openActivityMain();
                break;

        }

    }

    public void openActivityMain() {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
    }

}