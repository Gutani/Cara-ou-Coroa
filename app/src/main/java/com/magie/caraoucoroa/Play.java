package com.magie.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class Play extends AppCompatActivity {
    private ImageButton playButton, backButton;
    private ImageView imagePlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        playButton = findViewById(R.id.playButton);
        imagePlay = findViewById(R.id.imagePlay);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bundle data = getIntent().getExtras();
                //int number = data.getInt("randomNumber");
                int randomNumber = new Random().nextInt(2);//0 and 1;
               // if(number==0){
                if(randomNumber==0){
                    imagePlay.setImageResource(R.drawable.moeda_cara);
                }else{
                    imagePlay.setImageResource(R.drawable.moeda_coroa);
                }
            }
        });
    }

}