package com.example.proti.LoginRegister;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proti.AppsActivity.Home;
import com.example.proti.R;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {

    private final static int RC_SIGN_IN = 2;
    GoogleSignInClient mGoogleSignInClient;
    FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;

    private ImageView back;
    private EditText email;
    private EditText password;
    private TextView forgotPass;
    private AppCompatButton loginBtn;
    private TextView registerBtn_1;
    private AppCompatButton loginGoogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();

        back = (ImageView) findViewById(R.id.backBtn);
        email = (EditText) findViewById(R.id.emailAddressET);
        password = (EditText) findViewById(R.id.passwordET);
        forgotPass = (TextView) findViewById(R.id.forgotPasswordBtn);
        loginBtn = (AppCompatButton) findViewById(R.id.loginBtn);
        registerBtn_1 = (TextView) findViewById(R.id.registerBtn1);
        loginGoogle = (AppCompatButton) findViewById(R.id.loginWithGoogle);

        back.setOnClickListener(view -> {
            startActivity(new Intent(Login.this, Splash_Screen_1.class));
            overridePendingTransition(0,0);
        });

        forgotPass.setOnClickListener(view -> {
            startActivity(new Intent(Login.this, Reset_Password.class));
            overridePendingTransition(0,0);
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ceklogin();
            }
        });
        

        registerBtn_1.setOnClickListener(view -> {
            startActivity(new Intent(Login.this, Register.class));
            overridePendingTransition(0,0);
        });

        loginGoogle.setOnClickListener(view -> {
            startActivity(new Intent(Login.this, Home.class));
            overridePendingTransition(0,0);
        });
    }

    private void ceklogin() {
        String Eemail = email.getText().toString();
        String Ppassword = password.getText().toString();

        mAuth.signInWithEmailAndPassword(Eemail,Ppassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(Login.this,"Berhasil Login!!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Login.this, Home.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(Login.this,"Gagal Login!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}