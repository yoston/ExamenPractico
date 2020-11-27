package com.example.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Principal extends AppCompatActivity {
private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        mediaPlayer= MediaPlayer.create(Principal.this,R.raw.music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

    }
    @Override
    protected void onResume(){
        super.onResume();
        mediaPlayer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

}