package com.example.portfolio.controller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.portfolio.home.HomeFragment;
import com.example.portfolio.home.fragmentContact;
import com.example.portfolio.home.fragmentPortfolio;
import com.example.portfolio.home.fragmentTeam;
import com.example.portfolio.home.workFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new HomeFragment();
            case 1: return new workFragment();
            case 2: return new fragmentPortfolio();
            case 3: return new fragmentTeam();
            case 4: return new fragmentContact();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
