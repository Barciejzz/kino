package com.example.kino;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class KontoFragment extends Fragment {

    View view;
    private Button Wyloguj;
    private Button Dodaj;
    private Button Dodaj_Kino;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    public KontoFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(getContext(), MainActivity.class));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.activity_main2, container, false);

        Wyloguj = (Button)view.findViewById(R.id.P_wyloguj);
        Dodaj = view.findViewById(R.id.D_miasto);
        Dodaj_Kino = (Button)view.findViewById(R.id.D_kino);
        mAuth = FirebaseAuth.getInstance();

        Dodaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new doajMiastofragment()).commit();
            }
        });

        Wyloguj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(getContext(), MainActivity.class));
            }
            private void signOut() {
                mAuth.signOut();

            }
        });



        return view;
    }


}
