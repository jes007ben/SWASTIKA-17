package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Onstage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onstage);
    }





    public void infernoo_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Oninfernosignatureevent.class);
        startActivity(intent);
    }

    public void labor_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Onlabrenda.class);
        startActivity(intent);
    }

    public void mrand_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Onmrandmsswastika.class);
        startActivity(intent);
    }

    public void symphoniaa_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Onsymphonia.class);
        startActivity(intent);
    }

    public void swagcrew_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Onswagcrew.class);
        startActivity(intent);
    }


}
