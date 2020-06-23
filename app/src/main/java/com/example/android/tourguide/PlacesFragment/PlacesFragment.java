package com.example.android.tourguide.PlacesFragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.PlacesFragment.Islamic.IslamicAdapter;
import com.example.android.tourguide.PlacesFragment.Islamic.IslamicPlacesFragment;
import com.example.android.tourguide.PlacesFragment.Pharaonic.PharaonicAdapter;
import com.example.android.tourguide.PlacesFragment.Pharaonic.PharaonicPalcesFragment;
import com.example.android.tourguide.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {
    private ViewPager viewPagerPlaces;
    private TabLayout tabLayoutPlaces;
    private View view;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_places, container, false);
        initViews();
        return view;
    }

    private void initViews() {
        viewPagerPlaces = view.findViewById(R.id.viewPager);
        tabLayoutPlaces = view.findViewById(R.id.tabs);

        PlacesAdapter placesAdapter = new PlacesAdapter(getChildFragmentManager());
        placesAdapter.addFragments(new IslamicPlacesFragment(), getString(R.string.islamic_tab));
        placesAdapter.addFragments(new PharaonicPalcesFragment(), getString(R.string.pharaonic_tab));
        viewPagerPlaces.setAdapter(placesAdapter);
        tabLayoutPlaces.setupWithViewPager(viewPagerPlaces);
    }
}
