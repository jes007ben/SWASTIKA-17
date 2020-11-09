package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class mech extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mech);
    }

    public void mechcadd_button(View view) {
        Intent intent=new Intent(getApplicationContext(),mechcad.class);
        startActivity(intent);
    }


    public void mechcar_button(View view) {
        Intent intent=new Intent(getApplicationContext(),mechcarpar.class);
        startActivity(intent);
    }

    public void pitstop_button(View view) {

        Intent intent=new Intent(getApplicationContext(),mechpiston.class);
        startActivity(intent);
    }
}
