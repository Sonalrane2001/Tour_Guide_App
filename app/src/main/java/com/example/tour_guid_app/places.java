package com.example.tour_guid_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word(R.drawable.station,R.drawable.ic_launcher_background,"Bhusawal Junction Railway Station",R.drawable.ic_launcher_background,"This is nothing but a good architectural Building",R.drawable.ic_launcher_background,"Near nahata college,jamnar road,bhusawal","junction"));
        words.add(new word(R.drawable.dam,R.drawable.ic_launcher_background,"Hatnur Dam",R.drawable.ic_launcher_background,"This is nothing but a good dams places near to Jalgaon city",R.drawable.ic_launcher_background,"Jalgaon,India,49.0 mi from Bhusawal","dam"));
        words.add(new word(R.drawable.dargah,R.drawable.ic_launcher_background,"Dargah-E-Hakimi",R.drawable.ic_launcher_background,"This is nothing but a good dargah and point of Interest & landmarks",R.drawable.ic_launcher_background,"Bhurhampur,India,34.5.0 mi from Bhusawal","dargah"));
        words.add(new word(R.drawable.ajintha,R.drawable.ic_launcher_background,"Ajanta Caves",R.drawable.ic_launcher_background,"This is nothing but a good Caverns & Caves",R.drawable.ic_launcher_background,"Ajanta,India,35.0 mi from Bhusawal","ajanta"));
        words.add(new word(R.drawable.quilla,R.drawable.ic_launcher_background,"Shahi Qilla",R.drawable.ic_launcher_background,"This is nothing but a good Ancient Ruins,points of interest & landmarks",R.drawable.ic_launcher_background,"Burhanpur,India,33.7 mi from Bhusawal","quilla"));
        words.add(new word(R.drawable.muslim,R.drawable.ic_launcher_background,"Gandhi research foundation",R.drawable.ic_launcher_background,"This is nothing but a good libraries,Museums",R.drawable.ic_launcher_background,"Jalgaon,India,16.5 mi from Bhusawal","museums"));

        Word_Adapter Adapter=
                new Word_Adapter(this,words);
        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word w=words.get(position);
                String p=w.getfunctionname();

            }
        });
    }

}