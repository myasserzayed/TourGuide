package com.example.android.tourguide.Services.GasStations;

public class GasStationsModel {
    private int img;
    private String name;
    private String address;

    public GasStationsModel(int img, String name, String address) {
        this.img = img;
        this.name = name;
        this.address = address;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
