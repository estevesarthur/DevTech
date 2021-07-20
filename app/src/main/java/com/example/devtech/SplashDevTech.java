package com.example.devtech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashDevTech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_devtech);

        Handler handler = new Handler();
        handler.postDelayed(() ->  {
            startActivity(new Intent(SplashDevTech.this, MainActivity.class));
        }, 4000);
    }
}

