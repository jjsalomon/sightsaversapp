package com.example.mark.sightsavers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donate(View view){
        Intent donateIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://donate.sightsavers.org/smxpatron/ireland/donate.html"));
        startActivity(donateIntent);
    }
}
