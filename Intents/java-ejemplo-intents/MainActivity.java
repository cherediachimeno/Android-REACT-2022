package com.welcome.app_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textoUsuario, textoPassword;
    EditText editarUsuario, editarPassword;
    Button boton, boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoUsuario = (TextView) findViewById(R.id.textview1);
        textoPassword = findViewById(R.id.textview2);
        editarUsuario = findViewById(R.id.edittext1);
        editarPassword = findViewById(R.id.edittext2);
        boton = findViewById(R.id.boton);
        boton2 = findViewById(R.id.boton2);

        boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Hola, soy un TOAST", Toast.LENGTH_SHORT).show();

                }
            });

        boton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);
            }
        });

    }

}