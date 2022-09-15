package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GerakanWudhu extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    VideoView  videoView;
    ListView listView;
    ArrayList<String> videolist;
    ArrayAdapter adaptervideogerakan;

    @Override
    public void onCreate(Bundle savedInstanteState) {
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_gerakanwudhu);

        mediaPlayer = MediaPlayer.create(GerakanWudhu.this, R.raw.halamangerakanwudhu);
        mediaPlayer.start();

        videoView = (VideoView) findViewById(R.id.gerakanwudhuvideo);
        listView = (ListView) findViewById(R.id.listview2);

        videolist = new ArrayList<>();
        videolist.add("Membaca Niat dan Bismillah");
        videolist.add("Membasuk Kedua Telapak Tangan");
        videolist.add("Berkumur");
        videolist.add("Membersihkan Hidung");
        videolist.add("Membasuh Wajah");
        videolist.add("Membasuh Kedua Tangan");
        videolist.add("Membasuh Kepala dan Telinga");
        videolist.add("Membasuh Kaki");

        adaptervideogerakan = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videolist);
        listView.setAdapter(adaptervideogerakan);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pertama));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kedua));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ketiga));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.keempat));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kelima));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.keenam));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ketujuh));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kedelapan));
                        break;
                }
                videoView.requestFocus();
                videoView.start();
            }
        });


        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.release();
        finish();
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
