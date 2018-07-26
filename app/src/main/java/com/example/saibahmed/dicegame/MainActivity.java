package com.example.saibahmed.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    int[] myDices={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,};

    public void RollTapped(View view){

        Random ran=new Random();
        int randomNumber = ran.nextInt(6);

        ImageView Dice= (ImageView) findViewById(R.id.dice);
        Dice.setImageResource(myDices[randomNumber]);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
