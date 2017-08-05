package com.oneup.thetaproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentGroups extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) getView().findViewById(R.id.toolbarGroups);

        View view = inflater.inflate(R.layout.fragment_groups, container, false);
        //AppCompatActivity activity = (AppCompatActivity) getActivity();
        android.support.v7.widget.Toolbar toolbarGroups = (android.support.v7.widget.Toolbar) view.findViewById(R.id.toolbarGroups);
        //activity.setSupportActionBar(toolbarGroups);

        return view;
    }

}
