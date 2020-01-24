package com.example.kino;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class JokerFragment extends Fragment {

   View view;
   private Button button1300;


    public JokerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_joker, container, false);

        button1300 = (Button)view.findViewById(R.id.Dub_Jo_Button_13_00);

        button1300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new Sala3forjokerFragment()).commit();
            }
        });


        return view;
    }

}