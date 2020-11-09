package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Highligitts extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hihligitts);
    }

    public void inferno_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hginferno.class);
        startActivity(intent);
    }

    public void labernda_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hglabenda.class);
        startActivity(intent);
    }

    public void mr_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgmsandmr.class);
        startActivity(intent);
    }


    public void symphonia_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgsynphonia.class);
        startActivity(intent);
    }

    public void swag_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgswagcrew.class);
        startActivity(intent);
    }

    public void grafittii_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hggrafitti.class);
        startActivity(intent);
    }

    public void voicee_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgvoiceofswas.class);
        startActivity(intent);
    }

    public void bestartisti_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgbestartist.class);
        startActivity(intent);
    }

    public void bestengi_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgbestenginer.class);
        startActivity(intent);
    }

    public void bestactorr_button(View view) {
        Intent intent=new Intent(getApplicationContext(),hgbestactor.class);
        startActivity(intent);
    }
}
