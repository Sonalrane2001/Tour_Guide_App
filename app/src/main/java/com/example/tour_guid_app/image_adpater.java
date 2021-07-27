package com.example.tour_guid_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class image_adpater extends ArrayAdapter<image> {
    public image_adpater(Activity context, ArrayList<image> words)
    {
        super(context,0,words);
    }
    @NonNull

    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.image_list,parent,false);
        }
        image currentWord=getItem(position);
        ImageView imageview =(ImageView) listItemView.findViewById(R.id.image1);

        ImageView imageview1 =(ImageView) listItemView.findViewById(R.id.image2);
        if(currentWord.hasImage1())
        {
            imageview1.setImageResource(currentWord.getmImageResourceId1());
            imageview1.setVisibility(View.VISIBLE);
        }
        else {
            imageview1.setVisibility(View.GONE);
        }
        if(currentWord.hasImage()) {
            imageview.setImageResource(currentWord.getmImageResourceID());
            imageview.setVisibility(View.VISIBLE);
        }
        else {
            imageview.setVisibility(View.GONE);
        }
        return listItemView;
    }
}

