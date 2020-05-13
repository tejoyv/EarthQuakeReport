package com.example.earthquakereport;

public class Earthquake {

    private String mMagnitude;
    private String mPlace;
    private String mDate;

    public Earthquake(String magnitude,String place,String date)
    {
        mMagnitude=magnitude;
        mPlace=place;
        mDate=date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }

    public String getPlace() {
        return mPlace;
    }

}
