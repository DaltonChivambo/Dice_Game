package com.skycoop.dice_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView dice;

    private int[] number_dice = {
            R.drawable.dice_one,
            R.drawable.dice_two,
            R.drawable.dice_three,
            R.drawable.dice_four,
            R.drawable.dice_five,
            R.drawable.dice_six
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = findViewById(R.id.dice);

        dice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}