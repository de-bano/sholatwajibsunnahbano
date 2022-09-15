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
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class GerakanSS extends AppCompatActivity {

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    VideoView  videoView;
    ListView listView;
    ArrayList<String> videolist;
    ArrayAdapter adaptervideogerakan;

    @Override
    public void onCreate(Bundle savedInstanteState) {
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_gerakanss);

       videoView = (VideoView) findViewById(R.id.gerakanshalatvideo);
       listView = (ListView) findViewById(R.id.listview1);

       videolist = new ArrayList<>();
       videolist.add("Takbiratulihram");
       videolist.add("Ruku");
       videolist.add("Itidal");
       videolist.add("Sujud");
       videolist.add("Duduk Antara 2 Sujud");
       videolist.add("Tashyahhudawal");
       videolist.add("Tashyahhudakhir");

       adaptervideogerakan = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videolist);
       listView.setAdapter(adaptervideogerakan);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             switch (position){
                 case 0:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.takbir));
                     break;
                 case 1:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ruku));
                     break;
                 case 2:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.itidal));
                     break;
                 case 3:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sujud));
                     break;
                 case 4:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.duduk2));
                     break;
                 case 5:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.duduktahiyad));
                     break;
                 case 6:
                     videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.duduktahiyad));
                     break;
             }
             videoView.requestFocus();
             videoView.start();
           }
       });

        mediaPlayer = MediaPlayer.create(GerakanSS.this, R.raw.halaman);
        mediaPlayer.start();

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
