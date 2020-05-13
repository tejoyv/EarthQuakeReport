package com.example.earthquakereport;

public class Earthquake {

    private String mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;

    public Earthquake(String magnitude,String place,long timeInMilliseconds)
    {
        mMagnitude=magnitude;
        mPlace=place;
        mTimeInMilliseconds=timeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getPlace() {
        return mPlace;
    }

}
