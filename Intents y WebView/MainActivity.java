package com.welcome.app_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textoUsuario, textoPassword;
    EditText editarUsuario, editarPassword;
    Button boton, boton2, boton3, boton4;
    WebView paginaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoUsuario = (TextView) findViewById(R.id.textview1);
        textoPassword = findViewById(R.id.textview2);
        editarUsuario = findViewById(R.id.edittext1);
        editarPassword = findViewById(R.id.edittext2);
        boton = findViewById(R.id.toast);
        boton2 = findViewById(R.id.cambioActivity);
        boton3 = findViewById(R.id.llamar);
        boton4 = findViewById(R.id.mandarSMS);
        paginaWeb = findViewById(R.id.webView);

        // configuración webView

        paginaWeb.getSettings().setJavaScriptEnabled(true);
        // Secondly, I will add an url
        paginaWeb.loadUrl("https://autocarsdelpenedes.com");
        paginaWeb.setWebViewClient(new WebViewClient()
        {
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });


        boton.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.toast: toast();
                break;
            case R.id.cambioActivity: cambio();
                break;
            case R.id.llamar:
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) ==
                        PackageManager.PERMISSION_GRANTED){
                    llamar();
                } else {
                    Toast.makeText(getApplicationContext(), "NO HAY PERMISOS", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.mandarSMS: mensaje();
                break;
        }
    }

    private void toast() {
        Toast.makeText(getApplicationContext(), "Hola, soy un TOAST", Toast.LENGTH_SHORT).show();
    }

    private void cambio() {
        Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(intent);
    }

    private void llamar(){
        Uri uri = Uri.parse("tel:615919191");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        // Intent intent = new Intent(Intent.ACTION_CALL, uri);
        startActivity(intent);
    }

    private void mensaje(){
        /*Uri uri = Uri.parse("smsto:988162758");
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
       // Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.putExtra("subject", "SOS");
        intent.putExtra("sms_body", "Help please");
        startActivity(intent); */

        String messageToSend = "this is the message";
        //String number = "615916610";
        SmsManager.getDefault().sendTextMessage("615916060", null, messageToSend, null, null);
    }


}
