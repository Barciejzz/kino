package com.example.kino;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.facebook.login.Login;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ListaMiast extends AppCompatActivity {


    RecyclerView listaKin;
    RecyclerView.LayoutManager layoutManager;
    FirebaseDatabase database;
    DatabaseReference kinoRef,m;
    FirebaseRecyclerAdapter<Miasta,MiastaViewHolder> firebaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_miast);


        listaKin = findViewById(R.id.lista);
        listaKin.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        listaKin.setLayoutManager(layoutManager);
        m = FirebaseDatabase.getInstance().getReference().child("Miasta");

    }


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerOptions options = new FirebaseRecyclerOptions.Builder<Miasta>()
                .setQuery(m,Miasta.class)
                .build();

        firebaseAdapter =
                new FirebaseRecyclerAdapter<Miasta, MiastaViewHolder>(options) {
                    @Override
                    protected void onBindViewHolder(@NonNull final MiastaViewHolder miastaViewHolder,final int i, @NonNull Miasta miasta) {
                        final String id = getRef(i).getKey();

                        m.child(id).addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                String nazwa = dataSnapshot.child("nazwa").getValue().toString();
                                miastaViewHolder.nazwa.setText(nazwa);

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {

                            }
                        });


                        miastaViewHolder.setItemClickListener(new ItemclickListener() {
                            @Override
                            public void onClick(View view, int position, boolean isLongClick) {
                                Dane.nazwa_miasta=miastaViewHolder.nazwa.getText().toString();
                                Intent intent = new Intent(ListaMiast.this, ListaKin.class);
                                startActivity(intent);
                            }
                        });




                    }

                    @NonNull
                    @Override
                    public MiastaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.miastolayout,parent,false);
                        MiastaViewHolder holder = new MiastaViewHolder(view);
                        return holder;
                    }
                };

        listaKin.setAdapter(firebaseAdapter);
        firebaseAdapter.startListening();




    }
}





