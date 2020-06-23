package com.example.android.tourguide.PlacesFragment.Pharaonic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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
public class PharaonicPalcesFragment extends Fragment {
    private ArrayList<PharaonicModel> pharaonicList;
    private RecyclerView pharaonicRV;
    private PharaonicAdapter pharaonicAdapter;
    private View view;

    public PharaonicPalcesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pharaonic_palces, container, false);

        pharaonicRV = view.findViewById(R.id.pharaonic_rv);
        pharaonicList = new ArrayList<>();
        PharaonicModel phar1 = new PharaonicModel(R.drawable.pyramids, getString(R.string.phar_1));
        pharaonicList.add(phar1);
        PharaonicModel phar2 = new PharaonicModel(R.drawable.abu_simbel_temple, getString(R.string.phar_2));
        pharaonicList.add(phar2);
        PharaonicModel phar3 = new PharaonicModel(R.drawable.hatshepsut_temple, getString(R.string.phar_3));
        pharaonicList.add(phar3);
        PharaonicModel phar4 = new PharaonicModel(R.drawable.luxor_temple, getString(R.string.phar_4));
        pharaonicList.add(phar4);
        PharaonicModel phar5 = new PharaonicModel(R.drawable.philae_temple, getString(R.string.phar_5));
        pharaonicList.add(phar5);

        pharaonicAdapter = new PharaonicAdapter(pharaonicList);
        pharaonicRV.setAdapter(pharaonicAdapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        pharaonicRV.setLayoutManager(layoutManager);

        return view;
    }
}
