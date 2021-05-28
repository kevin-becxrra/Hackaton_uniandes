package com.example.pacfim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Cliente extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        spinner = (Spinner)findViewById(R.id.spinner);
        String [] opciones = {"Aguacate", "Papa", "Arroz", "Yuca", "Fresa", "Mango"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(arrayAdapter);
    }
}
