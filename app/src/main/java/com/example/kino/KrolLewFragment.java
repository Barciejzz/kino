package com.example.kino;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class KrolLewFragment extends Fragment {

    View view;
    private Button But11;
    private Button But14;
    private Button But1310;
    public KrolLewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_krol_lew, container, false);

        But11 = (Button)view.findViewById(R.id.Dub_KL_Button_11_00);
        But14 = (Button)view.findViewById(R.id.Dub_KL_Button_14_20);
        But1310 = (Button)view.findViewById(R.id.Nap_KL_Button_13_10);

        But11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new SalaOneFirstseansFragment()).commit();
            }
        });
        But14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new SalaOneSecondseansKrolLewFragment()).commit();
            }
        });


        But1310.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getFragmentManager().beginTransaction().replace(R.id.fragment_container, new SalaDrugaNapisyKrollewFragment()).commit();
        }
    });




        return view;
    }




}
