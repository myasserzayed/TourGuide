package com.example.android.tourguide.PlacesFragment.Islamic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

public class IslamicAdapter extends RecyclerView.Adapter<IslamicAdapter.IslamicViewHolder> {
    private ArrayList<IslamicModel> islamicList;

    public IslamicAdapter(ArrayList<IslamicModel> islamicList) {
        this.islamicList = islamicList;
    }


    @NonNull
    @Override
    public IslamicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.islamic_rv_item, parent, false);
        IslamicViewHolder islamicViewHolder = new IslamicViewHolder(view);
        return islamicViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final IslamicViewHolder holder, final int position) {
        holder.imgCard.setImageResource(islamicList.get(position).getImg());
        holder.txtCard.setText(islamicList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return islamicList.size();
    }

    public class IslamicViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView txtCard;

        public IslamicViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_card);
            txtCard = itemView.findViewById(R.id.text_card);
        }
    }
}
