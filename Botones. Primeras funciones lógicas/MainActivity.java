package com.welcome.tutoria7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // EL PRIMER GRAN PASO, VA A SER DECLARAR LOS ELEMENTOS A UTILIZAR...
    // YO TENGO UN TEXTVIEW, UN EDITTEXT Y UN BOTON... CREO OBJETOS A PARTIR DE LAS CLASES
    TextView miTexto;
    EditText miEditText;
    Button miBoton, miBoton2, miBoton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SEGUNDO GRAN PASO ES CONECTAR LOS OBJETOS
        // CREADOS (EL TEXTVIEW, EDITTEXT, BUTTON)
        // CON LOS ELEMENTOS QUE ESTÁN EN EL LAYOUT.

        miTexto = findViewById(R.id.texto);
        miEditText = findViewById(R.id.editarTexto);
        miBoton = findViewById(R.id.boton);
        miBoton2 = findViewById(R.id.boton2);
        miBoton3 = findViewById(R.id.boton3);

        miBoton.setOnClickListener(this);
        miBoton2.setOnClickListener(this);
        miBoton3.setOnClickListener(this);

        // TERCER PASO: PROGRAMAR LO QUE NOS INTERESE...

        /*
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String texto = miEditText.getText().toString();
            miTexto.setText(texto);
            }
        });

        miBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Esto es un TOAST", Toast.LENGTH_LONG).show();
            }
        });

        miBoton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    */

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.boton:
                //Actions to execute if the user clicks on the button called "boton".
                String texto = miEditText.getText().toString();
                miTexto.setText(texto);
                break;
            case R.id.boton2:
                Toast.makeText(getApplicationContext(), "Esto es un TOAST", Toast.LENGTH_LONG).show();
                //Actions to execute if the user clicks on my button called "toast
                break;
            case R.id.boton3:

                break;
        }

    }
}