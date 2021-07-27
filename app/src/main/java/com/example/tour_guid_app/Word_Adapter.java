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

public class Word_Adapter extends ArrayAdapter<word> {
    public Word_Adapter(Activity context, ArrayList<word> words)
    {
        super(context,0,words);
    }
    @NonNull

    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        word currentWord=getItem(position);
        TextView nameTextView =(TextView) listItemView.findViewById(R.id.aname_text_view);
        nameTextView.setText(currentWord.getMnameTranslation());
        TextView disciTextView=(TextView) listItemView.findViewById(R.id.distri_text_view);
        disciTextView.setText(currentWord.getMdistrpiTranslation());
        TextView addTextView=(TextView) listItemView.findViewById(R.id.address_text_view);
        addTextView.setText(currentWord.getMaddressTranslation());
        ImageView imageview =(ImageView) listItemView.findViewById(R.id.image);
        ImageView imageView1=(ImageView) listItemView.findViewById(R.id.image1);
        ImageView imageView2=(ImageView) listItemView.findViewById(R.id.image2);
        ImageView imageView3=(ImageView) listItemView.findViewById(R.id.image3);

        if(currentWord.hasImage()) {
            imageview.setImageResource(currentWord.getmImageResource());
            imageview.setVisibility(View.VISIBLE);
        }
        else {
            imageview.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
