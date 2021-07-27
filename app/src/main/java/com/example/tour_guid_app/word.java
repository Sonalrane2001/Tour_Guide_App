package com.example.tour_guid_app;

public class word {
    private String mnameTranslation;

    /** Miwok translation for the word */
    private String mdistrpiTranslation;
    private String maddressTranslation;
    private  String functionname;
    private int mImageResourceID=NO_IMAGE_PRVIDED;
    private int mnameimage=-1;
    private int mdisciimage;
    private int maddressimage=-1;
    private static final int NO_IMAGE_PRVIDED=-1;


    public word(int imageResource,int nameimage,String nameTranslation,int distriimage,String distrpiTranslation,int addressimage,String addressTranslation,String function) {
        mImageResourceID=imageResource;
        mnameimage=nameimage;
        mnameTranslation=nameTranslation;
        mdisciimage=distriimage;
        mdistrpiTranslation=distrpiTranslation;
        maddressimage=addressimage;
        maddressTranslation=addressTranslation;
        functionname=function;
    }
    public word(int ImageResource,int nameimage,String nameTranslation,int addressimage,String addressTranslation,String function)
    {
        mImageResourceID=ImageResource;
        mnameimage=nameimage;
       mnameTranslation=nameTranslation;
       maddressimage=addressimage;
       maddressTranslation=addressTranslation;
       functionname=function;

    }
    /**
     * Get the default translation of the word.
     */
    public String getMnameTranslation() {
        return mnameTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getMdistrpiTranslation() {
        return mdistrpiTranslation;
    }
    public String getMaddressTranslation() {
        return maddressTranslation;
    }
    public int getmImageResource() {
        return mImageResourceID;
    }
    public int getmnameImage() {
        return mnameimage;
    }
    public int getmdiscriImage() {
        return mdisciimage;
    }
    public int getmadressImage() {
        return maddressimage;
    }
    public String getfunctionname() {
        return functionname;
    }

    public boolean hasImage()
    {
        return mImageResourceID!=NO_IMAGE_PRVIDED;
    }
}
