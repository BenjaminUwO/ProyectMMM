package com.example.proyectommm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button BtnValores, BtnNombre, BtnCuest, BtnLecturas;
    TextView LblSaludo, LblPuntValores;
    EditText TxtNombre;
    LinearLayout ContJuegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnNombre = findViewById(R.id.BtnNombre);
        BtnValores = findViewById(R.id.BtnValores);
        LblSaludo = findViewById(R.id.LblSaludo);
        LblPuntValores = findViewById(R.id.LblSaludo);
        TxtNombre = findViewById(R.id.TxtNombre);
        ContJuegos = findViewById(R.id.ContJuegos);
        BtnCuest = findViewById(R.id.BtnCuest);
        BtnLecturas = findViewById(R.id.BtnLecturas);


        BtnNombre.setOnClickListener(this);
        BtnValores.setOnClickListener(this);
        BtnLecturas.setOnClickListener(this);
        BtnCuest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String NombreUsuario;

        switch (v.getId()){
            case R.id.BtnNombre:
                NombreUsuario = String.valueOf(TxtNombre.getText().toString());
                LblSaludo.setText("Hola "+NombreUsuario);
                ContJuegos.setVisibility(View.VISIBLE);
                break;
            case R.id.BtnValores:
                openActivityValores();
                break;
            case R.id.BtnCuest:
                openActivityCuestionario();
                break;
            case R.id.BtnLecturas:
                openActivityLecturas();
                break;
        }
    }

    public void openActivityValores() {
        Intent intentValores = new Intent(this, Activity_Valores.class);
        startActivity(intentValores);
    }
    public void openActivityCuestionario() {
        Intent intentCuestionario = new Intent(this, Activity_Cuestionario.class);
        startActivity(intentCuestionario);
    }
    public void openActivityLecturas() {
        Intent intentLecturas = new Intent(this, ActivityMenuLecturas.class);
        startActivity(intentLecturas);
    }
}