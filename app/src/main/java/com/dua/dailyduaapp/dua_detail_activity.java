package com.dua.dailyduaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

// This Java class controls the dua_detail_activity.xml design
public class dua_detail_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This connects the Java code to your XML design file
        setContentView(R.layout.dua_detail_activity);

        // Finding the views from your XML by their IDs
        TextView nameTv = findViewById(R.id.detName);
        TextView arabicTv = findViewById(R.id.detArabic);
        TextView transTv = findViewById(R.id.detTranslation);
        Button shareBtn = findViewById(R.id.btnShare);

        // Getting the data sent from the Adapter (Step 4)
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String arabic = intent.getStringExtra("arabic");
        String translation = intent.getStringExtra("translation");

        // Setting the received text to our TextViews
        nameTv.setText(name);
        arabicTv.setText(arabic);
        transTv.setText(translation);

        // Share button logic: Sends the Dua as a text message
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = arabic + "\n\n" + translation;
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(shareIntent, "Share Dua via"));
            }
        });
    }
}