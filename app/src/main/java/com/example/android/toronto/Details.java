package com.example.android.toronto;

public class Details {
    private String mName;
    private String mAddress;
    private int mImageResourceId;

    public Details (String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId; }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
