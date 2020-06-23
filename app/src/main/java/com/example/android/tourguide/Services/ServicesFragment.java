package com.example.android.tourguide.Services;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguide.R;
import com.example.android.tourguide.Services.GasStations.GasStationsFragment;
import com.example.android.tourguide.Services.SuperMarkets.SuperMarketsFragment;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ServicesFragment extends Fragment {
    private ViewPager viewPagerServices;
    private TabLayout tabLayoutServices;
    private View view;

    public ServicesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_services, container, false);

        initViews();
        return view;
    }

    private void initViews() {
        viewPagerServices = view.findViewById(R.id.viewPager_services);
        tabLayoutServices = view.findViewById(R.id.tabs_services);

        ServicesAdapter servicesAdapter = new ServicesAdapter(getChildFragmentManager());
        servicesAdapter.addFragments(new SuperMarketsFragment(), getString(R.string.market_tab));
        servicesAdapter.addFragments(new GasStationsFragment(), getString(R.string.gas_tab));
        viewPagerServices.setAdapter(servicesAdapter);
        tabLayoutServices.setupWithViewPager(viewPagerServices);
    }
}
