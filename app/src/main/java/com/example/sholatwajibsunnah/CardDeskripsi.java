package com.example.sholatwajibsunnah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sholatwajibsunnah.Controllers.UserControllers;

public class CardDeskripsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_deskripsi);

        Bundle extras = getIntent().getExtras(); //mengambil aktivity sebelumnya
        final int id_masjid = extras.getInt("id"); //get id ziarah dari click

        final String googleMap = "com.google.android.apps.maps";
        final Uri[] gmmIntentUri = new Uri[1];
        final Intent[] mapIntent = new Intent[1];

        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.masjidBanner);
        TextView alamat = (TextView) findViewById(R.id.isi_alamat);
        TextView deskripsi = (TextView) findViewById(R.id.isi_informasi);
        TextView nama = (TextView) findViewById(R.id.masjidNama);

        //ambil sesuai id intent
        final ContentValues data_masjid = UserControllers.getInstance().getDataById(id_masjid);
        Button btn = (Button) findViewById(R.id.kembalimasjid);

        //set img banner
        String url = "@drawable/"+data_masjid.getAsString("gambar");
        int imgResource = getResources().getIdentifier(url,null,getPackageName());
        Drawable imgDrawable =getResources().getDrawable(imgResource);
        imageView.setImageDrawable(imgDrawable);


        nama.setText(data_masjid.getAsString("namatempat"));
        alamat.setText(data_masjid.getAsString("alamattempat"));
        deskripsi.setText(data_masjid.getAsString("deskripsi"));

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(CardDeskripsi.this, MasjidActivity.class);
                startActivity(i);
            }
        });
       // btn.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View v) {
        //        gmmIntentUri[0] = Uri.parse("google.navigation:q="+ data_ziarah.getAsString("clicktovisit"));

          //      mapIntent[0] = new Intent(Intent.ACTION_VIEW,gmmIntentUri[0]);
            //    mapIntent[0].setPackage(googleMap);

              //  if (mapIntent[0].resolveActivity(getPackageManager()) != null){
              //      startActivity(mapIntent[0]);
              //  }else{
              //      Toast.makeText(CardDeskripsi.this,"Google Maps Belum Terinstall",Toast.LENGTH_LONG).show();
              //  }
           // }
       // });

    }
}