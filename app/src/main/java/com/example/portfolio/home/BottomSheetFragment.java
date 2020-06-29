package com.example.portfolio.home;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolio.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/*
 */

public class BottomSheetFragment extends BottomSheetDialogFragment {



    public BottomSheetFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
    }


}

