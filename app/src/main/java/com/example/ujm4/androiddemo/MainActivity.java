package com.example.ujm4.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayHello(View view){
        Log.i("info","button clicked");
        Intent intent = new Intent(this, HelloActivity.class);
        startActivity(intent);
    }

    public void playSound(View view){
        Log.i("info","button clicked");
        Intent intent = new Intent(this, AudioActivity.class);
        startActivity(intent);

    }

    public void playVideo(View view){
        Log.i("info","button clicked");
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);

    }
}
