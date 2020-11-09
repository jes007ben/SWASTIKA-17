package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;


public class Offstagg extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offstagg);
    }

    public void grafitti_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offgraffitti.class);
        startActivity(intent);
    }

    public void offthealmestist_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offthealchemist.class);
        startActivity(intent);
    }

    public void offbestartict_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offbestartist.class);
        startActivity(intent);
    }

    public void offbestactor_button(View view) {
        Intent intent=new Intent(getApplicationContext(),offbestactor.class);
        startActivity(intent);
    }

    public void offbestengine_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offbestengineer.class);
        startActivity(intent);
    }

    public void offneuromancer_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offneuromancer.class);
        startActivity(intent);
    }

    public void offonpointe_button(View view) {
        Intent intent=new Intent(getApplicationContext(),offonpointe.class);
        startActivity(intent);
    }

    public void luckyshot_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offluckyshot.class);
        startActivity(intent);

    }

    public void project_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offprojectexpo.class);
        startActivity(intent);
    }

    public void paperpresentation_button(View view){
    Intent intent=new Intent(getApplicationContext(),Offpaperpresentation.class);
    startActivity(intent);}

    public void againstallods_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offagainistallodds.class);
        startActivity(intent);
    }

    public void facepainting_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offfacepainting.class);
        startActivity(intent);
    }

    public void imagine_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offimagine.class);
        startActivity(intent);
    }

    public void basketball_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Ofbybasketball.class);
        startActivity(intent);
    }

    public void football_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offbyfootball.class);
        startActivity(intent);

    }

    public void jamenglish_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offjamenglish.class);
        startActivity(intent);
    }

    public void jammalayalam_button(View view) {
        Intent intent=new Intent(getApplicationContext(),Offjammalayalam.class);
        startActivity(intent);
    }
}
