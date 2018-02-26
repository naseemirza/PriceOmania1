package com.example.naseem.priceomania1;

/**
 * Created by Naseem on 07-02-2018.
 */

public class App {
    private String mName,mSite,mPrice;
    private int mImage;
    //private float mPrice;

    public App(String name,String site, String price,int image ){
        mName=name;
        mSite=site;
        mPrice=price;
        mImage=image;

    }
    public String getPrice(){
        return mPrice;
    }
    //  public int getDrawable(){ return mDrawable;}
    public String getName(){return mName;}
    public String getSite(){return mSite;}
    public int getImage(){return mImage;}
}
