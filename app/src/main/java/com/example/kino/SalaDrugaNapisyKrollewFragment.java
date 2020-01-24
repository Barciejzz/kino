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


public class SalaDrugaNapisyKrollewFragment extends Fragment {

    View view;
    ListView listas3;
    ListView listas4;
    private Button Pdalej3;

    String[] strings3 = {"RIM1","RIM2","RIM3","RIM4","RIM5","RIM6","RIIM1","RIIM2","RIIM3","RIIM4","RIIM5","RIIM6","RIIIM1","RIIIM2","RIIIM3","RIIIM4","RIIIM5","RIIIM6","RIVM1","RIVM2","RIVM3","RIVM4","RIVM5","RIVM6"};
    String[] bilet3 = {"Normalny 22zł ","Ulgowy 18zł", "Rodzinny 32zł","Seniorski 14zł"};

    ArrayAdapter adapter2;

    public SalaDrugaNapisyKrollewFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sala_druga_napisy_krollew, container, false);

        Pdalej3 = (Button)view.findViewById(R.id.ButonDalej3);
        listas3 = (ListView)view.findViewById(R.id.sala3miejsca);
        listas4 = (ListView)view.findViewById(R.id.sala3bilet);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,strings3);
        listas3.setAdapter(listViewAdapter);
        ArrayAdapter<String> listViewAdapter2 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,bilet3);
        listas4.setAdapter((listViewAdapter2));

        Pdalej3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, new Email_nazwiskokFragment()).commit();
            }
        });

        return view;

    }


}
