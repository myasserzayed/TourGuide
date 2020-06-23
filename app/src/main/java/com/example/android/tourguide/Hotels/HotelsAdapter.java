package com.example.android.tourguide.Hotels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.HotelsViewHolder> {
    private ArrayList<HotelsModel> hotelsList;

    public HotelsAdapter(ArrayList<HotelsModel> hotelsList) {
        this.hotelsList = hotelsList;
    }

    @NonNull
    @Override
    public HotelsAdapter.HotelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants_rv_item, parent, false);
        HotelsAdapter.HotelsViewHolder hotelsViewHolder = new HotelsAdapter.HotelsViewHolder(view);
        return hotelsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final HotelsAdapter.HotelsViewHolder holder, final int position) {
        holder.imgCard.setImageResource(hotelsList.get(position).getImg());
        holder.txtCard.setText(hotelsList.get(position).getName());
        holder.addressCard.setText(hotelsList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return hotelsList.size();
    }

    public class HotelsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView txtCard, addressCard;

        public HotelsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_rest);
            txtCard = itemView.findViewById(R.id.text_rest);
            addressCard = itemView.findViewById(R.id.address_rest);
        }
    }
}
