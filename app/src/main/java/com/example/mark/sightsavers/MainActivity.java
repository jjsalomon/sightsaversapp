package com.example.mark.sightsavers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mark.sightsavers.fragment.visionsimulator.Rules;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Diseases;
    Button makingDiff_button;
    Button start_button;
    Button education_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //association with widget
        start_button = (Button)findViewById(R.id.button1);
        education_button = (Button)findViewById(R.id.button2);

        // Find Button Views
        Diseases = (Button) findViewById(R.id.button2);
        makingDiff_button = (Button) findViewById(R.id.making_bt_id);

        // Set Button Listeners
        start_button.setOnClickListener(this);
        Diseases.setOnClickListener(this);
        makingDiff_button.setOnClickListener(this);
    }

    public void donate(View view){
        Intent donateIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://donate.sightsavers.org/smxpatron/ireland/donate.html"));
        startActivity(donateIntent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button1:{
                Intent intent = new Intent(this,Rules.class );
                startActivity(intent);

                break;
            }

            case R.id.button2: {
                Intent diseaseIntent = new Intent(this, Diseases.class);
                startActivity(diseaseIntent);

                break;
            }

            case R.id.making_bt_id:{
                Intent differenceIntent = new Intent(this, MyListActivity.class);
                startActivity(differenceIntent);

                break;
            }
        }
    }
}
