package com.example.sholatwajibsunnah.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sholatwajibsunnah.CardDeskripsi;
import com.example.sholatwajibsunnah.DaftarMasjid;
import com.example.sholatwajibsunnah.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private Context context;
    private List<DaftarMasjid> daftar_masjid;

    public CustomAdapter(Context context, List<DaftarMasjid> all_data_event) {
        this.context = context;
        this.daftar_masjid = all_data_event;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_daftar,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.event_name.setText(daftar_masjid.get(position).getNama());
        String url = "@drawable/"+daftar_masjid.get(position).getGambar();
        int imgResource = holder.itemView.getContext().getResources().getIdentifier(url,null,holder.itemView.getContext().getPackageName());
        Drawable imgDrawable = holder.itemView.getContext().getResources().getDrawable(imgResource);
        holder.imageView.setImageDrawable(imgDrawable);

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent (arg0.getContext(), CardDeskripsi.class);
                intent.putExtra("id", daftar_masjid.get(position).getId());
                context.startActivity(intent);
            } });
    }

    @Override
    public int getItemCount() {
        return daftar_masjid.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView event_name;
        public TextView category;
        public TextView start_date;
        public TextView end_date;
        public ImageView imageView;
        public CardView card;

        public ViewHolder(View itemView){
            super(itemView);
            event_name = (TextView) itemView.findViewById(R.id.nama_masjid);
            imageView = (ImageView) itemView.findViewById(R.id.imgMasjid);
            card = (CardView) itemView.findViewById(R.id.daftar_card);

        }
    }
}
