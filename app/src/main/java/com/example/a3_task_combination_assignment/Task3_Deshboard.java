package com.example.a3_task_combination_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Task3_Deshboard extends AppCompatActivity {
    Button logout,send,show;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3_deshboard);
        logout = findViewById(R.id.Deshboard_logout);
        send = findViewById(R.id.deshboard_send_btn);
        show = findViewById(R.id.deshboard_show_btn);
        auth = FirebaseAuth.getInstance();
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                startActivity(new Intent(Task3_Deshboard.this,Task3_loginActivity.class));
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Task3_Deshboard.this,Task3_SendDataActivity.class));
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Task3_Deshboard.this,Task3_ShowDataActivity.class));
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        FirebaseUser user = auth.getCurrentUser();
        if (user == null){
            startActivity(new Intent(Task3_Deshboard.this,Task3_loginActivity.class));
        }
    }
}