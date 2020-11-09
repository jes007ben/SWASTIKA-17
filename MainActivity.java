package com.example.jessobenthomas.swastika;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();

    }
    public void theme_button(View view) {
        Intent intent=new Intent(getApplicationContext(),theem.class);
        startActivity(intent);
    }
    public void event_button (View view) {
        Intent intent=new Intent(getApplicationContext(),Event.class);
        startActivity(intent);
    }

    public void spon_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Spon.class);
        startActivity(intent);
    }

    public void con_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Connn.class);
        startActivity(intent);
    }
}


