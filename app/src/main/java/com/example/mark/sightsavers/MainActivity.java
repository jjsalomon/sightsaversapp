package com.example.mark.sightsavers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button Diseases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Diseases = (Button) findViewById(R.id.button2);

        Diseases.setOnClickListener(this);
    }

    public void donate(View view){
        Intent donateIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://donate.sightsavers.org/smxpatron/ireland/donate.html"));
        startActivity(donateIntent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button2: {
                Intent diseaseIntent = new Intent(this, Diseases.class);
                startActivity(diseaseIntent);

                break;
            }

        }
    }
}
