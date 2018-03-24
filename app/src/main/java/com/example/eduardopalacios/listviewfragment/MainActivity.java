package com.example.eduardopalacios.listviewfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.eduardopalacios.listviewfragment.Interfaces.Cominicador;

public class MainActivity extends AppCompatActivity implements Cominicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void enviarDatos(int imagen) {
        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentResultado fragmentResultado=(FragmentResultado) fragmentManager.findFragmentById(R.id.fragmentResultado);
        fragmentResultado.colocarImagen(imagen);
    }
}
