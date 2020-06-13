package com.example.portfolio.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentTeam extends Fragment {


    public fragmentTeam() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View teamView = inflater.inflate(R.layout.fragment_fragment_team, container, false);
        return teamView;
    }

}
