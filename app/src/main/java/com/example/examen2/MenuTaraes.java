package com.example.examen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuTaraes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_taraes);
        Button BtChats = findViewById(R.id.BtChats);
        Button BtTarea = findViewById(R.id.BtTareas);
        Button BtSourse = findViewById(R.id.BtSourse);
        Button BtNews = findViewById(R.id.BtNews);
        BtChats.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(), MainActivity.class);
            startActivity(intent);
        });
        BtTarea.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(),MenuTaraes.class);
            startActivity(intent);
        });
        BtSourse.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(),activity_menu_recursos.class);
            startActivity(intent);
        });
        BtNews.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(),activity_Menu_News.class);
            startActivity(intent);
        });

    }
}