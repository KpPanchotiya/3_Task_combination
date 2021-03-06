package com.example.a3_task_combination_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Task3_SendDataActivity extends AppCompatActivity {
    EditText et_name,et_contactNo,et_city;
    Button send;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3_send_data);
        et_name = findViewById(R.id.s_name);
        et_contactNo = findViewById(R.id.s_no);
        et_city = findViewById(R.id.s_city);
        send = findViewById(R.id.s_send_btn);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("Students");
        //just like setonclick listner but the write in different ways
        send.setOnClickListener(view -> {
            insertData();
        });
    }
    private void insertData() {
        String sname = et_name.getText().toString();
        String scontact = et_contactNo.getText().toString();
        String scity = et_city.getText().toString();
        if (sname.isEmpty() || scontact.isEmpty() || scity.isEmpty()){
            Toast.makeText(Task3_SendDataActivity.this,"please enter details",Toast.LENGTH_SHORT).show();
        }
        else {
            Students students = new Students(sname,scontact,scity);
            databaseReference.push().setValue(students);
            Toast.makeText(Task3_SendDataActivity.this,"data is send",Toast.LENGTH_LONG).show();
            startActivity(new Intent(Task3_SendDataActivity.this,Task3_Deshboard.class));
        }
    }
}