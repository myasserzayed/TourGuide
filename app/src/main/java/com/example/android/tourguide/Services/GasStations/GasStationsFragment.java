package com.example.android.tourguide.Services.GasStations;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.R;
import com.example.android.tourguide.Services.SuperMarkets.SuperMarketsAdapter;
import com.example.android.tourguide.Services.SuperMarkets.SuperMarketsModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class GasStationsFragment extends Fragment {
    private ArrayList<GasStationsModel> gasStationsList;
    private RecyclerView gasStationsRV;
    private GasStationsAdapter gasStationsAdapter;
    private View view;

    public GasStationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_gas_stations, container, false);

        gasStationsRV = view.findViewById(R.id.gasStation_rv);
        gasStationsList = new ArrayList<>();
        GasStationsModel gasStation1 = new GasStationsModel(R.drawable.mobil, getString(R.string.gas_1), getString(R.string.gas_1_add));
        gasStationsList.add(gasStation1);
        GasStationsModel gasStation2 = new GasStationsModel(R.drawable.total, getString(R.string.gas_2), getString(R.string.gas_2_add));
        gasStationsList.add(gasStation2);
        GasStationsModel gasStation3 = new GasStationsModel(R.drawable.shell, getString(R.string.gas_3), getString(R.string.gas_3_add));
        gasStationsList.add(gasStation3);

        gasStationsAdapter = new GasStationsAdapter(gasStationsList);
        gasStationsRV.setAdapter(gasStationsAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        gasStationsRV.setLayoutManager(layoutManager);

        return view;
    }
}
