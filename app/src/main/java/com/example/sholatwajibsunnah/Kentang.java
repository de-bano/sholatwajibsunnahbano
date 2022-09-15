package com.example.sholatwajibsunnah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Kentang extends AppCompatActivity {

    Animation atg, atgtwo, btgone, btgtwo, btgthree;
    android.widget.TextView TextView;
    android.webkit.WebView WebView;

    ActionBar actionBar;
    MediaPlayer mediaPlayer;

    @Override
    public void onCreate(Bundle savedInstanteState) {
        super.onCreate(savedInstanteState);
        setContentView(R.layout.activity_kentang);

        ImageView myImageView = (ImageView) findViewById(R.id.gambartentang);
        myImageView.setImageResource(R.drawable.logounindra);


        WebView = findViewById(R.id.webviewsumber);
        String text = //  "konfirmasitimes.com  </br> \n" +
                //  "https://jagad.id </br> \n" +
                //  "https://wisatanabawi.com/doa-iftitah/  </br> \n  " +
                //  "https://kalam.sindonews.com/surah/1/al-fatihah </br> \n" +
                //  "https://kalam.sindonews.com/surah/112/al-ikhlas/ </br> \n" +
                //  "https://www.dream.co.id </br> \n" +
                //  "https://konfirmasitimes.com </br> \n" +
                //  "https://tirto.id \n" +
                //  "https://islam.nu.or.id/ \n" +


                "<h2><b>Nama : AGUNG NUR BANDIONO </p> \n" +

                        "NPM : 201643500939 </p>" +

                        "Prodi : INFORMATIKA  </b></h1>";

        WebView.loadData("<p style=\"text-align: justify\">" + text + "<p>", "text/html", "UTF-8");

        //inisiasi untuk animasi
        TextView = findViewById(R.id.textViewsumber);
        WebView = findViewById(R.id.webviewsumber);
        //load animasi
        btgone = AnimationUtils.loadAnimation(this, R.anim.btgone);
        btgtwo = AnimationUtils.loadAnimation(this, R.anim.btgtwo);
        btgthree = AnimationUtils.loadAnimation(this, R.anim.btgthree);
        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        atgtwo = AnimationUtils.loadAnimation(this, R.anim.atgtwo);

        //animasi
        TextView.startAnimation(btgone);
        WebView.startAnimation(atgtwo);

          mediaPlayer = MediaPlayer.create(Kentang.this, R.raw.halamantentang);
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