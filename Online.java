package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Online extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.online);
    }




    public void onlinesinger_button(View view) {
        Intent intent=new Intent(getApplicationContext(),onsing.class);
        startActivity(intent);
    }

    public void selfi_button(View view) {
        Intent intent=new Intent(getApplicationContext(),onself.class);
        startActivity(intent);
    }

    public void troll_button(View view) {
        Intent intent=new Intent(getApplicationContext(),troll.class);
        startActivity(intent);
    }

    public void unclick_button(View view) {
        Intent intent=new Intent(getApplicationContext(),onunc.class);
        startActivity(intent);
    }
}