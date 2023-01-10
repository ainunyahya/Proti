package com.example.proti.AppsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.proti.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class VarianTawar extends AppCompatActivity {

    private ImageView btnKembali;
    private BottomNavigationView navBarku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varian_tawar);

        btnKembali = (ImageView) findViewById(R.id.btnReturn);

        navBarku = (BottomNavigationView) findViewById(R.id.navBarku);

        navBarku.setSelectedItemId(R.id.iconHome);

        btnKembali.setOnClickListener(view -> {
            Intent i = new Intent(VarianTawar.this, Home.class);
            startActivity(i);
            overridePendingTransition(0,0);
        });

        navBarku.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.iconHome:
                        Intent intent5 = new Intent(VarianTawar.this, History.class);
                        startActivity(intent5);
                        return true;

                    case R.id.iconHistory:
                        Intent intent1 = new Intent(VarianTawar.this, History.class);
                        startActivity(intent1);
                        return true;

                    case R.id.iconSearch:
                        Intent intent2 = new Intent(VarianTawar.this, Search.class);
                        startActivity(intent2);
                        return true;

                    case R.id.iconMessage:
                        Intent intent3 = new Intent(VarianTawar.this, Messages.class);
                        startActivity(intent3);
                        return true;

                    case R.id.iconAkun:
                        Intent intent4 = new Intent(VarianTawar.this, Account.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        });

    }
}