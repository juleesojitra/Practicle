package com.example.retrofeetpractical;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retrofeetpractical.Model.Country;

import java.util.List;

public class DataAdepter extends RecyclerView.Adapter<DataAdepter.Dataholder> {

    Activity activity;
    public static List<Country> list;
    TextToSpeech t1;

    public DataAdepter(MainActivity mainActivity, List<Country> city) {
        activity = mainActivity;
        list = city;
    }

    @NonNull
    @Override
    public Dataholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list, parent, false);
        return new Dataholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Dataholder holder, @SuppressLint("RecyclerView") int position) {

        holder.countryname.setText(list.get(position).getName().getCommon());

        Glide.with(activity).load(list.get(position).getFlags().getPng()).into(holder.logo);

        holder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(activity,countryActivity.class);
                intent.putExtra("position",position);
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Dataholder extends RecyclerView.ViewHolder {
        TextView countryname;
        ImageView logo;

        public Dataholder(@NonNull View itemView) {
            super(itemView);
            countryname = itemView.findViewById(R.id.countryname);
            logo = itemView.findViewById(R.id.logo);
        }
    }
}