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

public class attra_adapter extends ArrayAdapter<attraction> {
    public attra_adapter(Activity context, ArrayList<attraction> words)
    {
        super(context,0,words);
    }
    @NonNull

    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attractionlist,parent,false);
        }
        attraction currentWord=getItem(position);
        TextView nameTextView =(TextView) listItemView.findViewById(R.id.attraction_name);
        nameTextView.setText(currentWord.getNameofattra());

        ImageView imageview =(ImageView) listItemView.findViewById(R.id.attraction_image);

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



