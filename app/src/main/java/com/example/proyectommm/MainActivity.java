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

    Button BtnValores, BtnNombre;
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

        BtnNombre.setOnClickListener(this);
        BtnValores.setOnClickListener(this);


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
        }
    }

    public void openActivityValores() {
        Intent intentValores = new Intent(this, Activity_Valores.class);
        startActivity(intentValores);
    }
}