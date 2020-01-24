package com.example.kino;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ReportFragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.navigation.NavigationView;

public class Menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        FragmentTransaction ft1 = getFragmentManager().beginTransaction();
        ft1.replace(R.id.fragment_container, new ReportFragment());
        ft1.commit();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toogle);
        toogle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ZapowiedzFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_zapowiedz);
        }

    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_zapowiedz:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ZapowiedzFragment()).commit();
                break;
            case R.id.nav_rapaciu:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ReperciuFragment()).commit();
                break;
            case R.id.nav_ustawienia:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UstawieniaFragment()).commit();
                break;
            case R.id.nav_konto:
                startActivity(new Intent(Menu.this, MainActivity.class));
                break;
            case R.id.nav_cennik:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CennikFragment()).commit();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;


    }
}