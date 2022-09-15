package com.example.sholatwajibsunnah;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;

import com.example.sholatwajibsunnah.Adapter.CustomAdapter;
import com.example.sholatwajibsunnah.Controllers.UserControllers;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MasjidActivity extends AppCompatActivity {
    private CustomAdapter adapter;
    ActionBar actionBar;
    private List<DaftarMasjid> daftar_masjid;
    RecyclerView recyclerView;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid);

        mediaPlayer = MediaPlayer.create(MasjidActivity.this, R.raw.halamanmasjid);
        mediaPlayer.start();


        daftar_masjid = new ArrayList<>(); // membuat array yang akan dioper ke Class Daftar_ziarah

        Object adminData =  UserControllers.getInstance().getUsers(); // Mengambil dari database dan menyimpan ke admindata

        //Tanda panah kembali
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getDaftar(adminData);//proses pengubahan data

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);

        recyclerView = (RecyclerView) findViewById(R.id.recyledaftar);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new CustomAdapter(this,daftar_masjid);
        recyclerView.setAdapter(adapter);


    }

    private void getDaftar(final Object adminData) { //method perubahan data
        AsyncTask<Integer, Void, Void> task = new AsyncTask<Integer, Void, Void>() {
            @Override
            protected Void doInBackground(Integer... integers) {
                Gson gson = new GsonBuilder().create();
                JsonArray myCustomArray = gson.toJsonTree(adminData).getAsJsonArray(); //mengubah hasil database ke string

                String json = new Gson().toJson(myCustomArray);
                try {
                    JSONArray arrHistory = new JSONArray(json);
                    System.out.println(arrHistory.length());
                    for (int i = 0; i < arrHistory.length(); i++) {

                        JSONObject json_data = arrHistory.getJSONObject(i);
                        JSONObject val = json_data.getJSONObject("mValues");

                        //dibawah inisiasi dari Daftar_ziarah
                        DaftarMasjid data = new DaftarMasjid(
                                val.getInt("_id"),
                                val.getString("gambar"),
                                val.getString("deskripsi"),
                                val.getString("namatempat"),
                                val.getString("clicktovisit"),
                                val.getString("alamattempat")
                        );

                        //menambah data ke daftar ziarah
                        daftar_masjid.add(data);

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                //update adapter
                adapter.notifyDataSetChanged();
            }
        };
        task.execute();
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
