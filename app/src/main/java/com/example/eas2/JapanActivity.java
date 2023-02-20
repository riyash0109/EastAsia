package com.example.eas2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class JapanActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japan);

        //Hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigationDrawerOpen, R.string.navigationDrawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new HomeFragmentJapan()).commit();


            navigationView.bringToFront();
            navigationView.setNavigationItemSelectedListener(this);

            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new HomeFragmentJapan()).commit();
                break;
            case R.id.nav_education:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new EducationFragmentJapan()).commit();
                break;

            case R.id.nav_fellowship:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new FellowshipFragmentJapan()).commit();
                break;
            case R.id.nav_scholarship:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ScholarshipFragmentJapan()).commit();
                break;
            case R.id.nav_exchanges:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ExchangesFragmentJapan()).commit();
                break;
            case R.id.nav_conferences:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ConferencesFragmentJapan()).commit();
                break;
            case R.id.nav_finAid:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new FinancialAidFragmentJapan()).commit();
                break;
            case R.id.nav_internships:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new InternshipsFragmentJapan()).commit();
                break;
            case R.id.nav_univ_college:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new UniversityCollegeFragmentJapan()).commit();
                break;
            case R.id.nav_fundAgencies:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new FundAgenciesFragmentJapan()).commit();
                break;

        }

        //closes the drawer, when an item is selected
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}