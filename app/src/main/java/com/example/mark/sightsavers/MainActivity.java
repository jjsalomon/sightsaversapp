package com.example.mark.sightsavers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;


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

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Rules.class );
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Moving to different page", Toast.LENGTH_LONG).show();
            }
        });

        // Find Button Views
        Diseases = (Button) findViewById(R.id.button2);
        makingDiff_button = (Button) findViewById(R.id.making_bt_id);

        // Set Button Listeners
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
