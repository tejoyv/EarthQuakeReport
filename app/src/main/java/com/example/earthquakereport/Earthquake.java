package com.example.earthquakereport;

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude,String place,long timeInMilliseconds,String url)
    {
        mMagnitude=magnitude;
        mPlace=place;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getUrl(){
        return mUrl;
    }

}
