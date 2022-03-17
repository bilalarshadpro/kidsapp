package com.devcrew.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        String name = getIntent().getStringExtra("name").toLowerCase();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        ImageView iv = findViewById(R.id.imageView);
        int iid = getResources().getIdentifier(name, "drawable",getPackageName());
        iv.setImageResource(iid);

        int mid = getResources().getIdentifier(name, "raw",getPackageName());
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),mid);
        mp.start();

        ImageView imageView_play = findViewById(R.id.imageview_play);
        imageView_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });


    }
}