package com.welcome.ciclovida;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Menu extends Fragment {
    // VOY A EMPEZAR AQUÍ A CONFIGURAR LA PARTE LÓGICA DEL FRAGMENT

    Button boton1, boton2, boton3, boton4;
    View rootView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.menu, container, false );
        boton1 = rootView.findViewById(R.id.boton1);
        boton2 = rootView.findViewById(R.id.boton2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Funciona el TOAST", Toast.LENGTH_SHORT).show();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getActivity(), MainActivity2.class);
               startActivity(intent);

            }
        });



        return rootView;

    }

}
