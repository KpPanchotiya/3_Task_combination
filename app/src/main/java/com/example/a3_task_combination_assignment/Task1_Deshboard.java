package com.example.a3_task_combination_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Task1_Deshboard extends AppCompatActivity {
    TextView tv_splash_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1_deshboard);
        getSupportActionBar().hide();
        tv_splash_text = findViewById(R.id.splash_text);
        tv_splash_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Task1_Deshboard.this, Task1_Activity1.class);
                startActivity(myIntent);
            }
        });
    }
}