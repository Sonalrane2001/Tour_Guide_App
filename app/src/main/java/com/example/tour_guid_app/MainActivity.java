package com.example.tour_guid_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void places(View v) {
        Intent i = new Intent(this, places.class);
        startActivity(i);
    }
    public void restorant(View v)
    {
        Intent i1= new Intent(this, restorant.class);
        startActivity(i1);
    }
    public void city_tourfunction(View v)
    {
        Intent i3= new Intent(this, city_tour.class);
        startActivity(i3);
    }

    public void event_function(View v)
    {
        Intent i5= new Intent(this, after_the_attraction.class);
        startActivity(i5);
    }
}