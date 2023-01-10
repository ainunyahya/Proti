package com.example.proti.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.proti.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Reset_Password extends AppCompatActivity {

    private ImageView back;
    private EditText emailAddressET;
    private AppCompatButton sendBtn;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        back = (ImageView) findViewById(R.id.back);
        emailAddressET = (EditText) findViewById(R.id.emailAddressET);
        sendBtn = (AppCompatButton) findViewById(R.id.sendBtn);

        back.setOnClickListener(view -> {
            startActivity(new Intent(Reset_Password.this, Login.class));
            overridePendingTransition(0,0);
        });

        sendBtn.setOnClickListener(view -> {
            startActivity(new Intent(Reset_Password.this, Reset_Password_1.class));
            overridePendingTransition(0,0);
        });

    }
}