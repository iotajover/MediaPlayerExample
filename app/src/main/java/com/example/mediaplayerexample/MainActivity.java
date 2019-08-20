package com.example.mediaplayerexample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnPlay, btnStop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button) findViewById(R.id.btn_play);
        btnStop = (Button) findViewById(R.id.btn_stop);
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.cancion);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_play:
                mp.start();
                break;
            case R.id.btn_stop:
                mp.stop();
                break;
        }
    }

}