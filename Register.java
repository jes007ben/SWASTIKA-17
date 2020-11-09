package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;



public class Register extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

    }

    public void register_button_Click(View view) // Gets called when register button is clicked Don't change arguments of the function
    {
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        SharedPreferences app_preferences = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
        Boolean isFirstTime;
        SharedPreferences.Editor editor = app_preferences.edit();

        isFirstTime = app_preferences.getBoolean("isFirstTime", true);

        if (isFirstTime) {
            editor.putBoolean("isFirstTime", false);
            editor.apply();
            startActivity(intent);
            finish();

        }else{
            startActivity(intent);
            finish();
        }
    }
}
