package com.example.android.tourguide.Hotels;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.R;
import com.example.android.tourguide.Restaurants.RestaurantsAdapter;
import com.example.android.tourguide.Restaurants.RestaurantsModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {
    ArrayList<HotelsModel> hotelsList;
    RecyclerView hotelsRV;
    HotelsAdapter hotelsAdapter;
    View view;

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_hotels, container, false);

        hotelsRV = view.findViewById(R.id.hotels_rv);
        hotelsList = new ArrayList<>();
        HotelsModel hotels1 = new HotelsModel(R.drawable.fairmont_hotel, "Fairmont Nile City", "Nile City Towers 2005 B Corniche، El Nil");
        hotelsList.add(hotels1);
        HotelsModel hotels2 = new HotelsModel(R.drawable.le_passage_hotel, "Le Passage", "Sheraton Al Matar");
        hotelsList.add(hotels2);
        HotelsModel hotels3 = new HotelsModel(R.drawable.kempinski_nile_hotel, "Kempinski Nile", "12 Ahmed Ragheb, Qasr El Nil");
        hotelsList.add(hotels3);
        HotelsModel hotels4 = new HotelsModel(R.drawable.four_seasons_hotel, "Four Seasons", "1089 Nile Corniche, El Nil");
        hotelsList.add(hotels4);
        HotelsModel hotels5 = new HotelsModel(R.drawable.royal_maxim_palace_kempinski, "Royal Maxim Palace Kempinski", "Ring Rd, Second New Cairo");
        hotelsList.add(hotels5);

        hotelsAdapter = new HotelsAdapter(hotelsList);
        hotelsRV.setAdapter(hotelsAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        hotelsRV.setLayoutManager(layoutManager);

        return view;
    }
}
