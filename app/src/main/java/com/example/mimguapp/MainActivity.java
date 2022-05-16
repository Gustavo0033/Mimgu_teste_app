package com.example.mimguapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View btn_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_entrar = findViewById(R.id.btn_entrar);

        btn_entrar.setOnClickListener(View ->{
                Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(Intent);
        });

    }
}