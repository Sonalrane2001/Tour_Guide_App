package com.example.tour_guid_app;

import android.widget.ScrollView;

public class attraction {
    private int mImageResourceID=NO_IMAGE_PRVIDED;

    /** Miwok translation for the word */
    private String nameofattra;
    private String functionname;
    private static final int NO_IMAGE_PRVIDED=-1;



    public attraction(int mimagelist, String mnameofattra,String function) {
        mImageResourceID=mimagelist;
        nameofattra=mnameofattra;
        functionname=function;
    }

    /**
     * Get the default translation of the word.
     */
    public int getmImageResourceID() {
        return mImageResourceID;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getNameofattra() {
        return nameofattra;
    }
    public String getFunctionname() {
        return functionname;
    }
    public boolean hasImage()
    {
        return mImageResourceID!=NO_IMAGE_PRVIDED;
    }

}
