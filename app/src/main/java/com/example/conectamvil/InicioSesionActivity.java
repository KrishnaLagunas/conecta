package com.example.conectamvil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InicioSesionActivity extends AppCompatActivity {

    TextView txtRegistrarte;
    private Button btnIniciar;
    private EditText editCorreo2;
    private EditText editContraseña;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        txtRegistrarte=findViewById(R.id.txtRegistrarte);
        editCorreo2= findViewById(R.id.editCorreo2);
        editContraseña= findViewById(R.id.editContraseña);

        btnIniciar = findViewById(R.id.btnIniciar);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo= editCorreo2.getText().toString();
                String contraseña= editContraseña.getText().toString();

                //base de datos

                Intent intent = new Intent(InicioSesionActivity.this, ListaActivity.class );


            }
        });

        txtRegistrarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(InicioSesionActivity.this, RegistroActivity.class);
            }
        });


    }


}