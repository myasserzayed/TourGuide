package com.example.android.tourguide.Restaurants;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.PlacesFragment.Pharaonic.PharaonicAdapter;
import com.example.android.tourguide.PlacesFragment.Pharaonic.PharaonicModel;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    private ArrayList<RestaurantsModel> restsList;
    private RecyclerView restsRV;
    private RestaurantsAdapter restaurantsAdapter;
    private View view;

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        restsRV = view.findViewById(R.id.rest_rv);
        restsList = new ArrayList<>();
        RestaurantsModel rests1 = new RestaurantsModel(R.drawable.prince, getString(R.string.rest_1), getString(R.string.rest_1_add));
        restsList.add(rests1);
        RestaurantsModel rests2 = new RestaurantsModel(R.drawable.ezz_elmnofy, getString(R.string.rest_2), getString(R.string.rest_2_add));
        restsList.add(rests2);
        RestaurantsModel rests3 = new RestaurantsModel(R.drawable.al_refaai, getString(R.string.rest_3), getString(R.string.rest_3_add));
        restsList.add(rests3);
        RestaurantsModel rests4 = new RestaurantsModel(R.drawable.bahha, getString(R.string.rest_4), getString(R.string.rest_4_add));
        restsList.add(rests4);
        RestaurantsModel rests5 = new RestaurantsModel(R.drawable.sobhy_kaber, getString(R.string.rest_5), getString(R.string.rest_5_add));
        restsList.add(rests5);

        restaurantsAdapter = new RestaurantsAdapter(restsList);
        restsRV.setAdapter(restaurantsAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        restsRV.setLayoutManager(layoutManager);

        return view;
    }
}
