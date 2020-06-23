package com.example.android.tourguide.Services.SuperMarkets;

public class SuperMarketsModel {
    private int img;
    private String name;
    private String address;

    public SuperMarketsModel(int img, String name, String address) {
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
