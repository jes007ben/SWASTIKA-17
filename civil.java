package com.example.jessobenthomas.swastika;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;



public class civil extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil);
    }

    public void ceantrpoy_button(View view) {
        Intent intent=new Intent(getApplicationContext(),ceantr.class);
        startActivity(intent);
    }


    public void cecad_button(View view) {
        Intent intent=new Intent(getApplicationContext(),cecad.class);
        startActivity(intent);
    }





    public void survey_button(View view) {
        Intent intent=new Intent(getApplicationContext(),cesurvey.class);
        startActivity(intent);
    }

    public void instridge_button(View view) {
        Intent intent=new Intent(getApplicationContext(),ceinstridge.class);
        startActivity(intent);
    }
}
