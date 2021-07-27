package com.example.tour_guid_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class restorant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restorant);
        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word(R.drawable.tannarika,R.drawable.ic_launcher_background,"Tanarika Resort",R.drawable.ic_launcher_background,"simillar to oyo hotel heaven,Restorant,Bhusawal","tanarika"));
        words.add(new word(R.drawable.hotel1,R.drawable.ic_launcher_background,"OYO 23121 Hotel Galaxy",R.drawable.ic_launcher_background,"Pure veg family Restorant for famly,Bhusawal","galaxy"));
        words.add(new word(R.drawable.radha,R.drawable.ic_launcher_background,"Hotel Radha Krishna,pure veg",R.drawable.ic_launcher_background,"Near saket nagar,both veg and non-veg family Restorant,Bhusawal","radha"));
        words.add(new word(R.drawable.hotel2,R.drawable.ic_launcher_background,"Four season Recreation",R.drawable.ic_launcher_background,"Quallity of food nice okace for famil,Bhusawal","season"));
        words.add(new word(R.drawable.heaven,R.drawable.ic_launcher_background,"Hotel Heaven,pure veg",R.drawable.ic_launcher_background,"Roomservice with OYO facility,Bhusawal","heaven"));
        words.add(new word(R.drawable.primer,R.drawable.ic_launcher_background,"Hotel premier,saket Society",R.drawable.ic_launcher_background,"Near nahata colleg,good food quality,Bhusawal","premier"));

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