package com.example.kino;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class ReperciuFragment extends Fragment {

    View view;
    private ImageButton joker;
    private ImageButton k_lew;
    private Button button24;


    public ReperciuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_reperciu, container, false);

        joker = (ImageButton) view.findViewById(R.id.B_Joker);
        k_lew = (ImageButton) view.findViewById(R.id.B_Krol_lew);
        button24 = (Button) view.findViewById(R.id.But_24D);


        joker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new JokerFragment()).commit();
            }
        });

        k_lew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new KrolLewFragment()).commit();
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new dwaczteryFragment()).commit();
            }
        });


        return view;


    }
}

