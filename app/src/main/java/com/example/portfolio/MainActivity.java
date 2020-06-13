package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.portfolio.home.HomeFragment;

public class MainActivity extends AppCompatActivity {
     private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().hide();
        setHomeFragment();

    }
    void setHomeFragment() {

    }

}
