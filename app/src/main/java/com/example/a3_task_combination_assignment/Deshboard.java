package com.example.a3_task_combination_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Deshboard extends AppCompatActivity {
    Button btn_task1,btn_task2,btn_task3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deshboard);
        btn_task1 = findViewById(R.id.btn_json);
        btn_task2 = findViewById(R.id.btn_nav_map);
        btn_task3 = findViewById(R.id.btn_firebase);

        btn_task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deshboard.this,Task1_Deshboard.class);
                startActivity(intent);
            }
        });
        btn_task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deshboard.this,Task2_Deshboard.class);
                startActivity(intent);
            }
        });
        btn_task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deshboard.this,Task3_Deshboard.class);
                startActivity(intent);
            }
        });
    }
}