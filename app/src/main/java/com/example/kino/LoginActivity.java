package com.example.kino;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.os.Bundle;
import android.widget.Button;

        public class LoginActivity extends AppCompatActivity {

            private Button Wyloguj;
            private Button Dodaj;
            private Button Dodaj_Kino;
            private FirebaseAuth mAuth;
            private FirebaseAuth.AuthStateListener mAuthListener;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                Wyloguj = (Button)findViewById(R.id.P_wyloguj);
                Dodaj = findViewById(R.id.D_miasto);
                Dodaj_Kino = (Button)findViewById(R.id.D_kino);
                mAuth = FirebaseAuth.getInstance();

                Dodaj.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(LoginActivity.this, DodajM.class));
                    }
                });

                Wyloguj.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mAuth.signOut();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }
                    private void signOut() {
                        mAuth.signOut();

                    }
                });



            }
}
