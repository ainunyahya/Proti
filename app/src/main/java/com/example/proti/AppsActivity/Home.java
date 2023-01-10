package com.example.proti.AppsActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.proti.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {

    BottomNavigationView navBarku;
    private TextView btnSeeAll;
    private com.example.proti.widget.Search_bar pencari;
    private com.example.proti.widget.list_kategory varian1,varian2,varian3, varian4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSeeAll = (TextView) findViewById(R.id.btnSeeAll);
        pencari = (com.example.proti.widget.Search_bar) findViewById(R.id.pencariBar);
        varian1 = (com.example.proti.widget.list_kategory) findViewById(R.id.btnRoti);
        varian2 = (com.example.proti.widget.list_kategory) findViewById(R.id.btnTawar);
        varian3 = (com.example.proti.widget.list_kategory) findViewById(R.id.btnCake);
        varian4 = (com.example.proti.widget.list_kategory) findViewById(R.id.btnPie);
        navBarku = (BottomNavigationView) findViewById(R.id.navBarku);

        navBarku.setSelectedItemId(R.id.iconHome);

        btnSeeAll.setOnClickListener(view -> {
            Intent i = new Intent(Home.this, RecomendActivity.class);
            startActivity(i);
            overridePendingTransition(0,0);
        });

        varian1.setOnClickListener(view -> {
            Intent a = new Intent(Home.this, VarianRoti.class);
            startActivity(a);
            overridePendingTransition(0,0);
        });

        varian2.setOnClickListener(view -> {
            Intent b = new Intent(Home.this, VarianTawar.class);
            startActivity(b);
            overridePendingTransition(0,0);
        });

        varian3.setOnClickListener(view -> {
            Intent c = new Intent(Home.this, VarianCake.class);
            startActivity(c);
            overridePendingTransition(0,0);
        });

        varian4.setOnClickListener(view -> {
            Intent d = new Intent(Home.this, VarianPie.class);
            startActivity(d);
            overridePendingTransition(0,0);
        });

        navBarku.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.iconHome:
                        return true;

                    case R.id.iconHistory:
                        Intent intent1 = new Intent(Home.this, History.class);
                        startActivity(intent1);
                        return true;

                    case R.id.iconSearch:
                        Intent intent2 = new Intent(Home.this, Search.class);
                        startActivity(intent2);
                        return true;

                    case R.id.iconMessage:
                        Intent intent3 = new Intent(Home.this, Messages.class);
                        startActivity(intent3);
                        return true;

                    case R.id.iconAkun:
                        Intent intent4 = new Intent(Home.this, Account.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        });

    }
}