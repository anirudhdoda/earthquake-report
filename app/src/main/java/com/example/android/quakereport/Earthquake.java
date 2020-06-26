package com.example.android.quakereport;

public class Earthquake {
    private double mMag;
    private String mLocation;
    private String mDate;
    private String mTime;
    private String mUrl;

    public Earthquake(double mag,String location, String date,String time,String url)
    {
        mMag=mag;
        mLocation=location;
        mDate=date;
        mTime=time;
        mUrl = url;
    }

    public double getmMag() {
        return mMag;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
    public String getmTime() {
        return mTime;
    }
    public String getUrl() {
        return mUrl;
    }
}
