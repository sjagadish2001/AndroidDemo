package com.example.ujm4.androiddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AudioActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        mediaPlayer = MediaPlayer.create(this,R.raw.oldcar);
        mediaPlayer.start();

    }

    public void goBack(View view){
        mediaPlayer.pause();
        Log.i("info","ending audio activity");
        finish();
    }

}
