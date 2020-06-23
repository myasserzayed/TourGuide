package com.example.android.tourguide.Restaurants;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.RestaurantsViewHolder> {
    private ArrayList<RestaurantsModel> restsList;

    public RestaurantsAdapter(ArrayList<RestaurantsModel> restsList) {
        this.restsList = restsList;
    }

    @NonNull
    @Override
    public RestaurantsAdapter.RestaurantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants_rv_item, parent, false);
        RestaurantsAdapter.RestaurantsViewHolder restaurantsViewHolder = new RestaurantsAdapter.RestaurantsViewHolder(view);
        return restaurantsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RestaurantsAdapter.RestaurantsViewHolder holder, final int position) {
        holder.imgCard.setImageResource(restsList.get(position).getImg());
        holder.txtCard.setText(restsList.get(position).getName());
        holder.addressCard.setText(restsList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return restsList.size();
    }

    public class RestaurantsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCard;
        TextView txtCard, addressCard;

        public RestaurantsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCard = itemView.findViewById(R.id.img_rest);
            txtCard = itemView.findViewById(R.id.text_rest);
            addressCard = itemView.findViewById(R.id.address_rest);
        }
    }
}
