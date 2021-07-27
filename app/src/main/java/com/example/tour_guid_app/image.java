package com.example.tour_guid_app;

import android.widget.ScrollView;

public class image {
    private int mImageResourceID=NO_IMAGE_PRVIDED;

    /** Miwok translation for the word */
    private int mImageResourceId1=NO_IMAGE_PRVIDED1;
    private static final int NO_IMAGE_PRVIDED=-1;
    private static final int NO_IMAGE_PRVIDED1=-1;


    public image(int mimagelist, int mimagelist1) {
        mImageResourceID=mimagelist;
       mImageResourceId1=mimagelist1;
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
    public int getmImageResourceId1() {
        return mImageResourceId1;
    }
    public boolean hasImage()
    {
        return mImageResourceID!=NO_IMAGE_PRVIDED;
    }
    public boolean hasImage1()
    {
        return mImageResourceId1!=NO_IMAGE_PRVIDED1;
    }
}
