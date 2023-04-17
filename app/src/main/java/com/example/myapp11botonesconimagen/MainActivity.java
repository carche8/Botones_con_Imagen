package com.example.myapp11botonesconimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mensaje(View view) {

        Toast.makeText(this, "Despliega, has ganado un viaje", Toast.LENGTH_LONG).show();
    }
    public void Mensaje(View2 view) {

        Toast.makeText(this, "Estrellita", Toast.LENGTH_LONG).show();
    }
    public void Mensaje(View3 view) {

        Toast.makeText(this, "Grabando", Toast.LENGTH_LONG).show();
    }
    public void Mensaje(View4 view) {

        Toast.makeText(this, "Te dejo en espera", Toast.LENGTH_LONG).show();
    }









}