package com.example.examen2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btMainLink1 = findViewById(R.id.BtChats);
        btMainLink1.setOnClickListener(v -> {
            Intent intent = new Intent (v.getContext(),activity_menu.class);
            startActivity(intent);

            Button btMainLink2 = findViewById(R.id.BtTareas);
            btMainLink1.setOnClickListener(v -> {
                Intent intent = new Intent (v.getContext(), activity_menu_tareas.class);
                startActivity(intent);

        });
    }
}