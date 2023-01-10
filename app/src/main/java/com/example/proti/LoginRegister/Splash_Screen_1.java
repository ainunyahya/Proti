package com.example.proti.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.example.proti.R;

public class Splash_Screen_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen1);

        final AppCompatButton login = findViewById(R.id.loginBtn);
        final AppCompatButton register = findViewById(R.id.registerBtn);


        login.setOnClickListener(view -> {
            startActivity(new Intent(Splash_Screen_1.this, Login.class));
            overridePendingTransition(0,0);
        });

        register.setOnClickListener(view -> {
            startActivity(new Intent(Splash_Screen_1.this, Register.class));
            overridePendingTransition(0,0);
        });

    }
}