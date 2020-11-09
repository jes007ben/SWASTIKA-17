package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Depart extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depart);
    }

    public void cse_button(View view) {
        Intent intent=new Intent(getApplicationContext(),cse.class);
        startActivity(intent);
    }

    public void ec_button(View view) {
        Intent intent=new Intent(getApplicationContext(),ec.class);
        startActivity(intent);
    }

    public void eeee_button(View view) {
        Intent intent=new Intent(getApplicationContext(),eeee.class);
        startActivity(intent);
    }

    public void civil_button(View view) {
        Intent intent=new Intent(getApplicationContext(),civil.class);
        startActivity(intent);
    }

    public void mechh_button(View view) {
        Intent intent=new Intent(getApplicationContext(),mech.class);
        startActivity(intent);
    }
}
