package com.example.examen2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btMainLink1 = findViewById(R.id.bt_LoginN);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(),activity_menu.class);
            startActivity(intent);


        });
    }
}