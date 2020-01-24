package com.example.kino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DodajM extends AppCompatActivity {

    DatabaseReference ref;
    Button button;
    EditText editText;
    View fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_m);
        button = findViewById(R.id.ButD_miasto);
        editText=findViewById(R.id.Dod_miasto);
        ref=ref = FirebaseDatabase.getInstance().getReference().child("Miasta");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Dodano Miasto", Toast.LENGTH_LONG).show();
                ref.child(ref.push().getKey()).setValue(new Miasta(editText.getText().toString()));


            }
        });
    }
}
