package com.example.pacfim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    private Cooperativa cooperativa;
    Persona laQueIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        laQueIngreso = new Persona("Pedro Hernández", "1128387054");
        cooperativa = new Cooperativa();
        cooperativa.agregarPersona("Pedro Hernández", "1128387054");
        cooperativa.agregarPersona("Juan Ramírez", "34997675");
        cooperativa.agregarPersona("María Quiroga", "1017152334");
        cooperativa.agregarPersona("Edith Rosales", "70661470");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public String darNombreUsuario(View view)
    {
        return laQueIngreso.getNombre();
    }

    public void pasarAlCliente(View view)
    {
        Intent i = new Intent(this, Cliente.class);
        startActivity(i);
    }

}