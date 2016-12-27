package com.harshitasingla.hindienglishnumbers;

/**
 * Created by Harshita Singla on 26-12-2016.
 */
public class numberActivity {
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mHindi;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mEnglish;

    // Drawable resource ID
    private int mImageResource;

    public numberActivity(String Hindi, String English, int ImageResource)
    {
        mHindi=Hindi;
        mEnglish=English;
        mImageResource=ImageResource;
    }
     public String getmHindi(){
         return mHindi;
     }
    public String getmEnglish(){
        return mEnglish;
    }
    public int getmImageResource(){
        return mImageResource;
    }

}
