package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.VideoView;


public class Splash  extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        try {
            VideoView videoHolder = (VideoView)this.findViewById(R.id.myvideoview);
            Uri video = Uri.parse("android.resource://" + getPackageName()
                    + "/" + R.raw.introo);
            videoHolder.setVideoURI(video);
            videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                public void onCompletion(MediaPlayer mp) {
                    checkIfSignedIn();
                }

            });
            videoHolder.start();
        } catch (Exception ex) {
            checkIfSignedIn();
        }
    }

    public void checkIfSignedIn()
    {
        SharedPreferences app_preferences = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
        boolean isFirstTime = app_preferences.getBoolean("isFirstTime", true);
        if(isFirstTime)
        {
            Intent i=new Intent(getApplicationContext(),Register.class);
            startActivity(i);
            finish();
        }
        else
        {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();
        }
    }
}

