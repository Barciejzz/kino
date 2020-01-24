package com.example.kino;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class Sala3forjokerFragment extends Fragment {

    View view;
    ListView listass;
    ListView listass2;
    private Button Pdalej2;

    String[] stringss = {"RIM1","RIM2","RIM3","RIM4","RIM5","RIM6","RIIM1","RIIM2","RIIM3","RIIM4","RIIM5","RIIM6","RIIIM1","RIIIM2","RIIIM3","RIIIM4","RIIIM5","RIIIM6","RIVM1","RIVM2","RIVM3","RIVM4","RIVM5","RIVM6"};
    String[] bilet22 = {"Normalny 22zł ","Ulgowy 18zł", "Rodzinny 32zł","Seniorski 14zł"};

    ArrayAdapter adapter;

    public Sala3forjokerFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sala3forjoker, container, false);

        Pdalej2 = (Button)view.findViewById(R.id.ButonDalejsala2);
        listass = (ListView)view.findViewById(R.id.sala2miejsca);
        listass2 = (ListView)view.findViewById(R.id.sala2bilet);
        ArrayAdapter<String> listViewAdapter4 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,stringss);
        listass.setAdapter(listViewAdapter4);
        ArrayAdapter<String> listViewAdapter5 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,bilet22);
        listass2.setAdapter((listViewAdapter5));

        Pdalej2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new Email_nazwiskokFragment()).commit();
            }
        });


        return view;
    }



}
