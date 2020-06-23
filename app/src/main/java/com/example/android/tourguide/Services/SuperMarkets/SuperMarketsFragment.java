package com.example.android.tourguide.Services.SuperMarkets;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.PlacesFragment.Islamic.IslamicAdapter;
import com.example.android.tourguide.PlacesFragment.Islamic.IslamicModel;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuperMarketsFragment extends Fragment {
    private ArrayList<SuperMarketsModel> superMarketsList;
    private RecyclerView superMarketsRV;
    private SuperMarketsAdapter superMarketsAdapter;
    private View view;

    public SuperMarketsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_super_markets, container, false);

        superMarketsRV = view.findViewById(R.id.superMarkets_rv);
        superMarketsList = new ArrayList<>();
        SuperMarketsModel superMarket1 = new SuperMarketsModel(R.drawable.carrefour, getString(R.string.market_1), getString(R.string.market_1_add));
        superMarketsList.add(superMarket1);
        SuperMarketsModel superMarket2 = new SuperMarketsModel(R.drawable.metro, getString(R.string.market_2), getString(R.string.market_2_add));
        superMarketsList.add(superMarket2);
        SuperMarketsModel superMarket3 = new SuperMarketsModel(R.drawable.ragab_sons, getString(R.string.market_3), getString(R.string.market_3_add));
        superMarketsList.add(superMarket3);
        SuperMarketsModel superMarket4 = new SuperMarketsModel(R.drawable.seoudi, getString(R.string.market_4), getString(R.string.market_4_add));
        superMarketsList.add(superMarket4);

        superMarketsAdapter = new SuperMarketsAdapter(superMarketsList);
        superMarketsRV.setAdapter(superMarketsAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        superMarketsRV.setLayoutManager(layoutManager);

        return view;
    }
}
