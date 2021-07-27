package com.example.tour_guid_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class after_the_attraction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_the_attraction);
        final ArrayList<image> words=new ArrayList<image>();
        words.add(new image(R.drawable.event1,R.drawable.event2));
        words.add(new image(R.drawable.event3,R.drawable.event4));
        words.add(new image(R.drawable.event5,R.drawable.event6));
        image_adpater Adapter=
                new image_adpater(this,words);
        ListView listView=(ListView) findViewById(R.id.listimage);

        listView.setAdapter(Adapter);
    }
}