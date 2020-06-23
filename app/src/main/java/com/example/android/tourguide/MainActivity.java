package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Hotels.HotelsFragment;
import com.example.android.tourguide.PlacesFragment.PlacesFragment;
import com.example.android.tourguide.Restaurants.RestaurantsFragment;
import com.example.android.tourguide.Services.ServicesFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView mMenuBar;
    DrawerLayout mDrawerLayout;
    TextView mPlaces, mRests, mHotels, mServices, mPageTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mMenuBar = findViewById(R.id.menu_bar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mPlaces = findViewById(R.id.places_drawer);
        mRests = findViewById(R.id.restaurants_drawer);
        mHotels = findViewById(R.id.hotels_drawer);
        mServices = findViewById(R.id.services_drawer);
        mPageTitle = findViewById(R.id.page_title);

        mMenuBar.setOnClickListener(this);
        mPlaces.setOnClickListener(this);
        mRests.setOnClickListener(this);
        mHotels.setOnClickListener(this);
        mServices.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menu_bar:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.places_drawer:
                loadFragment(new PlacesFragment(), getString(R.string.places_title));
                break;
            case R.id.restaurants_drawer:
                loadFragment(new RestaurantsFragment(), getString(R.string.rests_title));
                break;
            case R.id.hotels_drawer:
                loadFragment(new HotelsFragment(), getString(R.string.hotels_title));
                break;
            case R.id.services_drawer:
                loadFragment(new ServicesFragment(), getString(R.string.services_title));
                break;
        }
    }

    void loadFragment(Fragment fragment, String pageTitle) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container_layout, fragment).commit();
        mDrawerLayout.closeDrawers();
        mPageTitle.setText(pageTitle);
    }
}
