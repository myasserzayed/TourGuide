package com.example.android.tourguide.PlacesFragment.Islamic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class IslamicPlacesFragment extends Fragment {
    private ArrayList<IslamicModel> islamicList;
    private RecyclerView islamicRV;
    private IslamicAdapter islamicAdapter;
    private View view;

    public IslamicPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_islamic_places, container, false);

        islamicRV = view.findViewById(R.id.islamic_rv);
        islamicList = new ArrayList<>();
        IslamicModel islam1 = new IslamicModel(R.drawable.amr, getString(R.string.islam_1));
        islamicList.add(islam1);
        IslamicModel islam2 = new IslamicModel(R.drawable.bayt_suhaimi, getString(R.string.islam_2));
        islamicList.add(islam2);
        IslamicModel islam3 = new IslamicModel(R.drawable.moez_street, getString(R.string.islam_3));
        islamicList.add(islam3);
        IslamicModel islam4 = new IslamicModel(R.drawable.mohamed_ali, getString(R.string.islam_4));
        islamicList.add(islam4);
        IslamicModel islam5 = new IslamicModel(R.drawable.sultan_hassan, getString(R.string.islam_5));
        islamicList.add(islam5);

        islamicAdapter = new IslamicAdapter(islamicList);
        islamicRV.setAdapter(islamicAdapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        islamicRV.setLayoutManager(layoutManager);

        return view;
    }
}