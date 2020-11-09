package com.example.jessobenthomas.swastika;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by JESSO BEN THOMAS on 2/5/2017.
 */

public class Offimagine extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.offimagine);
    }
  public void register_button(View view) {
        Uri uri = Uri.parse("http://www.swastika17.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
}

