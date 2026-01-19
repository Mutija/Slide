package com.example.slide_v20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavTest extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_test);

        frameLayout = findViewById(R.id.frameLayout);
        bottomNav = findViewById(R.id.bottomNav);

        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemID = item.getItemId();

                if(itemID == R.id.navHome){

                    loadFragment(new Home(), false);

                }
                else if (itemID == R.id.navChat){

                    loadFragment(new ChatFragment(), false);

                }
                else if (itemID == R.id.navNot) {

                    loadFragment(new NotificationFragment(), false);

                } else /*Profile*/ {

                    loadFragment(new ProfileFragment(), false);

                }


                    return true;

            }

        });
        if (savedInstanceState == null) {
            loadFragment(new Home(), true);
        }
    }

    private void loadFragment(Fragment fragment, boolean isAppInitialized) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(isAppInitialized){

            fragmentTransaction.add(R.id.frameLayout, fragment);

        }else{

            fragmentTransaction.replace(R.id.frameLayout, fragment);

        }
        fragmentTransaction.commit();

    }
}

