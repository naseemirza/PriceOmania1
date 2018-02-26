package com.example.naseem.priceomania1;

import java.util.List;

/**
 * Created by Naseem on 07-02-2018.
 */

public class Snap {
    private int mGravity;
    private String mText;
    private List<App> mApps;


    public Snap(int gravity, String text, List<App> apps) {
        mGravity = gravity;
        mText = text;
        mApps = apps;


    }



    public int getGravity() {
        return mGravity;
    }

    public String getText() {
        return mText;
    }

    public List<App> getApps() {
        return mApps;
    }



}
