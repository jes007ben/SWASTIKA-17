package com.example.jessobenthomas.swastika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventt);
    }

    public void high_lights(View view) {
        Intent intent1=new Intent(getApplicationContext(),Highligitts.class);
        startActivity(intent1);
    }

    public void onstage_button(View view) {
        Intent intent2=new Intent(getApplicationContext(),Onstage.class);
        startActivity(intent2);
    }

    public void offstage_button(View view) {
        Intent intent3=new Intent(getApplicationContext(),Offstagg.class);
        startActivity(intent3);
    }

    public void depatement_button(View view) {
        Intent intent4=new Intent(getApplicationContext(),Depart.class);
        startActivity(intent4);
    }

    public void online_button(View view) {
        Intent intent4=new Intent(getApplicationContext(),Online.class);
        startActivity(intent4);
    }
}
