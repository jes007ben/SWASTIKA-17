package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class ec extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecc);
    }

    public void eeecdemone_button(View view) {
        Intent intent=new Intent(getApplicationContext(),ecdemon.class);
        startActivity(intent);
    }

    public void davcihicon_button(View view) {
        Intent intent=new Intent(getApplicationContext(),ecdavnci.class);
        startActivity(intent);
    }

    public void magento_button(View view) {
        Intent intent=new Intent(getApplicationContext(),ecscavencher.class);
        startActivity(intent);
    }
}
