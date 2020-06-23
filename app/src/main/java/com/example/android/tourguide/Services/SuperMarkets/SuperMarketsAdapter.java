package com.example.android.tourguide.Services.SuperMarkets;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

public class SuperMarketsAdapter extends RecyclerView.Adapter<SuperMarketsAdapter.SuperMarketsViewHolder> {
    private ArrayList<SuperMarketsModel> superMarketsList;

    public SuperMarketsAdapter(ArrayList<SuperMarketsModel> superMarketsList) {
        this.superMarketsList = superMarketsList;
    }

    @NonNull
    @Override
    public SuperMarketsAdapter.SuperMarketsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants_rv_item, parent, false);
        SuperMarketsAdapter.SuperMarketsViewHolder superMarketsViewHolder = new SuperMarketsAdapter.SuperMarketsViewHolder(view);
        return superMarketsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final SuperMarketsAdapter.SuperMarketsViewHolder holder, final int position) {
        holder.imgCard.setImageResource(superMarketsList.get(position).getImg());
        holder.txtCard.setText(superMarketsList.get(position).getName());
        holder.addressCard.setText(superMarketsList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return superMarketsList.size();
    }

    public class SuperMarketsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView txtCard, addressCard;

        public SuperMarketsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_rest);
            txtCard = itemView.findViewById(R.id.text_rest);
            addressCard = itemView.findViewById(R.id.address_rest);
        }
    }

}
