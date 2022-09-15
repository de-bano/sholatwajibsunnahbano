package com.example.sholatwajibsunnah;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class WudhuActivity extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    @Override
    public void onCreate (Bundle savedInstanteState){
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_wudhu);

        mediaPlayer = MediaPlayer.create(WudhuActivity.this, R.raw.halamanwudhu);
        mediaPlayer.start();


        Button rawatib = (Button) findViewById(R.id.buttonwudhuinformasi);
        rawatib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WudhuActivity.this, WudhuInformasi.class);
                startActivity(i);

            }
        });

        Button gerakanwudhu = (Button) findViewById(R.id.buttongerakanwudhu);
        gerakanwudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WudhuActivity.this, GerakanWudhu.class);
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
