package com.welcome.app_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{

    //1º paso - instanciar objetos a utilizar

    TextView textoUsuario, textoPassword;
    EditText editarUsuario, editarPassword;
    Button boton, boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // 2º paso - vinculo con las ID del layout

        textoUsuario = (TextView) findViewById(R.id.textview1);
        textoPassword = findViewById(R.id.textview2);
        editarUsuario = findViewById(R.id.edittext1);
        editarPassword = findViewById(R.id.edittext2);
        boton = findViewById(R.id.boton);
        boton2 = findViewById(R.id.boton2);

        // 3º paso - ACTIVAR BOTONES...

        boton.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        // 4º paso - darle funciones a los botones al clicar, en este caso usando un switch

        switch (v.getId()){
            case R.id.boton:  Toast.makeText(getApplicationContext(), "Hola, soy un TOAST", Toast.LENGTH_SHORT).show();
            break;
            case R.id.boton2:  Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}

        /*
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hola, soy un TOAST", Toast.LENGTH_SHORT).show();

            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        */