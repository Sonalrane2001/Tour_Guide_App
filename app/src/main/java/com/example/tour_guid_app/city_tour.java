package com.example.tour_guid_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class city_tour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_tour);
        final ArrayList<word> words=new ArrayList<word>();
        words.add(new word(R.drawable.travel,R.drawable.ic_launcher_background,"Manish Travels",R.drawable.ic_launcher_background," C.S.M.Complex, Opposite HDFC Bank, Bhusawal, Maharashtra","manish"));
        words.add(new word(R.drawable.travel,R.drawable.ic_launcher_background,"Shrinath Travel Agency PVT. LTD.",R.drawable.ic_launcher_background,"Shop no.2,Chatrapati Shivaji,Complex,Opp.HDFC Bank,Bhusawal, Bhusawal, Maharashtra","shrinath"));
        words.add(new word(R.drawable.travel,R.drawable.ic_launcher_background,"Jadhav Tours & Travels",R.drawable.ic_launcher_background,"Type1 Block No 12/89 O.F, Raver - Bhusawal Hwy, Bhusawal, Maharashtra","jadhav"));
        words.add(new word(R.drawable.travel,R.drawable.ic_launcher_background,"Veena World - Ashwamedh Tourism",R.drawable.ic_launcher_background,"C.S.No. 3877/13014/1 Prasad Palace Kulkarni Plot, Bhusawal, Maharashtra","veena"));
        words.add(new word(R.drawable.travel,R.drawable.ic_launcher_background,"Surana tours and travels",R.drawable.ic_launcher_background,"Jamner Rd, near sai krupa petrol pump, Bhavani Peth, Hanuman Nagar, Bhusawal, Maharashtra ","surana"));
        words.add(new word(R.drawable.travel,R.drawable.ic_launcher_background,"ALucky Travels",R.drawable.ic_launcher_background,"Gadkari Nagar Rd, Usmaniya Colony, Gandhi Nagar, Gadkari Nagar, Bhusawal, Maharashtra","lucky"));

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