package com.example.proyectommm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_Valores extends AppCompatActivity implements View.OnClickListener {

    // HOLA BUENAS TARDES

    Button BtnIniciar, Btn1Honestidad, Btn1Justicia, Btn1Amor, Btn1Solidaridad, Btn2Honestidad, Btn2Justicia, Btn2Amor, Btn2Libertad, BtnSN1;
    LinearLayout Layout1Libertad, Layout1Amor, LayoutF1, LayoutInicio;
    TextView LblM1;


    Button BtnSN2, Btn3Honestidad, Btn3Justicia, Btn3Empatia, Btn3Solidaridad;
    TextView LblM2;
    LinearLayout LayoutF2, Layout1Empatia;

    Button BtnSN3, Btn4Respeto, Btn4Justicia, Btn4Empatia, Btn4Solidaridad;
    TextView LblM3;
    LinearLayout LayoutF3, Layout1Respeto;

    Button BtnSN4, Btn5Respeto, Btn5Honestidad, Btn5Empatia, Btn5Solidaridad;
    LinearLayout LayoutF4, Layout1Honestidad;
    TextView LblM4;

    Button BtnSN5;
    LinearLayout LayoutF5;
    TextView LblM5;

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
        Layout1Empatia = findViewById(R.id.Layout1Empatia);
        Btn3Honestidad = findViewById(R.id.Btn3Honestidad);
        Btn3Justicia = findViewById(R.id.Btn3Justicia);
        Btn3Empatia = findViewById(R.id.Btn3Empatia);
        Btn3Solidaridad = findViewById(R.id.Btn3Solidaridad);
        Btn3Solidaridad.setOnClickListener(this);
        Btn3Honestidad.setOnClickListener(this);
        Btn3Empatia.setOnClickListener(this);
        Btn3Justicia.setOnClickListener(this);


        BtnSN3 = findViewById(R.id.BtnSN3);
        LblM3 = findViewById(R.id.LblM3);
        LayoutF3 = findViewById(R.id.LayoutF3);
        BtnSN3.setOnClickListener(this);
        Btn4Respeto = findViewById(R.id.Btn4Respeto);
        Btn4Justicia = findViewById(R.id.Btn4Justicia);
        Btn4Empatia = findViewById(R.id.Btn4Empatia);
        Btn4Solidaridad = findViewById(R.id.Btn4Solidaridad);
        Btn4Respeto.setOnClickListener(this);
        Btn4Justicia.setOnClickListener(this);
        Btn4Empatia.setOnClickListener(this);
        Btn4Solidaridad.setOnClickListener(this);
        Layout1Respeto = findViewById(R.id.Layout1Respeto);

        LayoutF4 = findViewById(R.id.LayoutF4);
        LblM4 = findViewById(R.id.LblM4);
        BtnSN4 = findViewById(R.id.BtnSN4);
        Layout1Honestidad = findViewById(R.id.Layout1Honestidad);
        BtnSN4.setOnClickListener(this);
        Btn5Respeto = findViewById(R.id.Btn5Respeto);
        Btn5Honestidad = findViewById(R.id.Btn5Honestidad);
        Btn5Empatia = findViewById(R.id.Btn5Empatia);
        Btn5Solidaridad = findViewById(R.id.Btn5Solidaridad);
        Btn5Respeto.setOnClickListener(this);
        Btn5Honestidad.setOnClickListener(this);
        Btn5Empatia.setOnClickListener(this);
        Btn5Solidaridad.setOnClickListener(this);

        LblM5 = findViewById(R.id.LblM5);
        BtnSN5 = findViewById(R.id.BtnSN5);
        BtnSN5.setOnClickListener(this);
        LayoutF5 = findViewById(R.id.LayoutF5);




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

        if (v.getId() == R.id.BtnSN2){
            LayoutF2.setVisibility(View.GONE);
            Layout1Libertad.setVisibility(View.GONE);
            Layout1Empatia.setVisibility(View.VISIBLE);
        }


        if (v.getId() == R.id.Btn3Empatia){
            LayoutF3.setVisibility(View.VISIBLE);
            LblM3.setText("FELICIDADES!!!\nRespuesta correcta");
            BtnSN3.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.Btn3Honestidad || v.getId() == R.id.Btn3Justicia || v.getId() == R.id.Btn3Solidaridad) {
            LayoutF3.setVisibility(View.VISIBLE);
            LblM3.setText("OH NO, TE HAS EQUIVOCADO!!");
            BtnSN3.setVisibility(View.GONE);
        }

        if (v.getId() == R.id.BtnSN3){
            LayoutF3.setVisibility(View.GONE);
            Layout1Empatia.setVisibility(View.GONE);
            Layout1Respeto.setVisibility(View.VISIBLE);
        }


        if (v.getId() == R.id.Btn4Solidaridad){
            LayoutF4.setVisibility(View.VISIBLE);
            LblM4.setText("FELICIDADES!!!\nRespuesta correcta");
            BtnSN4.setVisibility(View.VISIBLE);
        } else if (v.getId() == R.id.Btn4Justicia || v.getId() == R.id.Btn4Empatia || v.getId() == R.id.Btn4Respeto) {
            LayoutF4.setVisibility(View.VISIBLE);
            LblM4.setText("OH NO, TE HAS EQUIVOCADO!!");
            BtnSN4.setVisibility(View.GONE);
        }

        if (v.getId() == R.id.BtnSN4){
            LayoutF4.setVisibility(View.GONE);
            Layout1Respeto.setVisibility(View.GONE);
            Layout1Honestidad.setVisibility(View.VISIBLE);
        }



        if (v.getId() == R.id.Btn5Honestidad){
            LayoutF5.setVisibility(View.VISIBLE);
            LblM5.setText("FELICIDADES!!!\nHas terminado el juego!!");
            BtnSN5.setVisibility(View.VISIBLE);
            Layout1Honestidad.setVisibility(View.GONE);
        } else if (v.getId() == R.id.Btn5Respeto || v.getId() == R.id.Btn5Empatia || v.getId() == R.id.Btn5Solidaridad) {
            LayoutF5.setVisibility(View.VISIBLE);
            LblM5.setText("OH NO, TE HAS EQUIVOCADO!!");
            BtnSN5.setVisibility(View.GONE);
        }

        if (v.getId() == R.id.BtnSN5){
            openActivityMain();
        }

    }

    public void openActivityMain() {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
    }
}