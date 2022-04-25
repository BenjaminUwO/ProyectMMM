package com.example.proyectommm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_Valores extends AppCompatActivity implements View.OnClickListener {

    Button BtnIniciar, Btn1Honestidad, Btn1Justicia, Btn1Amor, Btn1Solidaridad, Btn2Honestidad, Btn2Justicia, Btn2Amor, Btn2Libertad, BtnSN1;
    LinearLayout Layout1Libertad, Layout1Amor, LayoutF1, LayoutInicio;
    TextView LblM1;


    Button BtnSN2;
    TextView LblM2;
    LinearLayout LayoutF2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores);

        BtnIniciar = findViewById(R.id.BtnIniciar);
        Btn1Honestidad = findViewById(R.id.Btn1Honestidad);
        Btn1Justicia = findViewById(R.id.Btn1Justicia);
        Btn1Amor = findViewById(R.id.Btn1Amor);
        Btn1Solidaridad = findViewById(R.id.Btn1Solidaridad);
        Btn2Honestidad = findViewById(R.id.Btn2Honestidad);
        Btn2Justicia = findViewById(R.id.Btn2Justicia);
        Btn2Amor = findViewById(R.id.Btn2Amor);
        Btn2Libertad = findViewById(R.id.Btn2Libertad);
        Layout1Amor = findViewById(R.id.Layout1Amor);
        Layout1Libertad = findViewById(R.id.Layout1Libertad);
        BtnSN1 = findViewById(R.id.BtnSN1);
        LayoutF1 = findViewById(R.id.LayoutF1);
        LblM1 = findViewById(R.id.LblM1);
        LayoutInicio = findViewById(R.id.LayoutInicio);

        BtnIniciar.setOnClickListener(this);
        Btn1Honestidad.setOnClickListener(this);
        Btn1Justicia.setOnClickListener(this);
        Btn1Amor.setOnClickListener(this);
        Btn1Solidaridad.setOnClickListener(this);
        Btn2Honestidad.setOnClickListener(this);
        Btn2Justicia.setOnClickListener(this);
        Btn2Amor.setOnClickListener(this);
        Btn2Libertad.setOnClickListener(this);
        BtnSN1.setOnClickListener(this);

        BtnSN2 = findViewById(R.id.BtnSN2);
        LblM2 = findViewById(R.id.LblM2);
        BtnSN2.setOnClickListener(this);
        LayoutF2 = findViewById(R.id.LayoutF2);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.BtnIniciar){
            Layout1Amor.setVisibility(View.VISIBLE);
            LayoutInicio.setVisibility(View.GONE);
        }
        if (v.getId() == R.id.Btn1Amor){
            LayoutF1.setVisibility(View.VISIBLE);
            LblM1.setText("FELICIDADES!!!\nRespuesta correcta");
            BtnSN1.setVisibility(View.VISIBLE);
        }else if (v.getId() == R.id.Btn1Honestidad || v.getId() == R.id.Btn1Justicia || v.getId() == R.id.Btn1Solidaridad){
            LayoutF1.setVisibility(View.VISIBLE);
            LblM1.setText("OH NO, TE HAS EQUIVOCADO!!");
            BtnSN1.setVisibility(View.GONE);
        }

        if (v.getId() == R.id.BtnSN1){
            LayoutF1.setVisibility(View.GONE);
            Layout1Amor.setVisibility(View.GONE);
            Layout1Libertad.setVisibility(View.VISIBLE);
        }





        if (v.getId() == R.id.Btn2Libertad){
            LayoutF2.setVisibility(View.VISIBLE);
            LblM2.setText("FELICIDADES!!!\nRespuesta correcta");
            BtnSN2.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.Btn2Honestidad || v.getId() == R.id.Btn2Justicia || v.getId() == R.id.Btn2Amor) {
            LayoutF2.setVisibility(View.VISIBLE);
            LblM2.setText("OH NO, TE HAS EQUIVOCADO!!");
            BtnSN2.setVisibility(View.GONE);
        }

    }
}