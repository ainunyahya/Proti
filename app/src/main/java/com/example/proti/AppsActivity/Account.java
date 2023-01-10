package com.example.proti.AppsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.proti.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Account extends AppCompatActivity {

    BottomNavigationView navBarku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        navBarku = (BottomNavigationView) findViewById(R.id.navBarku);

        navBarku.setSelectedItemId(R.id.iconAkun);

        navBarku.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.iconAkun:
                        return true;

                    case R.id.iconHome:
                        Intent intent1 = new Intent(Account.this, Home.class);
                        startActivity(intent1);
                        return true;

                    case R.id.iconHistory:
                        Intent intent2 = new Intent(Account.this, History.class);
                        startActivity(intent2);
                        return true;

                    case R.id.iconSearch:
                        Intent intent3 = new Intent(Account.this, Search.class);
                        startActivity(intent3);
                        return true;

                    case R.id.iconMessage:
                        Intent intent4 = new Intent(Account.this, Messages.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        });

    }
}