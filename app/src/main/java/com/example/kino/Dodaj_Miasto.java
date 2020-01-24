package com.example.kino;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dodaj_Miasto extends Fragment {


    DatabaseReference ref;
    Button button;
    EditText editText;
    View fragment;

    public Dodaj_Miasto()
    {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.activity_dodaj__miasto,container, false);

        super.onCreate(savedInstanceState);
        button = fragment.findViewById(R.id.ButD_miasto);
        editText=fragment.findViewById(R.id.Dod_miasto);
        ref=ref = FirebaseDatabase.getInstance().getReference().child("Miasta");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Dodano Miasto", Toast.LENGTH_LONG).show();
                ref.child(ref.push().getKey()).setValue(new Miasta(editText.getText().toString()));


            }
        });

        return  fragment;
    }



}
