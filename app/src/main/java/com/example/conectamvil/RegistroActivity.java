package com.example.conectamvil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {
    private EditText editNombre;
    private EditText editApellido;
    private EditText editCorreo2;
    private EditText editContraseña;
    private Button btnGuardar;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        editNombre=findViewById(R.id.editNombre);
        editApellido= findViewById(R.id.editApellido);
        editCorreo2= findViewById(R.id.editCorreo2);
        editContraseña=findViewById(R.id.editContraseña1);

        btnGuardar=findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre= editNombre.getText().toString();
                String apellido= editApellido.getText().toString();
                String correo= editCorreo2.getText().toString();
                String contraseña= editContraseña.getText().toString();

                //base de datos

                Intent intent = new Intent(RegistroActivity.this, ListaActivity.class );


            }
        });

    }
}