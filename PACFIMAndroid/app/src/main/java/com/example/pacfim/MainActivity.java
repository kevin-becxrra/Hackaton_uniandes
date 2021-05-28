package com.example.pacfim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view)
    {
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, FirstActivity.class);
        startActivity(i);
    }
}
