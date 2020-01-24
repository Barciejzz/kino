package com.example.kino;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Email_nazwiskokFragment extends Fragment {

    View view;
    private EditText nazwisko;
    private EditText emailik;
    private EditText nrtel;
    private Button zatwierdz;

    public Email_nazwiskokFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_email_nazwiskok, container, false);

        nazwisko = (EditText)view.findViewById(R.id.ImieNazwisko);
        emailik  = (EditText)view.findViewById(R.id.emailen);
        nrtel = (EditText)view.findViewById(R.id.NrTel);
        zatwierdz = (Button)view.findViewById(R.id.zatwierdz);

        zatwierdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new EkranKoncowyFragment()).commit();
            }
        });



        return view;
    }


}
