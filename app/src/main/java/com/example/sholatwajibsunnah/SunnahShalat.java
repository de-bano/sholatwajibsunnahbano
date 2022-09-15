package com.example.sholatwajibsunnah;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SunnahShalat extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_sunnah);

        mediaPlayer = MediaPlayer.create(SunnahShalat.this, R.raw.halamanss);
        mediaPlayer.start();

        Button rawatib = (Button) findViewById(R.id.buttonrawatib);
        rawatib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsRawatib.class);
                startActivity(i);

            }
        });

        Button dhuha = (Button) findViewById(R.id.buttondhuha);
        dhuha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsDhuha.class);
                startActivity(i);

            }
        });

        Button tasbih = (Button) findViewById(R.id.buttontasbih);
        tasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsTasbih.class);
                startActivity(i);

            }
        });

        Button tahajud = (Button) findViewById(R.id.buttontahajud);
        tahajud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsTahajud.class);
                startActivity(i);

            }
        });

        Button istikharah = (Button) findViewById(R.id.buttonistikharah);
        istikharah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsIstikharah.class);
                startActivity(i);

            }
        });

        Button gerhana = (Button) findViewById(R.id.buttongerhana);
        gerhana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsGerhana.class);
                startActivity(i);

            }
        });

        Button taubat = (Button) findViewById(R.id.buttontaubat);
        taubat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsTaubat.class);
                startActivity(i);

            }
        });

        Button hajat = (Button) findViewById(R.id.buttonhajat);
        hajat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsHajat.class);
                startActivity(i);

            }
        });

        Button istisqa = (Button) findViewById(R.id.buttonistisqa);
        istisqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, SsIstisqa.class);
                startActivity(i);

            }
        });

        Button gerakanss = (Button) findViewById(R.id.buttongerakanshalats);
        gerakanss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SunnahShalat.this, GerakanSS.class);
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