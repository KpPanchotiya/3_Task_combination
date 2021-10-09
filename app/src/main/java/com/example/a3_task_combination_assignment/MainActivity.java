package com.example.a3_task_combination_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLESH_SCREEN = 5000;
    Animation topAnim,bottonAnim;
    ImageView spleshImage;
    TextView spleshTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        spleshImage = findViewById(R.id.splesh_logo);
        spleshTv = findViewById(R.id.welcome_text);

        spleshImage.setAnimation(topAnim);
        spleshTv.setAnimation(bottonAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Deshboard.class);
                startActivity(intent);
                finish();
            }
        },SPLESH_SCREEN);
    }
}