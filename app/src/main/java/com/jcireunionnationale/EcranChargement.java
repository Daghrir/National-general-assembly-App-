package com.jcireunionnationale;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
public class EcranChargement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_chargement);
        //rediriger vers la page d'accueil apres 3 secondes
        Runnable runnable = new Runnable () {
            @Override
            public void run() {
                //demarrer une page
                Intent intent = new Intent (getApplicationContext(), MainActivity.class) ;
                startActivity(intent);
                finish();}
};          //handler post delayed
            new Handler().postDelayed(runnable, 3000);