package com.example.proti.AppsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.proti.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class History extends AppCompatActivity {

    BottomNavigationView navBarku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        navBarku = (BottomNavigationView) findViewById(R.id.navBarku);

        navBarku.setSelectedItemId(R.id.iconHistory);

        navBarku.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.iconHistory:
                        return true;

                    case R.id.iconHome:
                        Intent intent1 = new Intent(History.this, Home.class);
                        startActivity(intent1);
                        return true;

                    case R.id.iconSearch:
                        Intent intent2 = new Intent(History.this, Search.class);
                        startActivity(intent2);
                        return true;

                    case R.id.iconMessage:
                        Intent intent3 = new Intent(History.this, Messages.class);
                        startActivity(intent3);
                        return true;

                    case R.id.iconAkun:
                        Intent intent4 = new Intent(History.this, Account.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        });

    }
}