package com.example.proti.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.proti.R;

public class Reset_Password_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password1);

        final AppCompatButton openEmail = findViewById(R.id.openEmailBtn);
        final TextView lewatiBtn = findViewById(R.id.lewatiBtn);

        openEmail.setOnClickListener(view -> {
            startActivity(new Intent(Reset_Password_1.this, Reset_Password_2.class));
            overridePendingTransition(0,0);
        });

        lewatiBtn.setOnClickListener(view -> {
            startActivity(new Intent(Reset_Password_1.this, Login.class));
            overridePendingTransition(0,0);
        });

    }
}