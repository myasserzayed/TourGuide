package com.example.android.tourguide.Hotels;

public class HotelsModel {
    private int img;
    private String name;
    private String address;

    public HotelsModel(int img, String name, String address) {
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
