package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class cse extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse);
    }
    public void battlefrontier_button(View view) {
        Intent intent=new Intent(getApplicationContext(),csebattlefo.class);
        startActivity(intent);
    }
    public void techrailon_button(View view) {
        Intent intent=new Intent(getApplicationContext(),csetechtra.class);
        startActivity(intent);
    }
    public void progra_button(View view) {
        Intent intent=new Intent(getApplicationContext(),csepearl.class);
        startActivity(intent);
    }
    public void refact_button(View view) {
        Intent intent=new Intent(getApplicationContext(),cserefact.class);
        startActivity(intent);
    }


}
