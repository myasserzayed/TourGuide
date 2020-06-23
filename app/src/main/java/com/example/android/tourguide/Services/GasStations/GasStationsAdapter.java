package com.example.android.tourguide.Services.GasStations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

public class GasStationsAdapter extends RecyclerView.Adapter<GasStationsAdapter.GasStationsViewHolder> {
    private ArrayList<GasStationsModel> gasStationsList;

    public GasStationsAdapter(ArrayList<GasStationsModel> gasStationsList) {
        this.gasStationsList = gasStationsList;
    }

    @NonNull
    @Override
    public GasStationsAdapter.GasStationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants_rv_item, parent, false);
        GasStationsAdapter.GasStationsViewHolder gasStationsViewHolder = new GasStationsAdapter.GasStationsViewHolder(view);
        return gasStationsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final GasStationsAdapter.GasStationsViewHolder holder, final int position) {
        holder.imgCard.setImageResource(gasStationsList.get(position).getImg());
        holder.txtCard.setText(gasStationsList.get(position).getName());
        holder.addressCard.setText(gasStationsList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return gasStationsList.size();
    }

    public class GasStationsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView txtCard, addressCard;

        public GasStationsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_rest);
            txtCard = itemView.findViewById(R.id.text_rest);
            addressCard = itemView.findViewById(R.id.address_rest);
        }
    }

}
