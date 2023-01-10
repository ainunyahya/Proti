package com.example.proti.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.proti.R;

public class Reset_Password_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password2);

        final ImageView back = findViewById(R.id.back);
        final EditText password = findViewById(R.id.password);
        final EditText confirmPass = findViewById(R.id.confirmPassword);

        final AppCompatButton sendBtn = findViewById(R.id.sendBtn);

        back.setOnClickListener(view -> {
            startActivity(new Intent(Reset_Password_2.this, Reset_Password_1.class));
            overridePendingTransition(0,0);
        });

        sendBtn.setOnClickListener(view -> {
            startActivity(new Intent(Reset_Password_2.this, Login.class));
            overridePendingTransition(0,0);
        });

    }
}