package com.example.sholatwajibsunnah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class WajibShalat extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wajib);

        mediaPlayer = MediaPlayer.create(WajibShalat.this, R.raw.halamansw);
        mediaPlayer.start();




        Button subuh = (Button) findViewById(R.id.buttonsubuh);
        subuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WajibShalat.this, ShalatSubuh.class);
                startActivity(i);

            }
        });

        Button dzuhur = (Button) findViewById(R.id.buttondzuhur);
        dzuhur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WajibShalat.this, ShalatDzuhur.class);
                startActivity(i);

            }
        });

        Button ashar = (Button) findViewById(R.id.buttonashar);
        ashar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WajibShalat.this, ShalatAshar.class);
                startActivity(i);

            }
        });

        Button magrib = (Button) findViewById(R.id.buttonmagrib);
        magrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WajibShalat.this, ShalatMagrib.class);
                startActivity(i);

            }
        });

        Button isya = (Button) findViewById(R.id.buttonisya);
        isya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WajibShalat.this, ShalatIsya.class);
                startActivity(i);

            }
        });

        Button gerakansw = (Button) findViewById(R.id.buttongerakanshalatw);
        gerakansw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WajibShalat.this, GerakanSW.class);
                startActivity(i);

            }
        });

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.release();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}