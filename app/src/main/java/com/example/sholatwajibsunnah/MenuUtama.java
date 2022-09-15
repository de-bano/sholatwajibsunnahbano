package com.example.sholatwajibsunnah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MenuUtama extends AppCompatActivity {
    MediaPlayer audioBackground, mediaPlayer;
    private String server_url;
    private TextView total_pengunjung;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);

        server_url = getResources().getString(R.string.server_url);
        total_pengunjung = (TextView) findViewById(R.id.total_pengunjung);
        getVisitor();

        //tentang
        mediaPlayer = MediaPlayer.create(MenuUtama.this, R.raw.selamat);
        mediaPlayer.start();

        Button wajib = (Button) findViewById(R.id.buttonshalat);
        wajib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuUtama.this, WajibShalat.class);
                startActivity(i);
            }
        });

        Button sunnah = (Button) findViewById(R.id.buttonsunnah);
        sunnah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuUtama.this, SunnahShalat.class);
                startActivity(i);
            }
        });


        Button masjid = (Button) findViewById(R.id.buttonmasjid);
        masjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MenuUtama.this, MasjidActivity.class);
                startActivity(i);
            }
        });

        Button wudhu = (Button) findViewById(R.id.buttonwudhu);
        wudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuUtama.this, WudhuActivity.class);
                startActivity(i);
            }
        });

        Button kentang = (Button) findViewById(R.id.buttontentang);
        kentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuUtama.this, Kentang.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.release();
    }

    private void getVisitor(){
        AsyncTask<Integer, Void, Void> task = new AsyncTask<Integer, Void, Void>() {
            @Override
            protected Void doInBackground(Integer... integers) {
                OkHttpClient client = new OkHttpClient();
                RequestBody body = new FormBody.Builder()
                        .build();
                Request request = new Request.Builder()
                        .url(server_url+"api/view_shalat")
                        .build();

                try {
                    Response response = client.newCall(request).execute();
                    String jsonData = response.body().string();
                    final JSONObject Jobject = new JSONObject(jsonData);
                    String data = Jobject.getString("data");
                    final JSONObject objData = new JSONObject(data);

                    MenuUtama.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                total_pengunjung.setText(objData.getString("total"));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    });


                } catch (IOException | JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        task.execute();
    }


    @Override
    public void onBackPressed() {
        audioBackground = MediaPlayer.create(this, R.raw.suarakeluar);
        audioBackground.setLooping(false);
        audioBackground.setVolume(1, 1);
        audioBackground.start();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Apakah anda yakin ingin keluar?");
        builder.setPositiveButton("Iya", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                audioBackground.stop();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                audioBackground.stop();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}