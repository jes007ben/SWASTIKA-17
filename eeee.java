package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class eeee extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eeee);
    }

    public void eeebest_button(View view) {
        Intent intent=new Intent(getApplicationContext(),eeebestact.class);
        startActivity(intent);
    }

    public void letcon_button(View view) {
        Intent intent=new Intent(getApplicationContext(),eeelets.class);
        startActivity(intent);
    }

    public void magento_button(View view) {
        Intent intent=new Intent(getApplicationContext(),eeemagento.class);
        startActivity(intent);
    }
}
