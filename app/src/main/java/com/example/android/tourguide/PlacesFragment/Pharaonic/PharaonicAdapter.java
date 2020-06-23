package com.example.android.tourguide.PlacesFragment.Pharaonic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

public class PharaonicAdapter extends RecyclerView.Adapter<PharaonicAdapter.PharaonicViewHolder> {
    private ArrayList<PharaonicModel> pharaonicList;

    public PharaonicAdapter(ArrayList<PharaonicModel> pharaonicList) {
        this.pharaonicList = pharaonicList;
    }


    @NonNull
    @Override
    public PharaonicAdapter.PharaonicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.islamic_rv_item, parent, false);
        PharaonicAdapter.PharaonicViewHolder pharaonicViewHolder = new PharaonicAdapter.PharaonicViewHolder(view);
        return pharaonicViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final PharaonicAdapter.PharaonicViewHolder holder, final int position) {
        holder.imgCard.setImageResource(pharaonicList.get(position).getImg());
        holder.txtCard.setText(pharaonicList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return pharaonicList.size();
    }

    public class PharaonicViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView txtCard;

        public PharaonicViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_card);
            txtCard = itemView.findViewById(R.id.text_card);
        }
    }
}
