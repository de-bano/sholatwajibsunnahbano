package com.example.sholatwajibsunnah;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.stetho.Stetho;

import com.example.sholatwajibsunnah.Utils.Database;
import com.example.sholatwajibsunnah.Utils.DatabaseHelper;
import com.example.sholatwajibsunnah.Controllers.UserControllers;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SplashScreen extends Activity {

    private ProgressBar progressBar;
    private TextView persentase;
    private int Value = 0;

    private String server_url;
    private TextView total_pengunjung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        Stetho.initializeWithDefaults(this);
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(
                                Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(
                                Stetho.defaultInspectorModulesProvider(this))
                        .build());
        initiateCoreApp();
        server_url = getResources().getString(R.string.server_url);
        addVisitor();


        progressBar = findViewById(R.id.progress);
        persentase = findViewById(R.id.persentase);
        progressBar.setProgress(0); //Set Progress Dimulai Dari O

        // Handler untuk Updating data pada latar belakang
        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                // Menampung semua data yang ingin diproses oleh thread
                persentase.setText(String.valueOf(Value)+"%");
                if(Value == progressBar.getMax()){
                    Toast.makeText(getApplicationContext(), "Selamat Datang", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SplashScreen.this, MenuUtama.class));
                    finish();
                }
                Value++;
            }
        };

        // Thread untuk updating progress pada ProgressBar di Latar Belakang
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for(int w=0; w<=progressBar.getMax(); w++){
                        progressBar.setProgress(w); // Memasukan Value pada ProgressBar
                        // Mengirim pesan dari handler, untuk diproses didalam thread
                        handler.sendMessage(handler.obtainMessage());
                        Thread.sleep(50); // Waktu Pending 100ms/0.1 detik
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void initiateCoreApp() {
        Database database = new DatabaseHelper(this);
        UserControllers.setDatabase(database);
        attemptRegister();
    }

    private void addVisitor() {
        AsyncTask<Integer, Void, Void> task = new AsyncTask<Integer, Void, Void>() {
            @Override
            protected Void doInBackground(Integer... integers) {
                OkHttpClient client = new OkHttpClient();
                RequestBody body = new FormBody.Builder()
                        .add("phone_id", "-")
                        .build();
                Request request = new Request.Builder()
                        .url(server_url+"api/view_shalat")
                        .post(body)
                        .build();
                System.out.println(request.url());
                try {
                    Response response = client.newCall(request).execute();
                   // response.toString();
                    String jsonData = response.body().string();
                    System.out.println(jsonData);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        task.execute();
    }

    private void attemptRegister() {

        ContentValues content = new ContentValues();
        content.put("gambar", "ashshiddiq");
        content.put("namatempat", "Masjid Ash-Shiddiq");
        content.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1997");
        content.put("alamattempat", "Alamat:  Cikeas Udik, Gunung Putri, Bogor, West Java 16966");
        content.put("clicktovisit","-6.201964, 106.900900");

        ContentValues content2 = new ContentValues();
        content2.put("gambar", "albarokah");
        content2.put("namatempat", "Masjid Al-Barokah");
        content2.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1949");
        content2.put("alamattempat", "Alamat : Babakan 1/1, Kelurahan Babakan Kecamatan Bogor Tengah Kota Bogor");
        content2.put("clicktovisit","-6.263070, 106.863719");

        ContentValues content3 = new ContentValues();
        content3.put("gambar", "masjid");
        content3.put("namatempat", "Masjid An-Nur");
        content3.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1996");
        content3.put("alamattempat", "Alamat: Baranang Siang 05/08, Kelurahan Baranang Siang Kota Bogor");
        content3.put("clicktovisit","-6.285263, 106.901718");

        ContentValues content4 = new ContentValues();
        content4.put("gambar", "masjid");
        content4.put("namatempat", "Masjid Nurul Ikhlas");
        content4.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1996");
        content4.put("alamattempat", "Alamat: Batutulis 03/01, Kelurahan Batutulis Kecamatan Bogor Selatan Kota Bogor");
        content4.put("clicktovisit","-6.229373, 106.903733");

        ContentValues content5 = new ContentValues();
        content5.put("gambar", "masjid");
        content5.put("namatempat", "Masjid Bogor Baru");
        content5.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1985");
        content5.put("alamattempat", "Alamat: Blok C Babakan Kelurahan Babakan Kecamatan Bogor Tengah Kota Bogor");
        content5.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content6 = new ContentValues();
        content6.put("gambar", "masjid");
        content6.put("namatempat", "Masjid Nurul Hidayah");
        content6.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1967");
        content6.put("alamattempat", "Alamat: Kaumsari, Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content6.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content7 = new ContentValues();
        content7.put("gambar", "masjid");
        content7.put("namatempat", "Masjid Al-Hidayah");
        content7.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1980");
        content7.put("alamattempat", "Alamat: Ciheuleut RT 03/06 Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content7.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content8 = new ContentValues();
        content8.put("gambar", "masjid");
        content8.put("namatempat", "Masjid Baitturahman");
        content8.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1980");
        content8.put("alamattempat", "Alamat: KS.Tubun Asrama Brimob, Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content8.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content9 = new ContentValues();
        content9.put("gambar", "masjid");
        content9.put("namatempat", "Masjid Nurul Huda");
        content9.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 2009");
        content9.put("alamattempat", "Alamat: Jl Sukaraja Ciluar Rw 01, Keluruahan Ciluar Bogor Utara Kota Bogor");
        content9.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content10 = new ContentValues();
        content10.put("gambar", "masjid");
        content10.put("namatempat", "Masjid Bogor Baru");
        content10.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1985");
        content10.put("alamattempat", "Alamat: Blok C Babakan Kelurahan Babakan Kecamatan Bogor Tengah Kota Bogor");
        content10.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content11 = new ContentValues();
        content11.put("gambar", "masjid");
        content11.put("namatempat", "Masjid Fatimah Az Zahro");
        content11.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1998");
        content11.put("alamattempat", "Alamat: Pangkalan Raya RT. 02/02, Kel Cibuluh Bogor Utara Kota Bogor");
        content11.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content12 = new ContentValues();
        content12.put("gambar", "masjid");
        content12.put("namatempat", "Masjid Mardhotillah");
        content12.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1958");
        content12.put("alamattempat", "Alamat: Neglasari I RT. 02/04, Kel Cibuluh Bogor Utara Kota Bogor");
        content12.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content13 = new ContentValues();
        content13.put("gambar", "masjid");
        content13.put("namatempat", "Masjid Bogor Baru");
        content13.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1985");
        content13.put("alamattempat", "Alamat: Blok C Babakan Kelurahan Babakan Kecamatan Bogor Utara Kota Bogor");
        content13.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content14 = new ContentValues();
        content14.put("gambar", "masjid");
        content14.put("namatempat", "Masjid Nurul Iman");
        content14.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1999");
        content14.put("alamattempat", "Alamat: Kp Ciheuleut RT.02/06, Kel Cibuluh Bogor Utara Kota Bogor");
        content14.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content15 = new ContentValues();
        content15.put("gambar", "masjid");
        content15.put("namatempat", "Masjid Ash-Sholahiyyah");
        content15.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1994");
        content15.put("alamattempat", "Alamat: Gg Kondang RT.05/08, Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content15.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content16 = new ContentValues();
        content16.put("gambar", "masjid");
        content16.put("namatempat", "Masjid Al-Ittihaad");
        content16.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 2009");
        content16.put("alamattempat", "Alamat: Taman Kenari RW. 10, Kelurahan Ciluar Bogor Utara Kota Bogor");
        content16.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content17 = new ContentValues();
        content17.put("gambar", "masjid");
        content17.put("namatempat", "Masjid Al-Muqarommah");
        content17.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1979");
        content17.put("alamattempat", "Alamat: Jembatan Pari RT.02/03 Kelurahan Ciluar Bogor Utara Kota Bogor");
        content17.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content18 = new ContentValues();
        content18.put("gambar", "masjid");
        content18.put("namatempat", "Masjid At-Taqwa");
        content18.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1998");
        content18.put("alamattempat", "Alamat: Perumahan Bumi Ciluar Indah Jl Soka RT.03/08 Kelurahan Ciluar Bogor Utara Kota Bogor");
        content18.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content19 = new ContentValues();
        content19.put("gambar", "masjid");
        content19.put("namatempat", "Masjid Manbaul Husna");
        content19.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1978");
        content19.put("alamattempat", "Alamat: Komp Perikanan 05/03, Kel Cikaret Bogor Selatan Kota Bogor");
        content19.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content20 = new ContentValues();
        content20.put("gambar", "masjid");
        content20.put("namatempat", "Masjid Al-Wasilatus Sadiah");
        content20.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1930");
        content20.put("alamattempat", "Alamat: Cikaret RT.03/06, Kel Cikaret Bogor Selatan Kota Bogor");
        content20.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content21 = new ContentValues();
        content21.put("gambar", "masjid");
        content21.put("namatempat", "Masjid Al-Hasyim");
        content21.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 2000");
        content21.put("alamattempat", "Alamat: Cikaret Rt.02/07, Kel Cikaret Bogor Selatan Kota Bogor");
        content21.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content22 = new ContentValues();
        content22.put("gambar", "masjid");
        content22.put("namatempat", "Masjid Miftahus Salam");
        content22.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1980");
        content22.put("alamattempat", "Alamat: Cikaret Rt.03/04, Kel Cikaret Bogor Selatan Kota Bogor");
        content22.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content23 = new ContentValues();
        content23.put("gambar", "masjid");
        content23.put("namatempat", "Masjid Ar-Risalah");
        content23.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1950");
        content23.put("alamattempat", "Alamat: Cikaret Rt.05/01, Kel Cikaret Bogor Selatan Kota Bogor");
        content23.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content24 = new ContentValues();
        content24.put("gambar", "masjid");
        content24.put("namatempat", "Masjid Al-Mutmainah");
        content24.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1980");
        content24.put("alamattempat", "Alamat: Cikaret Rt.02/12, Kel Cikaret Bogor Selatan Kota Bogor");
        content24.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content25 = new ContentValues();
        content25.put("gambar", "masjid");
        content25.put("namatempat", "Masjid Sirojul Huda");
        content25.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1945");
        content25.put("alamattempat", "Alamat: Cikaret RT.05/08, Kelurahan Cikaret Bogor Selatan Kota Bogor");
        content25.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content26 = new ContentValues();
        content26.put("gambar", "masjid");
        content26.put("namatempat", "Masjid Nurul Hadis");
        content26.put("deskripsi", "Jenis Masjid Jami, Status tanah SHM, Tahun berdiri 2000");
        content26.put("alamattempat", "Alamat: Cikaret 02/02, Kel Cikaret Bogor Selatan Kota Bogor");
        content26.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content27 = new ContentValues();
        content27.put("gambar", "masjid");
        content27.put("namatempat", "Masjid As-Syifa");
        content27.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1970");
        content27.put("alamattempat", "Alamat: Cikaret 06/08, Kel Cikaret Bogor Selatan Kota Bogor");
        content27.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content28 = new ContentValues();
        content28.put("gambar", "masjid");
        content28.put("namatempat", "Masjid Nurussa'adah");
        content28.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1977");
        content28.put("alamattempat", "Alamat: Kp Batu Hulung Rt. )2/06, Kel Bubulak Bogor Barat Kota Bogor");
        content28.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content29 = new ContentValues();
        content29.put("gambar", "masjid");
        content29.put("namatempat", "Masjid Nurul Anwar");
        content29.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1980");
        content29.put("alamattempat", "Alamat: Kp Babakan Rt. 02/09, Kel Bubulak Bogor Barat Kota Bogor");
        content29.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content30 = new ContentValues();
        content30.put("gambar", "masjid");
        content30.put("namatempat", "Masjid Baitul Yaqin");
        content30.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1974");
        content30.put("alamattempat", "Alamat: Kp Tangkal Rt. 02/05, Kel Bubulak Bogor Barat Kota Bogor");
        content30.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content31 = new ContentValues();
        content31.put("gambar", "masjid");
        content31.put("namatempat", "Masjid Al-Hikmah");
        content31.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1994");
        content31.put("alamattempat", "Alamat: Komp Masjid Al-Hikmah Rw 10, Kelurahan Semplak Bogor Barat Kota Bogor");
        content31.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content32 = new ContentValues();
        content32.put("gambar", "masjid");
        content32.put("namatempat", "Masjid Darussalam");
        content32.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1972");
        content32.put("alamattempat", "Alamat: Kp Pilar 2 Rt. 02/02, Kelelurahan Bubulak Bogor Barat Kota Bogor");
        content32.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content33 = new ContentValues();
        content33.put("gambar", "masjid");
        content33.put("namatempat", "Masjid Ash-Sholahiyyah");
        content33.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1994");
        content33.put("alamattempat", "Alamat: Gg Kondang RT.05/08, Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content33.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content34 = new ContentValues();
        content34.put("gambar", "masjid");
        content34.put("namatempat", "Masjid Ash-Sholahiyyah");
        content34.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1994");
        content34.put("alamattempat", "Alamat: Gg Kondang RT.05/08, Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content34.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content35 = new ContentValues();
        content35.put("gambar", "masjid");
        content35.put("namatempat", "Masjid Al-Amin");
        content35.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1996");
        content35.put("alamattempat", "Alamat: Semplak Pilar Rw 03, Kelelurahan Semplak Bogor Barat Kota Bogor");
        content35.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content36 = new ContentValues();
        content36.put("gambar", "masjid");
        content36.put("namatempat", "Masjid Ash-Sholahiyyah");
        content36.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1994");
        content36.put("alamattempat", "Alamat: Gg Kondang RT.05/08, Kelurahan Cibuluh Bogor Utara Kota Bogor");
        content36.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content37 = new ContentValues();
        content37.put("gambar", "masjid");
        content37.put("namatempat", "Masjid An-Nasrain");
        content37.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1977");
        content37.put("alamattempat", "Alamat: Semplak Seremped 02/05 Bogor Barat Kota Bogor");
        content37.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content38 = new ContentValues();
        content38.put("gambar", "masjid");
        content38.put("namatempat", "Masjid Darul Ma'ruf");
        content38.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1985");
        content38.put("alamattempat", "Alamat: Kp Jawa 02/09, Kel Situ Gede Bogor Barat Kota Bogor");
        content38.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content39 = new ContentValues();
        content39.put("gambar", "masjid");
        content39.put("namatempat", "Masjid Nurul Yaqin");
        content39.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1994");
        content39.put("alamattempat", "Alamat: Jl Cifor Rw 05, Kel Situ Gede Bogor Barat Kota Bogor");
        content39.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content40 = new ContentValues();
        content40.put("gambar", "masjid");
        content40.put("namatempat", "Masjid At-Taufiq");
        content40.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1986");
        content40.put("alamattempat", "Alamat: Cilubang Mekar, Kel Situ Gede Bogor Barat Kota Bogor");
        content40.put("clicktovisit","-6.262456, 106.853593");


        ContentValues content41 = new ContentValues();
        content41.put("gambar", "masjid");
        content41.put("namatempat", "Masjid Nurul Huda Lawa");
        content41.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1974");
        content41.put("alamattempat", "Alamat: Cilubang Lebak 03/01 Kelurahan Situ Gede Bogor Barat Kota Bogor");
        content41.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content42 = new ContentValues();
        content42.put("gambar", "masjid");
        content42.put("namatempat", "Masjid Al-Muhajirin");
        content42.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1985");
        content42.put("alamattempat", "Alamat: SAlabenda Got 03/08, Kelurahan Curug Bogor Barat Kota Bogor");
        content42.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content43 = new ContentValues();
        content43.put("gambar", "masjid");
        content43.put("namatempat", "Masjid Baabussalam");
        content43.put("deskripsi", "Jenis Masjid Jami, Status tanah SHM, Tahun berdiri 1990");
        content43.put("alamattempat", "Alamat: Curug Permai RW 10, Kelurahan Curug Bogor Barat Kota Bogor");
        content43.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content44 = new ContentValues();
        content44.put("gambar", "masjid");
        content44.put("namatempat", "Masjid At-Taqwa");
        content44.put("deskripsi", "Jenis Masjid Jami, Status tanah SHM, Tahun berdiri 2000");
        content44.put("alamattempat", "Alamat: \tCurug 02/04, Kelurahan Curug Bogor Barat Kota Bogor");
        content44.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content45 = new ContentValues();
        content45.put("gambar", "masjid");
        content45.put("namatempat", "Masjid Al-Choeriyah");
        content45.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1980");
        content45.put("alamattempat", "Alamat: Pancasan Atas 01/06, Kelurahan Pasir Jaya Bogor Barat Kota Bogor");
        content45.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content46 = new ContentValues();
        content46.put("gambar", "masjid");
        content46.put("namatempat", "Masjid Al-Islah");
        content46.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1982");
        content46.put("alamattempat", "Alamat: Pancasan 04/07, Kelurahan Pasir Jaya Bogor Barat Kota Bogor");
        content46.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content47 = new ContentValues();
        content47.put("gambar", "masjid");
        content47.put("namatempat", "Masjid At-Taufiq");
        content47.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1986");
        content47.put("alamattempat", "Alamat: Cilubang Mekar, Kel Situ Gede Bogor Barat Kota Bogor");
        content47.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content48 = new ContentValues();
        content48.put("gambar", "masjid");
        content48.put("namatempat", "Masjid Al-Mustarih");
        content48.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1990");
        content48.put("alamattempat", "Alamat: Jl R. Aria Surialaga, Kelurahan PAsir Jaya Bogor Barat Kota Bogor");
        content48.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content49 = new ContentValues();
        content49.put("gambar", "masjid");
        content49.put("namatempat", "Masjid Ar-Ridho");
        content49.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 1989");
        content49.put("alamattempat", "Alamat: Muara Kidul RW 11, Kelurahan Pasir Jaya Bogor Barat Kota Bogor");
        content49.put("clicktovisit","-6.262456, 106.853593");

        ContentValues content50 = new ContentValues();
        content50.put("gambar", "masjid");
        content50.put("namatempat", "Masjid Nurul Falah");
        content50.put("deskripsi", "Jenis Masjid Jami, Status tanah Wakaf, Tahun berdiri 2006");
        content50.put("alamattempat", "Alamat: Komp Pertanian 05/10, Kelurahan Pasir Jaya Bogor Barat Kota Bogor");
        content50.put("clicktovisit","-6.262456, 106.853593");

        UserControllers.getInstance().register(content);
        UserControllers.getInstance().register(content2);
        UserControllers.getInstance().register(content3);
        UserControllers.getInstance().register(content4);
        UserControllers.getInstance().register(content5);
        UserControllers.getInstance().register(content6);
        UserControllers.getInstance().register(content7);
        UserControllers.getInstance().register(content8);
        UserControllers.getInstance().register(content9);
        UserControllers.getInstance().register(content10);
        UserControllers.getInstance().register(content11);
        UserControllers.getInstance().register(content12);
        UserControllers.getInstance().register(content13);
        UserControllers.getInstance().register(content14);
        UserControllers.getInstance().register(content15);
        UserControllers.getInstance().register(content16);
        UserControllers.getInstance().register(content17);
        UserControllers.getInstance().register(content18);
        UserControllers.getInstance().register(content19);
        UserControllers.getInstance().register(content20);
        UserControllers.getInstance().register(content21);
        UserControllers.getInstance().register(content22);
        UserControllers.getInstance().register(content23);
        UserControllers.getInstance().register(content24);
        UserControllers.getInstance().register(content25);
        UserControllers.getInstance().register(content26);
        UserControllers.getInstance().register(content27);
        UserControllers.getInstance().register(content28);
        UserControllers.getInstance().register(content29);
        UserControllers.getInstance().register(content30);
        UserControllers.getInstance().register(content31);
        UserControllers.getInstance().register(content32);
        UserControllers.getInstance().register(content33);
        UserControllers.getInstance().register(content34);
        UserControllers.getInstance().register(content35);
        UserControllers.getInstance().register(content36);
        UserControllers.getInstance().register(content37);
        UserControllers.getInstance().register(content38);
        UserControllers.getInstance().register(content39);
        UserControllers.getInstance().register(content40);
        UserControllers.getInstance().register(content41);
        UserControllers.getInstance().register(content42);
        UserControllers.getInstance().register(content43);
        UserControllers.getInstance().register(content44);
        UserControllers.getInstance().register(content45);
        UserControllers.getInstance().register(content46);
        UserControllers.getInstance().register(content47);
        UserControllers.getInstance().register(content48);
        UserControllers.getInstance().register(content49);
        UserControllers.getInstance().register(content50);

    }
}