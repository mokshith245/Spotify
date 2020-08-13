package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFrag = null;

                switch (item.getItemId()){
                    case  R.id.nav_home:
                        selectedFrag = new HomeFragment();
                        break;
                    case  R.id.nav_search:
                        selectedFrag = new SearchFragment();
                        break;
                    case  R.id.nav_library:
                        selectedFrag = new LibraryFragment();
                        break;
                    case  R.id.nav_settings:
                        selectedFrag = new SettingsFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFrag).commit();
                return true;
            }
        });
    }

}
