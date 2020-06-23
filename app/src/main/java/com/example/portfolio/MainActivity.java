package com.example.portfolio;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.portfolio.home.HomeFragment;
import com.example.portfolio.home.fragmentContact;
import com.example.portfolio.home.fragmentPortfolio;
import com.example.portfolio.home.fragmentTeam;
import com.example.portfolio.home.workFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create and set Android Fragment as default.
        Fragment HomeFragment = new HomeFragment();
        this.setDefaultFragment(HomeFragment);

        // Click this button to display android fragment.
        ImageView homeImage = findViewById(R.id.imageView);
         homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment HomeFragment = new HomeFragment();
                replaceFragment(HomeFragment);
            }
        });

        // Click this button to display windows fragment.
        ImageView workImage = findViewById(R.id.imageView2);
        workImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment workFragment = new workFragment();
                replaceFragment(workFragment);
            }
        });

        // Click this button to display iOS fragment.
        ImageView portfolio = findViewById(R.id.imageView3);
        portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentPortfolio = new fragmentPortfolio();
                replaceFragment(fragmentPortfolio);
            }
        });

        // Click this button to display iOS fragment.
        ImageView teamImage = findViewById(R.id.imageView4);
        teamImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentTeam = new fragmentTeam();
                replaceFragment(fragmentTeam);
            }
        });

        // Click this button to display iOS fragment.
        ImageView contactImage = findViewById(R.id.imageView5);
        contactImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentContact = new fragmentContact();
                replaceFragment(fragmentContact);
            }
        });

    }

    // This method is used to set the default fragment that will be shown.
    private void setDefaultFragment(Fragment defaultFragment)
    {
        this.replaceFragment(defaultFragment);
    }

    // Replace current Fragment with the destination Fragment.
    public void replaceFragment(Fragment destFragment)
    {
        // First get FragmentManager object.
        FragmentManager fragmentManager = this.getSupportFragmentManager();

        // Begin Fragment transaction.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the layout holder with the required Fragment object.
        fragmentTransaction.replace(R.id.LinearLayout, destFragment);

        // Commit the Fragment replace action.
        fragmentTransaction.commit();
      
    }



}
