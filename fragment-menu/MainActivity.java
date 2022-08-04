package com.welcome.ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "DATO";
    TextView textview;
    EditText edittext;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        textview = findViewById(R.id.texto);
        edittext = findViewById(R.id.editText);
        boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(edittext.getText().toString());
            }
        });
    }

    // PRIMER MÉTODO PARA GUARDAR INFORMACIÓN
    // GRAN "PEGA": HAY QUE ESPECIFICAR EXACTAMENTE QUÉ VAMOS A GUARDAR

    public void onSaveInstanceState(Bundle outState) {
        outState.putString("información Guardada", textview.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    // SEGUNDO MÉTODO: RECUPERAMOS LA INFORMACIÓN GUARDADA

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textview.setText(savedInstanceState.getString("información Guardada"));
        Log.d(TAG, "onRestoreInstanceState");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}