package com.example.proti.LoginRegister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.proti.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    private ImageView back;
    private EditText namaUser, emailAddress, password;
    private AppCompatButton sendBtn;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        back = (ImageView) findViewById(R.id.back);
        namaUser = (EditText) findViewById(R.id.namaUser);
        emailAddress = (EditText) findViewById(R.id.emailAddress);
        password = (EditText) findViewById(R.id.password);
        sendBtn = (AppCompatButton) findViewById(R.id.registerBtn);

        back.setOnClickListener(view -> {
            startActivity(new Intent(Register.this, Splash_Screen_1.class));
            overridePendingTransition(0,0);
        });

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

    }

    private void register() {
        String email = emailAddress.getText().toString();
        String Ppassword = password.getText().toString();

        mAuth.createUserWithEmailAndPassword(email,Ppassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(Register.this,"Berhasil Daftar!!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Register.this, Login.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(Register.this,"Gagal Daftar!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}